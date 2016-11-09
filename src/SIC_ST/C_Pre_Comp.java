/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIC_ST;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.naming.ldap.HasControls;

/**
 *
 * @author devcrack
 */
public class C_Pre_Comp {

    private String program_Counter;
    private List<String> total_CP;
    private Map<String, String> tab_Simb;
    private boolean flag;
    private List<String> object_code;
    private String nom_program;
    private int index_ob_code;
    private String has_end_dir;

    public C_Pre_Comp() {
        this.program_Counter = "";
        this.total_CP = new ArrayList<String>();
        this.tab_Simb = new HashMap<String, String>();
        this.object_code = new ArrayList<String>();
        //this.object_codes = new LinkedHashMap<String, String> ();
        this.flag = false;
        this.nom_program = "";
        this.index_ob_code = 0;
        this.has_end_dir = null;
    }

    /**
     * Obtiene el contador de programa
     *
     * @return Contador de Programa.
     */
    public String getProgram_Counter() {
        return program_Counter;
    }

    /**
     * Establece el valor del contador de programa.
     *
     * @param program_Counter valor con el que se va a establecer el contador de
     * programa.
     */
    public void setProgram_Counter(String program_Counter) {
        this.program_Counter = program_Counter;
    }

    /**
     * @return the total_CP
     */
    public List<String> getTotal_CP() {
        return total_CP;
    }

    /**
     * @param total_CP the total_CP to set
     */
    public void setTotal_CP(List<String> total_CP) {
        this.total_CP = total_CP;
    }

    /**
     * @return the tab_Simb
     */
    static public int calc_Hex(int n) {
        return Integer.valueOf(String.valueOf(n), 16);
    }

    /**
     * @return the flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /**
     * @return the object_code
     */
    public List<String> getObject_code() {
        return object_code;
    }

    /**
     * @param object_code the object_code to set
     */
    public void setObject_code(List<String> object_code) {
        this.object_code = object_code;
    }

    private String generate_Header() {
        String str = "";

        str += "H";
        str += this.get_adjust(this.nom_program, true);   //Adjusting the name to at size to be required.
        str += this.get_adjust(this.getTotal_CP().get(0), false); //Adjusting the program counter to at size to be required.
        int end_val = Integer.parseInt(this.total_CP.get(this.getTotal_CP().size() - 1), 16);
        int start_val = Integer.parseInt(this.total_CP.get(0), 16);
        str += this.get_adjust(Integer.toHexString(end_val - start_val), false);
        this.index_ob_code++;

        return str;
    }

    private String generate_register_T() {
        String str = "";

//        do {
        //      }while()
        str += "T";
        //str += this.get_adjust(str, 0, flag)

        return str;
    }

    /**
     *
     * @param str
     * @param op 0adjust the name program, 1 adjust the program counter, 2
     * adjust the size of program
     * @param is_tag
     * @return
     */
    private String get_adjust(String str, boolean is_tag) {
        String nw_str = "";

        if (is_tag) {
            if (str.length() >= 6) {
                nw_str += this.nom_program.substring(0, 5);
                return nw_str;
            }
        }
        for (int i = str.length(); i < 6; i++) {
            nw_str = (is_tag) ? nw_str + " " : nw_str + "0";
        }
        if (is_tag)
            return str + nw_str;
         else 
            return nw_str + str;
    }

    /**
     * @return the nom_program
     */
    public String getNom_program() {
        return nom_program;
    }

    /**
     * @param nom_program the nom_program to set
     */
    public void setNom_program(String nom_program) {
        this.nom_program = nom_program;
    }

    /**
     * @return the tab_Simb
     */
    public Map<String, String> getTab_Simb() {
        return tab_Simb;
    }

    /**
     * @param tab_Simb the tab_Simb to set
     */
    public void setTab_Simb(Map<String, String> tab_Simb) {
        this.tab_Simb = tab_Simb;
    }

    public String generate_reg() throws IOException {
        int has_next = 0;
        String str = "";
        String src_path = "";
        
        try {
            FileWriter fw = new FileWriter("./" + this.nom_program + ".obj");
            BufferedWriter bw = new BufferedWriter(fw);
            
            src_path = "./" + this.nom_program + ".obj";
            
            bw.newLine();

            while (has_next < this.object_code.size()) {
                switch (this.get_type_expr(has_next)) {
                    case 0:
                        str = this.generate_Header();
                        bw.write(str);
                        bw.newLine();
                        str = "";
                        break;
                    case 1:
                        if (str.length() == 0) {
                            this.index_ob_code = has_next;
                        }
                        str += this.object_code.get(has_next);
                        break;
                    case 2:
                        if (str.length() > 0) {
                            str = this.generate_TRegister(str, has_next);
                            bw.write(str);
                            bw.newLine();
                            str = "";
                            this.index_ob_code = 0;
                        }
                        break;
                    case 3:
                        if (str.length() > 0) {
                            str = this.generate_TRegister(str, has_next);
                            bw.write(str);
                            bw.newLine();
                            str = "";
                            this.index_ob_code = 0;
                        }
                        str = this.generate_REnd();
                        bw.write(str);
                        bw.newLine();
                        break;
                }
                has_next++;
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return src_path;
    }

    private Integer get_type_expr(int index) {
        String expr = this.object_code.get(index);

        if (expr.contains("START")) {
            return 0;
        } else if (this.object_code.get(index).matches("[0-9a-fA-F]+")) //Determine whether is object code
        {
            return 1;
        } else if (expr.contains("RESB") || expr.contains("RESW")) {
            return 2;
        } else if (expr.contains("END")) {
            return 3;
        }
        return -1;
    }

    private String generate_TRegister(String ac, int index) {
        int size_hex = ac.length() / 2 + ac.length() % 2;
        String nw_str = "T";

        nw_str += this.get_adjust(this.total_CP.get(this.index_ob_code), false);
        nw_str += Integer.toHexString(size_hex) + ac;

        return nw_str;
    }

    private String generate_REnd() {
        String nw_str = "E";
        nw_str = (this.has_end_dir != null) ? nw_str + this.get_adjust(this.has_end_dir, false) : nw_str + this.get_adjust(this.total_CP.get(0), false);

        return nw_str;
    }

    /**
     * @return the has_end_dir
     */
    public String getHas_end_dir() {
        return has_end_dir;
    }

    /**
     * @param has_end_dir the has_end_dir to set
     */
    public void setHas_end_dir(String has_end_dir) {
        this.has_end_dir = has_end_dir;
    }
}

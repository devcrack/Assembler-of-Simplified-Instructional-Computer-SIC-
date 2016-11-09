/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
/**
 * Imports Propiamente exclusivos de ANTLR y para la construccion del
 * Ensamblador
 */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import Lexer_Parser.*;
import java.io.FileInputStream;
import Analizador_Errores.C_Errors;
import SIC_ST.C_Pre_Comp;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.security.ProtectionDomain;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author devcrack
 */
public class Program_UI extends javax.swing.JFrame {

    /**
     * Flujo de Caracteres que contiene el Codigo Fuente. Character stream that
     * contains source code.
     */
    private InputStream main_Stream;
    private ANTLRInputStream input_ANTLR;
    private ParseTree tree_ANTLR;
    private Gram_SICLexer lexer;
    private CommonTokenStream tokens;
    private Gram_SICParser parser;
    private String file_path;
    
    C_Errors error = new C_Errors();
    C_Pre_Comp compiler_chafa = new C_Pre_Comp();

    /**
     * Creates new form Program_UI
     */
    public Program_UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1_Erro = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_txt_Number_Line = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        j_txt_source_Code = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        j_txt_cp = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtxtcodob = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jText_Errores = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Save = new javax.swing.JMenuItem();
        jSICST = new javax.swing.JMenu();
        menuItemAssembler = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmenu_Gen_Reg = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jScrollPane5.setViewportView(jTextPane1_Erro);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Load_WIndow(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Programa SIC ST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        j_txt_Number_Line.setEditable(false);
        j_txt_Number_Line.setColumns(20);
        j_txt_Number_Line.setRows(5);
        j_txt_Number_Line.setToolTipText("Numero de Lineas");
        j_txt_Number_Line.setAutoscrolls(false);
        j_txt_Number_Line.setFocusable(false);
        jScrollPane1.setViewportView(j_txt_Number_Line);
        j_txt_Number_Line.getAccessibleContext().setAccessibleName("");

        j_txt_source_Code.setColumns(20);
        j_txt_source_Code.setRows(5);
        j_txt_source_Code.setAutoscrolls(false);
        jScrollPane2.setViewportView(j_txt_source_Code);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("#NL");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Programa Fuente");

        j_txt_cp.setColumns(20);
        j_txt_cp.setRows(5);
        j_txt_cp.setToolTipText("Contador de Programa");
        j_txt_cp.setAutoscrolls(false);
        j_txt_cp.setEnabled(false);
        j_txt_cp.setFocusable(false);
        jScrollPane4.setViewportView(j_txt_cp);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("CP");

        jtxtcodob.setColumns(20);
        jtxtcodob.setRows(5);
        jtxtcodob.setEnabled(false);
        jScrollPane7.setViewportView(jtxtcodob);

        jLabel4.setText("Codigo Objeto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de Simbolos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Simbolo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Errores"));

        jText_Errores.setColumns(20);
        jText_Errores.setRows(5);
        jScrollPane6.setViewportView(jText_Errores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu2.setText("File");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator1);

        jMenuItem_Save.setText("Guardar");
        jMenuItem_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SaveActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Save);

        jMenuBar1.add(jMenu2);

        jSICST.setText("SIC ST");
        jSICST.setEnabled(false);

        menuItemAssembler.setText("Assembly");
        menuItemAssembler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAssemblerActionPerformed(evt);
            }
        });
        jSICST.add(menuItemAssembler);
        jSICST.add(jSeparator2);

        jmenu_Gen_Reg.setText("Registers");
        jmenu_Gen_Reg.setToolTipText("");
        jmenu_Gen_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_Gen_RegActionPerformed(evt);
            }
        });
        jSICST.add(jmenu_Gen_Reg);

        jMenuBar1.add(jSICST);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JFileChooser j_FChoser = new JFileChooser();
        int cont = 0;
        String str_2;
        
        j_FChoser.setCurrentDirectory(new File("./test/Archivos_Prueba"));
        j_FChoser.showOpenDialog(this);      
        File f = j_FChoser.getSelectedFile();
        FileReader f_Reader = null;
        InputStream input_Stream = null;

        if (f != null) {
            try {
                f_Reader = new FileReader(f);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            BufferedReader lee = new BufferedReader(f_Reader);

            try {
                this.j_txt_source_Code.setText(null);
                this.j_txt_cp.setText(null);
                this.j_txt_Number_Line.setText(null);
                this.jtxtcodob.setText(null);
                while ((str_2 = lee.readLine()) != null) {
                    this.j_txt_source_Code.append(str_2 + "\n");
                    this.j_txt_Number_Line.append(Integer.toString(cont) + "\n");
                    cont++;
                }
                try {
                    input_Stream = new FileInputStream(j_FChoser.getSelectedFile());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Program_UI.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.input_ANTLR = new ANTLRInputStream(input_Stream);
                this.lexer = new Gram_SICLexer(this.input_ANTLR);
                this.tokens = new CommonTokenStream(lexer);
                this.parser = new Gram_SICParser(this.tokens);
                this.lexer.removeErrorListeners();
                this.parser.removeErrorListeners();
                this.parser.addErrorListener(error);
                this.tree_ANTLR = parser.prog();
                if (error.hasErrors()) {                    
                    this.jText_Errores.setText(error.toString());
                    JOptionPane.showMessageDialog(this, "Su programa tiene Errores");
                } else {
                    this.compiler_chafa = new C_Pre_Comp();
                    this.jSICST.setEnabled(true);
                    JOptionPane.showMessageDialog(this, "NO Errores");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Load_WIndow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Load_WIndow
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }//GEN-LAST:event_Load_WIndow

    /**
     * This method that's activate when press the option Assembly at menu.
     *
     * @param evt
     */
    private void menuItemAssemblerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAssemblerActionPerformed
        ObjCode_Generate obCode = new ObjCode_Generate(compiler_chafa); //flag in false for indicate that we 
        //want just want generate the symbol table
        obCode.visit(tree_ANTLR);
        for (Iterator<String> iterator = this.compiler_chafa.getTotal_CP().iterator(); iterator.hasNext();) {
            this.j_txt_cp.append(iterator.next() + "\n");
        }
        this.compiler_chafa.setFlag(true);               //Set true for indicate that we want generate 
        obCode.visit(tree_ANTLR);                        // the object code.
        for (Iterator<String> i = this.compiler_chafa.getObject_code().iterator(); i.hasNext();) {
            this.jtxtcodob.append(i.next() + "\n");
        }
        this.jmenu_Gen_Reg.enable(true);
        try {
            this.file_path = this.compiler_chafa.generate_reg();
        } catch (IOException ex) {
            Logger.getLogger(Program_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemAssemblerActionPerformed

    
    /**
     * Fil
     * @param evt 
     */
    private void jMenuItem_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SaveActionPerformed
        JFileChooser j_file_save = new JFileChooser();

        j_file_save.setApproveButtonText("Guardar");
        j_file_save.setCurrentDirectory(new File("./test/Archivos_Prueba"));
        if (j_file_save.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = j_file_save.getSelectedFile();
            
            if (!file.getName().endsWith(".sic")) {
                
                file = new File(file.getAbsolutePath() + ".sic");
            }
            BufferedWriter out_file = null;
            
            try {
                out_file = new BufferedWriter(new FileWriter(file));
                this.j_txt_source_Code.write(out_file);

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (out_file != null) {
                    try {
                        out_file.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

        }

    }//GEN-LAST:event_jMenuItem_SaveActionPerformed

    /**
     * Generates it the dialog  for view the registers
     * @param evt 
     */
    private void jmenu_Gen_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_Gen_RegActionPerformed
        jDialog_Registers dialog;
        dialog = new jDialog_Registers(this, rootPaneCheckingEnabled, this.file_path);
         dialog.show();
    }//GEN-LAST:event_jmenu_Gen_RegActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Program_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        C_Pre_Comp data_Compiler = new C_Pre_Comp();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program_UI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_Save;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu jSICST;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1_Erro;
    private javax.swing.JTextArea jText_Errores;
    private javax.swing.JTextArea j_txt_Number_Line;
    private javax.swing.JTextArea j_txt_cp;
    private javax.swing.JTextArea j_txt_source_Code;
    private javax.swing.JMenuItem jmenu_Gen_Reg;
    private javax.swing.JTextArea jtxtcodob;
    private javax.swing.JMenuItem menuItemAssembler;
    // End of variables declaration//GEN-END:variables
}

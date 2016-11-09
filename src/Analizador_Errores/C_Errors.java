/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador_Errores;
/**
 *
 * @author devcrack
 */


import java.util.ArrayList;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author devcrack
 */
public class C_Errors extends BaseErrorListener {

    ArrayList<Syntax_Error_Item> errores;

     public C_Errors()
    {
	this.errores = new ArrayList<Syntax_Error_Item>();
    }
    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line, 
            int charPositionInLine,
            String msg,
            RecognitionException e
    ) {
        errores.add(new Syntax_Error_Item(line, charPositionInLine));
    }

    public boolean hasErrors() {
        return this.errores.size() > 0;
    }

    @Override
    public String toString() {
        // System.out.println("ERRORES SINTACTICOS"); 
        StringBuilder builder = new StringBuilder();
        for (Syntax_Error_Item s : errores) {
            builder.append(s.toString());
        }
        return builder.toString();
        // return "ERRORES SINTACTICOS"; // 

    }
}

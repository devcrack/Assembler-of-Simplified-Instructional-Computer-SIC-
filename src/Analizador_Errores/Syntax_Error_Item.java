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
public class Syntax_Error_Item {

    private int line;

    private int column;

    Syntax_Error_Item(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public String toString() {
        return new String("Error Sintactico: Linea:" + line + "EN:" + column + "\n");
    }
}

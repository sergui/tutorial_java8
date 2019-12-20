/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos;

import javax.swing.JOptionPane;

/**
 *
 * @author Desktop
 */
public class operadores {
    public static void main(String[] args) {
        //  ==,!=, <,>, >=,<= operadores relacionales
        // operadores logicos AND &&, OR ||,  NOT !
        
        boolean comparacion=20!=22; // aca aplicar ==,!=, <,>, >=,<=
        JOptionPane.showMessageDialog(null,comparacion);
        
        boolean comparacion1=!(22==22)&& !(10==10); // APLICAR AND &&, OR ||,  NOT !
        JOptionPane.showMessageDialog(null,comparacion1);
        
    }
    
}

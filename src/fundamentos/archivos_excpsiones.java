/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_java;

import javax.swing.JOptionPane;

/**
 *
 * @author sergui
 */
public class archivos_excpsiones {

    public static void main(String[] args) {
        
        try 
        {
            System.out.println(numero);
        } catch (Exception e) 
        {
            System.out.println("existe un error");
            JOptionPane.showMessageDialog(null,"hay un error\n"+e);
        }
        
        
    }

}

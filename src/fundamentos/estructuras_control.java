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
public class estructuras_control {
    public static void main(String[] args) {
        int num=3;
        String letra="a";
        /*if (letra=="e" || num>11) {
            JOptionPane.showMessageDialog(null,"si cumple la condicion");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"noo cumple la condicion");
        }*/
        
        switch(num)
        {
            case 1:JOptionPane.showMessageDialog(null,"el valor es uno");
                   break;
            case 2:JOptionPane.showMessageDialog(null,"el valor es dos");
            break;
            case 3:JOptionPane.showMessageDialog(null,"el valor es tres");
            break;
            default :JOptionPane.showMessageDialog(null,"el valor no esta");
            
                
        }
    }
}

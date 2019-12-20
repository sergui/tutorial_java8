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
public class operaciones_matematicas {
    public static void main(String[] args) {
        float x=1.5F,y=0F,z=1F;
        float res1,res2;
        res1=((20*x)*(2*y))-x;
        res2=(8*x-2*y+2*z)/x*y*z;
        JOptionPane.showMessageDialog(null, res1);
        JOptionPane.showMessageDialog(null, res2);
        
    }
            
}

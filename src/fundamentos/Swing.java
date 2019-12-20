/*
ventanas en java
 */

package fundamentos;

import javax.swing.*;


public class Swing {
    public static void main(String[] args) {
        
        String var;
        String var1="quispe";
        
        
        //JOptionPane.showMessageDialog(null, "mi nombre es: "+var+" y apellido :"+var1);
        var=JOptionPane.showInputDialog("cual es tu nombre");
        JOptionPane.showMessageDialog(null, "tu nombre es: "+var);
        
        String var2;
        int edad;
        var2=JOptionPane.showInputDialog("cual es tu edad1?");
        edad=Integer.parseInt(var2);
        JOptionPane.showMessageDialog(null, "tu edad1 es: "+(edad+1));
        
        //}RESUMIENDO EL CODIGO ANTERIOR
        
        int edad2=Integer.parseInt(JOptionPane.showInputDialog("cual es tu edad2?"));
        JOptionPane.showMessageDialog(null, "tu edad2 es: "+(edad2+1));
        
        //convertir datos de string a float o decimales
        
        float edad3=Float.parseFloat(JOptionPane.showInputDialog("cual es tu edad3?"));
        JOptionPane.showMessageDialog(null, "tu edad3 es: "+(edad3+1));
    }
    
}

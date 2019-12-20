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
public class funciones {
    void mifuncion(int num1,int num2)
    {
       // int num1=10;
        //int num2=10;
        JOptionPane.showMessageDialog(null,num1+ num2);
        
    }
    
    void funcion2()
    {
        //mifuncion(2,3);
        //JOptionPane.showMessageDialog(null,"hola soy funcion  2");
        
    }
    public static void main(String[] args) {
        funciones fu=new funciones();
        fu.mifuncion(Integer.parseInt(JOptionPane.showInputDialog("introduce el numero")),3);
        //int x=Integer.parseInt(JOptionPane.showMessageDialog(null,"introduce tu edad" ));
       
    }
    
    
}

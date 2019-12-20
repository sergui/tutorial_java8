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
public class tabla_multiplicar {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog(null,"limite de primos intro un numero:" ));
        int j;
        int c=0; 
        for (int i = 1; i <num; i++) 
        {
             
            for (j = 1; j <= i; j++) 
            {
              if(j/2==0)
              {
                  c=c+1;
              }
              
            }
            if(c==2)
            {
                System.out.println(j);
                c=0;
                
            }
          
            
              
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_java;

/**
 Matriz [fila][columna] arreglo bidimiencional
 */
public class Matriz {
    public static void main(String[] args) 
    {
           int num[][]=new int[2][3];
           
           num[0][0]=100;num[0][1]=103;num[0][2]=600;
           num[1][0]=200;num[1][1]=300;num[1][2]=500;
           
           System.out.println(num[0][1]);
           
           for (int f = 0; f < 2; f++) 
           {
               for (int c = 0; c < 3; c++) 
               {
                        System.out.println("num["+f+"]["+c+"]="+num[f][c]);
               }
            }
                   
    }
}

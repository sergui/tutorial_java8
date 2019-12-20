/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos;

/**
 *
 * @author Desktop
 */
public class Variables {
    
    public static void main(String[] args) {
        /*
        variables numericas enteras
        short, int, long
        */
        short numero1=10000;
        System.out.println(numero1);
        
        long numero2=100;
        System.out.println("el valor long es: "+numero2);
        
        float numero3=100.5123456789f;
        System.out.println("el valor float es : "+numero3);
        
        double numero4=100.5123456789d;
        System.out.println("el valor double es : "+numero4);
        
        /*
        variables cadernas o caracteres
        */
        String cadena="100.5123456789d";
        String edad=" 20 ";
        System.out.println("el valor de la cadena es: "+cadena);
        System.out.println(cadena+edad+cadena);
        
               
        /*
        variables booleanas
        */
        
        boolean comparacion=true;
        System.err.println(comparacion);
        
        boolean comparacion1=100>9000;
        System.err.println(comparacion1);
        
        
        
    }
}

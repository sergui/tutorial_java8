/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_java;

/**
 VECTORES O ARREGLOS de cualquier tipo de dato
 */
public class Arreglos {
    public static void main(String[] args) {
        
        String nombres[]={"juan","sergio","quispe","flores"};
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);
        
        String nom[]=new String[3];
        nom[0]="papa0";
        nom[1]="papa1";
        nom[2]="papa2";
       
        
        //recorrido de vector
        
        for (int i = 0; i <nom.length; i++) 
        {
           System.out.println("nom["+i+"]="+nom[i]);
        }
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sergui
 */
public class leer_archivo_d_disco {
    void mostrar_datos()
    {
        //lectura de un archivo
        try {
            
            FileReader leer=new FileReader("archivo.txt");
            BufferedReader bufer= new BufferedReader(leer);
            String cadena;
            
            while((cadena = bufer.readLine())!=null)
            {
            
                 System.err.println(cadena);
                
            }
        } catch (Exception e) {
        }
    }
    void almacenar_datos()
    {
        //escritura de de testo en el archivo
        try {
           File archivo=new File("archivo.txt") ;
           
           PrintWriter escribir=new PrintWriter(archivo,"utf-8");
           escribir.println(JOptionPane.showInputDialog("escriba el nuevo dato:"));
           
           escribir.close();
           
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        
        leer_archivo_d_disco arc=new leer_archivo_d_disco();
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("elige una opcion:\n 1) Mostrar\n 2) Almacenar\n"));
        switch(opcion)
        {
            case 1:arc.mostrar_datos();break;
            case 2:arc.almacenar_datos();break;
            default: System.out.print("no existe esa opcion");
                
        }
          
  
    }
    
}

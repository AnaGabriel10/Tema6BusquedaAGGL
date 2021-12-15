/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenar;
   import Ordenar.Hash;
import java.util.Scanner;
/**
 *
 * @author marcelino
 */
public class AppDePruebaHash {

 public static void main(String[] args) {
     
        try {
            int i, n, resp, m;
            String g= "";
            Scanner SC = new Scanner (System.in);
            System.out.println("Ingrese el tamaño de la tabla");
            m=SC.nextInt();
            
            
            Hash[] h = new Hash[m];
            for (i = 0; i < m; i++) {
                h[i] = new Hash();
                h[i].estado = 0;
            }
            do {
                System.out.println("\"Menú Principal n\" + \"Insertar (1)nBuscar (2)nEliminar (3)nSalir (4)\"");
                resp=SC.nextInt();
                switch (resp) {
                    case 1:
                        System.out.println("Ingrese el numero de empleado a ser insertado en la tabla:");
                        n=SC.nextInt();
                      
                                
                        Hash.insertaHash(h, m, n);
                        break;
                    case 2:
                        System.out.println("Ingrese el número a ser buscado en la tabla");
                        n=SC.nextInt();
                        i = Hash.buscaHash(h, m, n);
                        if (i == -1) {
                            System.out.println("Numero no encontrado");
                        } else {
                            System.out.println("Numero encontrado");
         
                 }
                        break;
                    case 3:
                        System.out.println("Ingrese el numero a ser eliminado de la tabla");
                        n=SC.nextInt();
                        i = Hash.eliminaHash(h, m, n);
                        if (i == -1) {
                            System.out.println("Numero no encontrado");
                        } else {
                            System.out.println("Numero eliminado con exito");
                        }
                        break;
                        
                        
                    case 4:
                        System.exit(0);
                    default:
                }
            } while (resp != 4);
        } catch (NumberFormatException nfe) {
            System.out.println("Estas saliendo del programa");
          
        } catch (OutOfMemoryError ome) {
            System.out.println("No hay espacio");
             
        }
        
 
    }

 
}
 


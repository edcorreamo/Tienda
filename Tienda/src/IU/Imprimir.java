
package IU;

import java.util.Scanner;


public class Imprimir {
    
public static int leerPantalla(){
 Scanner entrada= new Scanner(System.in); 
int x=entrada.nextInt();
return x;
}
    
    public static void menu(){
        System.out.println("Bienvenido a la su mejor tienda de articulos electronicos");
        System.out.println("Acontinuacion se le presenta un menú de opciones para que pueda "
                         + "\nvisualizar los distintos productos con los que comtamos. Escoja el numero "
                         + "\ncorrespondiente a su opción: \n");
        
        System.out.println("1. Computador");
        System.out.println("2. Tablet");
        System.out.println("0. Salir");
        System.out.println("°°°°°°°°°°°°°°°°°°");
   
 }
    
       public static void menu2(){
        System.out.println("\n|||||||||||||||||||||");
        System.out.println("1. Computador Mesa");
        System.out.println("2. Computador Portatil");
        System.out.println("0. Salir");
        System.out.println("|||||||||||||||||||||");
      
 }
       public static void menu3(){
        System.out.println("\n|||||||||||||||||||||");
        System.out.println("1. Android");
        System.out.println("2. Ios");
        System.out.println("0. Salir");
        System.out.println("|||||||||||||||||||||");
      
 }
       
    
    
}

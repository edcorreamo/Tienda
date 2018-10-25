
package LogicBusiness;
import IU.Imprimir;
import Data.ArticuloElectronico;
import Data.Computador;
import Data.Ios;
import Data.Android;
import Data.Portatil;
import Data.Tablet;
import Data.ComputadorMesa;
public class Tienda {

   
    public static void main(String[] args) {
       Imprimir.menu();
       
       int q=0,p=0;
       
       ComputadorMesa prometeo=new  ComputadorMesa(true,"12 Pulgadas",false,"Core i5","8G",1024,"Escritorio","Negro","HP",500000);
       Portatil zeus=new  Portatil("2000 amp ","bateria de litio",true,"Core i7","16G",1024,"Escritorio","Azul","Lenovo",552000);
       Android hades=new Android();
       Ios hermes=new Ios();
       
     
       
        do{
             p=Imprimir.leerPantalla();
        switch(p){
            
        case 1: 
               do{
                   Imprimir.menu2();
                      q=Imprimir.leerPantalla();
               
            
               switch(q){
              case 1:
               System.out.println("\nComputadores de Mesa:");
               System.out.println("----------");
               System.out.println(prometeo);
               System.out.println("---------");
               System.out.println();
               System.out.println("----------");
                       break;
               case 2:
               System.out.println("\nComputdores Portatiles:");
               System.out.println("----------");
               System.out.println(zeus);
               System.out.println("---------");
               System.out.println();
               System.out.println("----------"); 
                       break;
 
                case 0: break;
                   default:
                       System.out.println("Opcion Invalida");
                       break;
               }
               }while(q!=0);
               break;
        case 2: 
         Imprimir.menu3();
            int g =Imprimir.leerPantalla();
               switch(g){
              case 1:
               System.out.println("\nAndroid");
               System.out.println("----------");
               System.out.println(hades);
               System.out.println("---------");
               System.out.println();
               System.out.println("----------");
                       break;
               case 2:
               System.out.println("\nIos");
               System.out.println("----------");
               System.out.println(hermes);
               System.out.println("---------");
               System.out.println();
               System.out.println("----------"); 
                       break;
 
                case 0: break;
                   default:
                       System.out.println("Opcion Invalida");
                       break;
               }
            
               break;
        case 0:
              
               break;
       
        default:
            System.out.println("Opción Invalida");
            break;
        }
       }while(p!=0);
     
     }
       
       
       
       
       
       
       
       
       
    }
    


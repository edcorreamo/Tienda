
package LogicBusiness;
import IU.Imprimir;
import Data.ArticuloElectronico;
import Data.Computador;
import Data.Ios;
import Data.Android;
import Data.Portatil;
import Data.Tablet;
import Data.ComputadorMesa;
import java.util.ArrayList;
import Data.VersionAntigua;
import Data.VersionAntigua;
import Data.IosGAlta;
import Data.VersionNueva;
import java.util.HashSet;
public class Tienda {
    
    
   
    public static void main(String[] args) {
        
       ComputadorMesa prometeo=new  ComputadorMesa(true,"12 Pulgadas",false,"Core i5","8G",1024,"Escritorio","Negro","HP",500000);
       Portatil zeus=new  Portatil("2000 amp ","bateria de litio",true,"Core i7","16G",1024,"Escritorio","Azul","Lenovo",552000);
       Android hades=new Android();
       Ios hermes=new Ios();
       
       
       ArrayList<VersionAntigua>andoridAntiguos=new ArrayList<VersionAntigua>();
       
    // VersionAntigua(boolean enPromocion, String camaraFrontal, boolean memoriaExterna, float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia) 
        VersionAntigua Motorola3g=new VersionAntigua(true,"de 4 megapixeles",true,  6.7f,2,true,6.4f,false,"motorola genuine","negro","Motorola",120000);
        VersionAntigua Motorolad=new VersionAntigua(false,"no",true,  5.2f,2,true,6.4f,false,"motorola D","rojo","Motorola",100000);
        VersionAntigua Motorolat=new VersionAntigua(false,"baja calidad",false,  6.9f,3,true,5.4f,false,"motorola T","negro","Motorola",89000);
        VersionAntigua Huawei=new VersionAntigua(true,"4 mpx",true,  5.2f,2,true,6.4f,false,"hwawei pinrce D","negro","hwahwei",90000);
        VersionAntigua lenovoLegion=new VersionAntigua(true,"6 mpx",true,  6.9f,2,true,6.4f,true,"lenovo Legion","blanco","lenovo",130000);
     //se agregan al arraylist  
        andoridAntiguos.add(Motorola3g);
        andoridAntiguos.add(Motorola3g);
        andoridAntiguos.add(Motorolat);
        andoridAntiguos.add(Huawei);
        andoridAntiguos.add(lenovoLegion);
        
    
    // creasion del hashSet
    HashSet<VersionNueva> androidNuevos=new HashSet();
    
    //instanciacion de las versiones nuevas de android
    //public VersionNueva(boolean dobleCamara, String accesorios, boolean recibeBono, float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
    VersionNueva samsungJ5 =new VersionNueva(true,"viene con cargador y con estuche",true,8.1f,3,true,6.5f,true,"samsung J5","negro","sansung",1200000f);
    VersionNueva motorolaG3 =new VersionNueva(true,"parlante",true,7.1f,3,true,5.5f,false,"G5","negro","Mortorola",800000f);
    VersionNueva kalleyInfinx =new VersionNueva(true,"protector de pantalla y estuche",true,8.1f,3,true,6.5f,false,"infinix","blanco","Kaley",600000f);
    VersionNueva lenovoShark =new VersionNueva(true,"sin accesorios extra",true,7.3f,3,true,6.5f,true,"Shark","blanco","lenovo",750000f);

    //agregar al hashset
    androidNuevos.add(samsungJ5);        
    androidNuevos.add(motorolaG3);        
    androidNuevos.add(kalleyInfinx);        
    androidNuevos.add(lenovoShark);      
    
        
        
       Imprimir.saludo();
       Imprimir.menu();
       
       int q=0,p=0;

        do{
        p=Imprimir.leerPantalla();
        switch(p){
            
        case 1: 
               do{
                   Imprimir.menu2();
                      q=Imprimir.leerPantalla();                                   
            
               switch(q){
            case 1:
                  int h;
                  do{
                        Imprimir.menu7();
                        h=Imprimir.leerPantalla();
                        switch(h){
                            case 1:System.out.println("\nComputadores para el hogar:");
                                   System.out.println("----------");
                                   System.out.println();
                                   System.out.println("---------\n");
                                   break;
                            case 2:System.out.println("\nComputadores para oficinas:");
                                   System.out.println("----------");
                                   System.out.println();
                                   System.out.println("---------\n");
                                   break;
                            case 0: break;
                            default:System.out.println("Opcion Invalida");break; 
                        }      
                  }while(h!=0);
            case 2:
                  int i;
                  do{
                        Imprimir.menu6();
                        i=Imprimir.leerPantalla();
                        switch(i){
                            case 1:System.out.println("\nComputadores Gamer:");
                                   System.out.println("----------");
                                   System.out.println();
                                   System.out.println("---------\n");
                                   break;
                            case 2:System.out.println("\nComputadores Basico:");
                                   System.out.println("----------");
                                   System.out.println();
                                   System.out.println("---------\n");
                                   break;
                            case 0:break;
                            default:System.out.println("Opcion Invalida");break; 
                        }      
                  }while(i!=0);
               }
               }while(q!=0);
               break;
        case 2: 
         Imprimir.menu3();
            int g =Imprimir.leerPantalla();
               switch(g){
              case 1:
                  int j;
                  do{
                        Imprimir.menu4();
                        j=Imprimir.leerPantalla();
                        switch(j){
                            case 1:System.out.println("\nversion antigua:");
                                   System.out.println("----------");
                                   System.out.println(andoridAntiguos);
                                   System.out.println("---------\n");
                                   break;
                            case 2:System.out.println("\nversion nueva:");
                                   System.out.println("----------");
                                   System.out.println(androidNuevos);
                                   System.out.println("---------\n");
                                   break;
                            case 0: break;
                            default:System.out.println("Opcion Invalida");break; 
                        }      
                  }while(j!=0);
               case 2:
                  int k;
                  do{
                        Imprimir.menu5();
                        k=Imprimir.leerPantalla();
                        switch(k){
                            case 1:System.out.println("\nIOS gama alta:");
                                   System.out.println("----------");
                                   System.out.println();
                                   System.out.println("---------\n");
                                   break;
                            case 2:System.out.println("\nIOS gama Baja:");
                                   System.out.println("----------");
                                   System.out.println();
                                   System.out.println("---------\n");
                                   break;
                            case 0: break;
                            default:System.out.println("Opcion Invalida");break; 
                        }      
                  }while(k!=0);
                case 0:break;
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
    


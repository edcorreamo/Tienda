
package LogicBusiness;
import IU.Imprimir;
import Data.ArticuloElectronico;

import Data.Computador;
import Data.Portatil;
import Data.PortatilBasico;
import Data.PortatilGamer;
import Data.ComputadorMesa;
import Data.ComputadoresHogar;
import Data.ComputadoresOficina;

import Data.Tablet;
import Data.Ios;
import Data.IosGAlta;
import Data.IosGMedia;
import Data.Android;
import Data.VersionAntigua;
import Data.VersionNueva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
public class Tienda {
    public static void main(String[] args) { 
        
    //By: Emnanuel
    
     //Creacion del Arraylist   
    ArrayList<VersionAntigua>androidAntiguos=new ArrayList<VersionAntigua>();
    // VersionAntigua(boolean enPromocion, String camaraFrontal, boolean memoriaExterna, float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia) 
     VersionAntigua Motorola3g=new VersionAntigua(true,"de 4 megapixeles",true,  6.7f,2,true,6.4f,false,"motorola genuine","negro","Motorola",120000);
     VersionAntigua Motorolad=new VersionAntigua(false,"no",true,  5.2f,2,true,6.4f,false,"motorola D","rojo","Motorola",100000);
     VersionAntigua Motorolat=new VersionAntigua(false,"baja calidad",false,  6.9f,3,true,5.4f,false,"motorola T","negro","Motorola",89000);
     VersionAntigua Huawei=new VersionAntigua(true,"4 mpx",true,  5.2f,2,true,6.4f,false,"hwawei pinrce D","negro","hwahwei",90000);
     VersionAntigua lenovoLegion=new VersionAntigua(true,"6 mpx",true,  6.9f,2,true,6.4f,true,"lenovo Legion","blanco","lenovo",130000); 
     androidAntiguos.add(Motorola3g);
     androidAntiguos.add(Motorola3g);
     androidAntiguos.add(Motorolat);
     androidAntiguos.add(Huawei);
     androidAntiguos.add(lenovoLegion);
        
    // Creacion del hashSet
    HashSet<VersionNueva> androidNuevos=new HashSet<VersionNueva>();
    //public VersionNueva(boolean dobleCamara, String accesorios, boolean recibeBono, float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
    VersionNueva samsungJ5 =new VersionNueva(true,"viene con cargador y con estuche",true,8.1f,3,true,6.5f,true,"samsung J5","negro","sansung",1200000f);
    VersionNueva motorolaG3 =new VersionNueva(true,"parlante",true,7.1f,3,true,5.5f,false,"G5","negro","Mortorola",800000f);
    VersionNueva kalleyInfinx =new VersionNueva(true,"protector de pantalla y estuche",true,8.1f,3,true,6.5f,false,"infinix","blanco","Kaley",600000f);
    VersionNueva lenovoShark =new VersionNueva(true,"sin accesorios extra",true,7.3f,3,true,6.5f,true,"Shark","blanco","lenovo",750000f);
    androidNuevos.add(samsungJ5);        
    androidNuevos.add(motorolaG3);        
    androidNuevos.add(kalleyInfinx);        
    androidNuevos.add(lenovoShark);      
    
    //Creacion del hashmap    
    HashMap<String,IosGAlta> GamaAltaIOS=new HashMap<String ,IosGAlta>();
    //public IosGAlta(String tipoDeSeguro, String adicionales, String colorEstuche, String nombreComercial, float version, int anioLanzamiento, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
    IosGAlta ipadPro=new IosGAlta("seguro completo, hurto, perdida","nada adicional","rojo o blanco","IPAD PRO",6.2f,2018,12.0f,true,"IPAD","blanco","APPLE",1500000);
    IosGAlta pencil=new IosGAlta("seguro solo por pérdita total","bono de descuento en audifonos","blanco","IPAD Pencil",8.2f,2017,15.0f,true,"IPAD","blanco , o gris","APPLE",1300000);
    IosGAlta ios12=new IosGAlta("seguro completo, hurto, perdida y bono para cambio en dos años","protector de rayones","negro","IOS 12",7.5f,2018,8.0f,false,"IPAD","rojo","APPLE",1000000);
    GamaAltaIOS.put("123",ipadPro);
    GamaAltaIOS.put("321",pencil);
    GamaAltaIOS.put("231",ios12);
   
    
    //By: Juan
    
    //Array List IOSGAMAMEDIA POR QUE ES QUE NO HAY BAJA ...JAJJA :D
    ArrayList<IosGMedia>iosGamaMedia=new ArrayList<IosGMedia>();
   //(String bateria, String camara, boolean vidrioTemplado, String nombreComercial, float version, int anioLanzamiento, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio)
    IosGMedia ipadAir= new IosGMedia("1560 mAh","12 MP",true,"iPad Air",5.0f,2014,9.7f,true,"IPAD","gris","APPLE",842000);
    IosGMedia ipad2= new IosGMedia("1300 mAh","5 MP",false,"iPad 2",3.1f,2011,8.5f,true,"IPAD","negro","APPLE",532000);
    IosGMedia ipad= new IosGMedia("1200 mAh","5 MP",true,"iPad",7.2f,2011,1.0f,false,"IPAD","azul","APPLE",489000);
    IosGMedia ipad3= new IosGMedia("1300 mAh","8 MP",false,"iPad 3",8.1f,2012,1.0f,false,"IPAD","blanco","APPLE",634000);
    iosGamaMedia.add(ipadAir);
    iosGamaMedia.add(ipad2);
    iosGamaMedia.add(ipad);
    iosGamaMedia.add(ipad3);
 
    //HasSet Portatil Basico
    HashSet<PortatilBasico> portatilesBasicos=new HashSet<PortatilBasico>();
    //int salidasUSB, boolean salidaHDMI, boolean salidaVGA, String sOperativo, String peso, boolean unidadCD, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio)
    PortatilBasico portatilAsus= new PortatilBasico(2,true,true,"Windows 10","1500 gr",false,"Intel Core i3","4 GB",1024,"ASUS X540L","Dorado","ASUS",1098000.0f);
    PortatilBasico portatilLenovo = new PortatilBasico(3,true,false,"Windows 10 Home","1100 gr",true,"Intel Pentium J4205","8 GB",1024,"All In One","Negro","Lenovo",958000.0f);
    PortatilBasico portatilHp= new PortatilBasico(3,true,false,"FreeDos 2.0","1650 gr",false,"APU AMD E2","4 GB",500,"HP 245 G6","Blanco","HP",719000f);
    PortatilBasico portatilDell= new PortatilBasico(2,false,false,"Windows 8","2100 gr",false,"Intel Core i3","4 GB",1024,"Inspion 14","ROJO","DELL",1384000.0f);
    portatilesBasicos.add(portatilAsus);
    portatilesBasicos.add(portatilLenovo);
    portatilesBasicos.add(portatilHp);
    portatilesBasicos.add(portatilDell);
    
    //TreeMap Portatil Gamer
     TreeMap<String,PortatilGamer> portatilesGamers=new TreeMap<String,PortatilGamer>();
    // (String targetaGrafica, int gigasdeVideo, String tipodeSonido, String sOperativo, String peso, boolean unidadCD, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio)
    PortatilGamer portatilAcer=new PortatilGamer("Nvidia GeForce GTX 1050 ",4,"No definido","Windows 10","2100gr",true, "Intel Core i5 7300HQ","12 GB",1024,"VX-591G","Rojo y Negro","ACER",3560000.0f);
    PortatilGamer portatilHP=new PortatilGamer("NVIDIA GeForce MX110",4,"No definido","Windaws 10","2000gr",false, " Intel Core i5","8 GB ",1024,"HP 15-da0011la","Negro","HP",1749000.0f);
    PortatilGamer portatilLenovo2=new PortatilGamer("NVIDIA GeForce GTX 1050",4,"No definido","Windows 10","2050gr",true, "Intel i7-7700HQ","16 GB",2048,"Legion Y520 Gaming","Rojo","LENOVO",4497000.0f);
    PortatilGamer portatilAsus2=new PortatilGamer("NVIDIA GeForce GTX 1050 ",4,"No definido","Windows 10","1900gr",true,"Intel Core i5","8 GB",1024,"ASUS TUF Gaming FX504","Negro","ASUS",3190000.0f);
    portatilesGamers.put(portatilAcer.getMarca()+portatilAcer.getPeso(),portatilAcer);
    portatilesGamers.put(portatilHP.getMarca()+portatilHP.getPeso(),portatilHP);
    portatilesGamers.put(portatilLenovo2.getMarca()+portatilLenovo2.getPeso(),portatilLenovo2);
    portatilesGamers.put(portatilAsus2.getMarca()+portatilAsus2.getPeso(),portatilAsus2);
    
    
    //By: Carlos
    // Computadores de Oficina
    HashSet<ComputadoresOficina> pcOficina=new HashSet<ComputadoresOficina>();
    
    ComputadoresOficina lenovov310z = new ComputadoresOficina (true, true, true, true, "19.5 Pulgadas", false, "Intel Core i5-7400", "4GB", 1000, "Lenovo V310z", "negro", "Lenovo", 2790000);
    ComputadoresOficina vostro3267 = new ComputadoresOficina (false, true, false, false, "18 Pulgadas", false, "Intel Core i3-6100", "4GB", 1000, "Vostro 3267", "negro", "Dell", 1820000);
    ComputadoresOficina lg082 = new ComputadoresOficina (true, true, true, false, "20 Pulgadas", true, "Intel pentium dual core G-2360", "4GB", 1000, "LG082EL12AK16LCO", "negro", "LG", 1129900);
    pcOficina.add(lg082);
    pcOficina.add(lenovov310z);
    pcOficina.add(vostro3267);
    
    // Computadores para el hogar
    HashMap<String,ComputadoresHogar> pcHogar=new HashMap<String ,ComputadoresHogar>();
    //boolean promocionConImpresora, boolean forro, boolean parlantesIncluidos, boolean integrado, String pantalla, boolean tecladoEspecial, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio
    ComputadoresHogar hp20c=new ComputadoresHogar (false, false, true, true, "20 Pulgadas", false, "Intel Core i5 7200U", "4GB", 1000, "HP 20-c405la", "Negro", "HP", 1399000);
    ComputadoresHogar acersr11=new ComputadoresHogar (false, true, false, true, "21.5 Pulgadas", false, "Intel Core i3 8130U", "4GB", 1000, "ACER - SR11", "Plata", "Acer", 1700000);
    ComputadoresHogar lenovo520=new ComputadoresHogar (true, false, false, true, "2.5 Pulgadas", true, "Intel Pentium 4415U 2.3G 2C", "4GB", 1000, "Lenovo - 520 22IKU", "Plata", "Lenovo", 1459000);
    pcHogar.put("Opcion 1",hp20c);
    pcHogar.put("Opcion 2",acersr11);
    pcHogar.put("Opcion 3",lenovo520);
    
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
                                   System.out.println(pcHogar);
                                   System.out.println("---------\n");
                                   break;
                            case 2:System.out.println("\nComputadores para oficinas:");
                                   System.out.println("----------");
                                   System.out.println(pcOficina);
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
                                   System.out.println(portatilesGamers);
                                   System.out.println("---------\n");
                                   break;
                            case 2:System.out.println("\nComputadores Basico:");
                                   System.out.println("----------");
                                   System.out.println(portatilesBasicos);
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
                                   System.out.println(androidAntiguos);
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
                                   System.out.println(GamaAltaIOS);
                                   System.out.println("---------\n");
                                   break;
                            case 2:System.out.println("\nIOS gama Media:");
                                   System.out.println("----------");
                                   System.out.println(iosGamaMedia);
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
    


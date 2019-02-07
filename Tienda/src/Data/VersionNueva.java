/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Prometeo
 */
public final class VersionNueva extends Android{
    private boolean dobleCamara;
    private String accesorios;
    private boolean recibeBono;
    
    public VersionNueva(){
        setDobleCamara(false);
        setAccesorios("no se han encontrado accesorios");
        setRecibeBono(false);
    }
    
    
    public VersionNueva(boolean dobleCamara, String accesorios, boolean recibeBono) {
        setDobleCamara(dobleCamara);
        setAccesorios(accesorios);
        setRecibeBono(recibeBono);
    }
    public VersionNueva(boolean dobleCamara, String accesorios, boolean recibeBono, float versionAndorid, int numeroDeSalidas, boolean audifonos) {
        super(versionAndorid, numeroDeSalidas, audifonos);
        setDobleCamara(dobleCamara);
        setAccesorios(accesorios);
        setRecibeBono(recibeBono);
    }
     public VersionNueva(boolean dobleCamara, String accesorios, boolean recibeBono, float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia) {
        super(versionAndorid, numeroDeSalidas, audifonos, pantalla, espacialesParaLectura, referencia);
        setDobleCamara(dobleCamara);
        setAccesorios(accesorios);
        setRecibeBono(recibeBono);
    }

    public VersionNueva(boolean dobleCamara, String accesorios, boolean recibeBono, float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
        super(versionAndorid, numeroDeSalidas, audifonos, pantalla, espacialesParaLectura, referencia, color, marca, precio);
        setDobleCamara(dobleCamara);
        setAccesorios(accesorios);
        setRecibeBono(recibeBono);
    }
    
public void setDobleCamara(boolean dobleCamara){
this.dobleCamara=dobleCamara;
}
public void setAccesorios(String accesorios){
this.accesorios=accesorios;
}
public void setRecibeBono(boolean recibeBono){
this.recibeBono=recibeBono;
}
public boolean getDobleCamara(){
return this.dobleCamara;
}
public String getAccesorios(){
return this.accesorios;
}
public boolean getRecibeBono(){
return this.recibeBono;
}


@Override
public String toString(){
String cadena1=super.toString();
String cadena="\nel celular tiene doble camara: "+getDobleCamara()+"\ncontiene los siguentes accesorios: "+getAccesorios()+"\nrecibe bono de regalo?: "+getRecibeBono()+"\n  \n"; 
return cadena1+cadena;
}
    
@Override
    public void mensajeGratitud(){
        System.out.println("Sus días se volveran mucho mas intensos con la compañia de esta tremenda tablet. \nEstamos siempre a la orden para prestarle el mejor servicio");
    }
   
}

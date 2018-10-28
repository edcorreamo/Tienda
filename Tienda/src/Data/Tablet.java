
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
public class Tablet extends ArticuloElectronico{
    private float pantalla;
    private boolean espacialesParaLectura;
    private String referencia;
    
    
    public Tablet(){
    setPantalla(-1);
    setEspecialesParaLectura(false);
    setReferencia("no se llenado el campo");
    }

    public Tablet(float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
        super(color, marca, precio);
        setPantalla(pantalla);
        setEspecialesParaLectura(espacialesParaLectura);
        setReferencia(referencia);
    }

    public Tablet(float pantalla, boolean espacialesParaLectura, String referencia) {
        setPantalla(pantalla);
        setEspecialesParaLectura(espacialesParaLectura);
        setReferencia(referencia);
    }
    
    public void setPantalla(float pantalla){
    this.pantalla=pantalla;
    }
    public void setEspecialesParaLectura(boolean especialesparaLectura){
    this.espacialesParaLectura=especialesparaLectura;
    }
    public void setReferencia(String referencia){
    this.referencia=referencia;
    }
    public float getPantalla(){
    return this.pantalla;
    }
    public boolean getEspecialesParaLectura(){
    return this.espacialesParaLectura;
    }
    public String getReferencia(){
    return this.referencia;
    }
    
    public String esPequenia(float pantalla){
    if(pantalla<=12){
    return "es pequeña";
    }else{
    return "es grande";
    }
    }
    
    
    @Override
    public String toString(){
    String cadena1=super.toString();
    String cadena2="\nreferencia :"+getReferencia()+"\npantalla: "+getPantalla()+"\nreferencia:"+getEspecialesParaLectura();
    return cadena1+cadena2;
    }
    
}

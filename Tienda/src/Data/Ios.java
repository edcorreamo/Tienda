/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


public class Ios extends Tablet {
    String nombreComercial;
    float version;
    int anioLanzamiento;

    public Ios(String nombreComercial, float version, int anioLanzamiento) {
        setNombreComercial(nombreComercial);
        setVersion(version);
        setAnioDeLanzamiento(anioLanzamiento);
    }

    public Ios(String nombreComercial, float version, int anioLanzamiento, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
        super(pantalla, espacialesParaLectura, referencia, color, marca, precio);
        setNombreComercial(nombreComercial);
        setVersion(version);
        setAnioDeLanzamiento(anioLanzamiento);
    }

    public Ios(String nombreComercial, float version, int anioLanzamiento, float pantalla, boolean espacialesParaLectura, String referencia) {
        super(pantalla, espacialesParaLectura, referencia);
        setNombreComercial(nombreComercial);
        setVersion(version);
        setAnioDeLanzamiento(anioLanzamiento);
    }
    public Ios(){
    setNombreComercial(null);
        setVersion(-1);
        setAnioDeLanzamiento(-1);
    }
    
    public void setNombreComercial(String nombreComercial){
    this.nombreComercial=nombreComercial;
    }
    public void setVersion(float version){
    this.version=version;
    }
    public void setAnioDeLanzamiento(int anioDeLanzamiento){
    this.anioLanzamiento=anioDeLanzamiento;
    }
    public String getNombreComercial(){
    return this.nombreComercial;
    }
    public float getVersion(){
    return this.version;
    }
    public int getAnioDeLanzamiento(){
    return this.anioLanzamiento;
    }
    
    public String esantigua(int antiguo){
    if(antiguo<=2016){
    return "es antigua";
    }else{
    return "es nueva";
    }
    }
    @Override
    public String toString(){    
    String cadena1=super.toString();
    String cadena2="\nnombre Comercial :"+getNombreComercial()+"\nversion : "+getVersion()+"\nreferencia:"+getAnioDeLanzamiento();
    return cadena1+cadena2;
    }
    
}

   
    


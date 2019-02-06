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
public final class IosGAlta extends Ios{
    private String tipoDeSeguro;
    private String adicionales;
    private String colorEstuche;

    public IosGAlta(String tipoDeSeguro, String adicionales, String colorEstuche, String nombreComercial, float version, int anioLanzamiento) {
        super(nombreComercial, version, anioLanzamiento);
        setTipoDeSeguro(tipoDeSeguro);
        setAdicionales(adicionales);
        setColorEstuche(colorEstuche);
    }

    public IosGAlta(String tipoDeSeguro, String adicionales, String colorEstuche, String nombreComercial, float version, int anioLanzamiento, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
        super(nombreComercial, version, anioLanzamiento, pantalla, espacialesParaLectura, referencia, color, marca, precio);
        setTipoDeSeguro(tipoDeSeguro);
        setAdicionales(adicionales);
        setColorEstuche(colorEstuche);
    }

    public IosGAlta(String tipoDeSeguro, String adicionales, String colorEstuche, String nombreComercial, float version, int anioLanzamiento, float pantalla, boolean espacialesParaLectura, String referencia) {
        super(nombreComercial, version, anioLanzamiento, pantalla, espacialesParaLectura, referencia);
        setTipoDeSeguro(tipoDeSeguro);
        setAdicionales(adicionales);
        setColorEstuche(colorEstuche);
    }

    public IosGAlta(String tipoDeSeguro, String adicionales, String colorEstuche) {
        setTipoDeSeguro(tipoDeSeguro);
        setAdicionales(adicionales);
        setColorEstuche(colorEstuche);
    }
    public IosGAlta() {
        setTipoDeSeguro("valor no asignado");
        setAdicionales("valor no asignado");
        setColorEstuche("valor no asignado");
    }
       
    
    public void setTipoDeSeguro(String tipoDeSeguro){
    this.tipoDeSeguro=tipoDeSeguro;
    }
    public void setAdicionales(String adicionales){
    this.adicionales=adicionales;
    }
    public void setColorEstuche(String colorEstuche){
    this.colorEstuche=colorEstuche;
    }
    
    public String getTipoDeSeguro(){
    return this.tipoDeSeguro;
    }
    public String getAdicionales(){
    return this.adicionales;
    }
    public String getColorEstuche(){
    return this.colorEstuche;
    }
    
    @Override
    public String toString(){    
    String cadena1=super.toString();
    String cadena2="\nel celular tiene un incluido un tipo de seguro :"+getTipoDeSeguro()+"\naccesorios adiconales incluidos : "+getAdicionales()+"\nel color del estuche incluido es:"+getColorEstuche()+"\n \n";
    return cadena1+cadena2;
    }
    
    
    
            
}

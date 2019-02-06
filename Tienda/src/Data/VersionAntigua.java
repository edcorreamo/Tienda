/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


public final class VersionAntigua extends Android{
    private boolean enPromocion;;
    private String camaraFrontal;
    private boolean memoriaExterna;
    
    public VersionAntigua(){
        setEnPromocion(false);
        setCamaraFrontal("valor no asignado");
        setMemoriaExterna(false);
    }

    public VersionAntigua(boolean enPromocion, String camaraFrontal, boolean memoriaExterna, float versionAndorid, int numeroDeSalidas, boolean audifonos) {
        super(versionAndorid, numeroDeSalidas, audifonos);
        setEnPromocion(enPromocion);
        setCamaraFrontal(camaraFrontal);
        setMemoriaExterna(memoriaExterna);
    }
    
    public VersionAntigua(boolean enPromocion, String camaraFrontal, boolean memoriaExterna, float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia) {
        super(versionAndorid, numeroDeSalidas, audifonos, pantalla, espacialesParaLectura, referencia);
        setEnPromocion(enPromocion);
        setCamaraFrontal(camaraFrontal);
        setMemoriaExterna(memoriaExterna);
    }
    public VersionAntigua(boolean enPromocion, String camaraFrontal, boolean memoriaExterna, float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
        super(versionAndorid, numeroDeSalidas, audifonos, pantalla, espacialesParaLectura, referencia, color, marca, precio);
        setEnPromocion(enPromocion);
        setCamaraFrontal(camaraFrontal);
        setMemoriaExterna(memoriaExterna);
    }
    
public void setEnPromocion(boolean enPromocion){
this.enPromocion=enPromocion;
}
public void setCamaraFrontal(String camaraFrontal){
this.camaraFrontal=camaraFrontal;
}
public void setMemoriaExterna(boolean memoriaExterna){
this.memoriaExterna=memoriaExterna;
        }
public boolean getEnPromocion(){
return this.enPromocion;
}
public String getCamaraFrontal(){
return this.camaraFrontal;
}
public boolean getMemoriaExterna(){
return this.memoriaExterna;
}

@Override
    public String toString(){
    String cadena1=super.toString();
    String cadena="\nestá en promocion :"+getEnPromocion()+"\ntipo de camara frontal: "+getCamaraFrontal()+"\nse entrega con memoria externa; "+getMemoriaExterna()+"\n.............";
    
    return cadena1+cadena;
    }
        





    
}


package Data;

public class IosGMedia extends Ios {

 
 private String bateria;
 private String camara;
 private boolean vidrioTemplado;

    public IosGMedia(String bateria, String camara, boolean vidrioTemplado, String nombreComercial, float version, int anioLanzamiento, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
        super(nombreComercial, version, anioLanzamiento, pantalla, espacialesParaLectura, referencia, color, marca, precio);
        setTipoCargador(bateria);
        setProgramasGratis(camara);
        setVidrioTemplado(vidrioTemplado);
    }

    public IosGMedia(String bateria, String camara, boolean vidrioTemplado) {
        setTipoCargador(bateria);
        setProgramasGratis(camara);
        setVidrioTemplado(vidrioTemplado);
    }

    public IosGMedia() {
        setTipoCargador("Indefinidido");
        setProgramasGratis("Indefinido");
        setVidrioTemplado(false);
        
    }

    public void setTipoCargador(String bateria) {
        this.bateria = bateria;
    }

    public void setProgramasGratis(String camara) {
        this.camara = camara;
    }

    public void setVidrioTemplado(boolean vidrioTemplado) {
        this.vidrioTemplado = vidrioTemplado;
    }

    public String getBateria() {
        return bateria;
    }

    public String getCamara() {
        return camara;
    }

    public boolean getVidrioTemplado() {
        return vidrioTemplado;
    }
 
  @Override
    public String toString(){    
    String cadena1=super.toString();
    String cadena2="\nTipo de Cargador :"+getBateria()+"\nBateria : "+getCamara()+"\nVidrio Templado: "+getVidrioTemplado();
    return cadena1+cadena2;
 
    }
    
}

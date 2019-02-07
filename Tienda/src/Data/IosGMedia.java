
package Data;

public final class IosGMedia extends Ios {

 
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
    String cadena2="\nBateria :"+getBateria()+"\nCamara : "+getCamara()+"\nVidrio Templado: "+getVidrioTemplado()+"\n...................";
    return cadena1+cadena2;
 
    }
    
    @Override
    public void mensajeGratitud(){
        System.out.println("Con su nueva tablet ahora podra gozar del mejor sistema operativo movil disponible. \nGracias por confiar en nosotros");
    }
}

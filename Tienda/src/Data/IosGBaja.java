
package Data;

public class IosGBaja extends Ios {

 
 private String tipoCargador;
 private String programasGratis;
 private boolean vidrioTemplado;

    public IosGBaja(String tipoCargador, String programasGratis, boolean vidrioTemplado, String nombreComercial, float version, int anioLanzamiento, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
        super(nombreComercial, version, anioLanzamiento, pantalla, espacialesParaLectura, referencia, color, marca, precio);
        setTipoCargador(tipoCargador);
        setProgramasGratis(programasGratis);
        setVidrioTemplado(vidrioTemplado);
    }

    public IosGBaja(String tipoCargador, String programasGratis, boolean vidrioTemplado) {
        setTipoCargador(tipoCargador);
        setProgramasGratis(programasGratis);
        setVidrioTemplado(vidrioTemplado);
    }

    public IosGBaja() {
        setTipoCargador("Indefinidido");
        setProgramasGratis("Indefinido");
        setVidrioTemplado(false);
        
    }

    public void setTipoCargador(String tipoCargador) {
        this.tipoCargador = tipoCargador;
    }

    public void setProgramasGratis(String programasGratis) {
        this.programasGratis = programasGratis;
    }

    public void setVidrioTemplado(boolean vidrioTemplado) {
        this.vidrioTemplado = vidrioTemplado;
    }

    public String getTipoCargador() {
        return tipoCargador;
    }

    public String getProgramasGratis() {
        return programasGratis;
    }

    public boolean getVidrioTemplado() {
        return vidrioTemplado;
    }
 
  @Override
    public String toString(){    
    String cadena1=super.toString();
    String cadena2="\nTipo de Cargador :"+getTipoCargador()+"\nProgramas Gratuitos : "+getProgramasGratis()+"\nVidrio Templado: "+getVidrioTemplado();
    return cadena1+cadena2;
 
    }
    
}

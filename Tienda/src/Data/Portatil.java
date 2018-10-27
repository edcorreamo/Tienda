
package Data;


public class Portatil extends Computador {
    String cargador;
    String bateria;
    boolean unidadCD;

    public Portatil(String cargador, String bateria, boolean unidadCD, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio) {
        super(procesador, ram, discoDuro, tipo, color, marca, precio);
        setCargador(cargador);
        setBateria(bateria);
        setUnidadCD(unidadCD);
    }
    public Portatil() {
        setCargador(null);
        setBateria(null);
        setUnidadCD(false);
    }

  

  

    public void setCargador(String cargador) {
        this.cargador = cargador;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public void setUnidadCD(boolean unidadCD) {
        this.unidadCD = unidadCD;
    }

    public String getCargador() {
        return this.cargador;
    }

    public String getBateria() {
        return this.bateria;
    }

    public boolean getUnidadCD() {
        return this.unidadCD;
    }
  @Override
    public String toString(){
        super.toString();
        String cadena="\nCargador: "+getCargador()+"\nUnidad de CD: "+getUnidadCD()+"\nBateria: "+getBateria();
      return cadena; 
}          
    
}


package Data;

public class Portatil extends Computador {
    String sOperativo;
    String peso;
    boolean unidadCD;

    public Portatil(String sOperativo, String peso, boolean unidadCD, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio) {
        super(procesador, ram, discoDuro, tipo, color, marca, precio);
        setSOperativo(sOperativo);
        setPeso(peso);
        setUnidadCD(unidadCD);
    }
    public Portatil() {
        setSOperativo(null);
        setPeso(null);
        setUnidadCD(false);
    }


    public void setSOperativo(String sOperativo) {
        this.sOperativo = sOperativo;
    }

    public void setPeso(String peso) {
        this.peso= peso;
    }

    public void setUnidadCD(boolean unidadCD) {
        this.unidadCD = unidadCD;
    }

    public String getsOperativo() {
        return this.sOperativo;
    }

    public String getPeso() {
        return this.peso;
    }

    public boolean getUnidadCD() {
        return this.unidadCD;
    }
  @Override
    public String toString(){
        super.toString();
        String cadena="\nCargador: "+getPeso()+"\nUnidad de CD: "+getUnidadCD()+"\nBateria: "+getsOperativo();
      return cadena; 
}          
    
}

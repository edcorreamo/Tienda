
package Data;


public class ComputadorMesa extends Computador{
   private boolean integrado;
   private String pantalla;
   private boolean tecladoEspecial;

    public ComputadorMesa(boolean integrado, String pantalla, boolean tecladoEspecial, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio) {
        super(procesador, ram, discoDuro, tipo, color, marca, precio);
        this.integrado = integrado;
        this.pantalla = pantalla;
        this.tecladoEspecial = tecladoEspecial;
    }
    public ComputadorMesa(boolean integrado, String pantalla, boolean tecladoEspecial) {
        this.integrado = integrado;
        this.pantalla = pantalla;
        this.tecladoEspecial = tecladoEspecial;
    }
    public ComputadorMesa() {
        this.integrado = false;
        this.pantalla = "articulo no asingnado";
        this.tecladoEspecial = false;
    }

   
     
    public boolean getIntegrado() {
        return this.integrado;
    }

    public String getPantalla() {
        return this.pantalla;
    }

    public boolean getTecladoEspecial() {
        return this.tecladoEspecial;
    }

    public void setIntegrado(boolean integrado) {
        this.integrado=integrado;
    }

    public void setPantalla(String pantalla) {
        this.pantalla=pantalla;
    }

    public void setTecladoEspecial(boolean tecladoEspecial) {
        this.tecladoEspecial=tecladoEspecial;
    }
@Override
    public String toString(){
        String cadena1=super.toString();
        String cadena= "\nIntegrado: "+getIntegrado()+"\nPantalla: "+getPantalla()
        +"\nTeclado Especial: "+getTecladoEspecial();
        String result=cadena1+cadena;
        return result; 
}
      
}

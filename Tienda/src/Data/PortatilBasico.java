
package Data;

public final class PortatilBasico extends Portatil{
   private int salidasUSB;
    private boolean salidaHDMI;
    private boolean salidaVGA;

    public PortatilBasico(int salidasUSB, boolean salidaHDMI, boolean salidaVGA, String sOperativo, String peso, boolean unidadCD, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio) {
        super(sOperativo, peso, unidadCD, procesador, ram, discoDuro, tipo, color, marca, precio);
        setSalidasUSB(salidasUSB);
        setSalidaHDMI(salidaHDMI);
        setSalidaVGA(salidaVGA);
    }

    public PortatilBasico(int salidasUSB, boolean salidaHDMI, boolean salidaVGA) {
        setSalidasUSB(salidasUSB);
        setSalidaHDMI(salidaHDMI);
        setSalidaVGA(salidaVGA);
    }

    public PortatilBasico() {
    }

    public void setSalidasUSB(int salidasUSB) {
        this.salidasUSB = salidasUSB;
    }

    public void setSalidaHDMI(boolean salidaHDMI) {
        this.salidaHDMI = salidaHDMI;
    }

    public void setSalidaVGA(boolean salidaVGA) {
        this.salidaVGA = salidaVGA;
    }
    
    public int getSalidasUSB() {
        return salidasUSB;
    }

    public boolean getSalidaHDMI() {
        return salidaHDMI;
    }

    public boolean getSalidaVGA() {
        return salidaVGA;
    }

  

    public boolean isUnidadCD() {
        return unidadCD;
    }
      @Override
    public String toString(){    
    String cadena1=super.toString();
    String cadena2="\nNumero de Salidas USB :"+getSalidasUSB()+"\nSalida HDMI : "+ getSalidaHDMI()+"\nVidrio Templado: "+getSalidaVGA()+"\n...............";
    return cadena1+cadena2;
 
    }  

    @Override
    public void mensajeGratitud(){
        System.out.println("Esperamos que haya disfrutado del servicio que le hemos prestado. \nSu nuevo portatil permitira que usted haga sus tareas con la mejor calidad");
    }
}

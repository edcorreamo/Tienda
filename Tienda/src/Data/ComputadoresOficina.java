
package Data;

public class ComputadoresOficina extends ComputadorMesa {
    private boolean pantallaLed;
    private boolean licenciasOficina;
    private boolean altoRendimiento;

    public ComputadoresOficina (boolean pantallaLed, boolean licenciasOficina, boolean altoRendimiento, boolean integrado, String pantalla, boolean tecladoEspecial, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio) {
        super(integrado, pantalla, tecladoEspecial, procesador, ram, discoDuro, tipo, color, marca, precio);
        setPantallaLed(pantallaLed);
        setLicenciasOficina(licenciasOficina);
        setAltoRendimiento(altoRendimiento);
    }

    public ComputadoresOficina (boolean pantallaLed, boolean licenciasOficina, boolean altoRendimiento){
        setPantallaLed(pantallaLed);
        setLicenciasOficina(licenciasOficina);
        setAltoRendimiento(altoRendimiento);
}
    public ComputadoresOficina (){
        setPantallaLed(false);
        setLicenciasOficina(false);
        setAltoRendimiento(false);
    }

    public boolean getPantallaLed (){
        return this.pantallaLed;
    }

    public boolean getLicenciasOficina (){
        return this.licenciasOficina;
    }

    public boolean getAltoRendimiento (){
        return this.altoRendimiento;
    }

    public void setPantallaLed(boolean pantallaLed) {
        this.pantallaLed=pantallaLed;
    }
    
    public void setLicenciasOficina(boolean licenciasOficina) {
        this.licenciasOficina=licenciasOficina;
    }
    
    public void setAltoRendimiento(boolean altoRendimiento) {
        this.altoRendimiento=altoRendimiento;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        String cadena2="\nPantalla Led: "+getPantallaLed()+"\nLicencias de Oficina: "+getLicenciasOficina() +"\nAlto rendimiento: "+getAltoRendimiento();
        String cadena3="\n";
        return cadena+cadena2+cadena3;
    }
    
    
}

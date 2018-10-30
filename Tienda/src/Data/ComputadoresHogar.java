
package Data;

public class ComputadoresHogar extends ComputadorMesa {
    private boolean promocionConImpresora;
    private boolean forro;
    private boolean parlantesIncluidos;

    public ComputadoresHogar (boolean promocionConImpresora, boolean forro, boolean parlantesIncluidos, boolean integrado, String pantalla, boolean tecladoEspecial, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio) {
        super(integrado, pantalla, tecladoEspecial, procesador, ram, discoDuro, tipo, color, marca, precio);
        setPromocionConImpresora(promocionConImpresora);
        setForro(forro);
        setParlantesIncluidos(parlantesIncluidos);
    }

    public ComputadoresHogar (boolean promocionConImpresora, boolean forro, boolean parlantesIncluidos){
        setPromocionConImpresora(promocionConImpresora);
        setForro(forro);
        setParlantesIncluidos(parlantesIncluidos);
}
    public ComputadoresHogar (){
        setPromocionConImpresora(false);
        setForro(false);
        setParlantesIncluidos(false);
    }

    public boolean getPromocionConImpresora (){
        return this.promocionConImpresora;
    }

    public boolean getForro (){
        return this.forro;
    }

    public boolean getParlantesIncluidos (){
        return this.parlantesIncluidos;
    }

    public void setPromocionConImpresora(boolean promocionConImpresora) {
        this.promocionConImpresora=promocionConImpresora;
    }
    
    public void setForro(boolean forro) {
        this.forro=forro;
    }
    
    public void setParlantesIncluidos(boolean parlantesIncluidos) {
        this.parlantesIncluidos=parlantesIncluidos;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        String cadena2="\nPromoción con impresora: "+getPromocionConImpresora()+"\nForro: "+getForro() +"\nParlantes incluidos: "+getParlantesIncluidos();
        return cadena+cadena2;
    }
    
    
}


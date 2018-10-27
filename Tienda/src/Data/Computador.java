
package Data;

public class Computador extends ArticuloElectronico{
    
    private String procesador;
    private String ram ;
    private int discoDuro;
    private String tipo;

    public Computador(String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio) {
        super(color, marca, precio);
        setProcesador(procesador);
        setRam(ram);
        setDiscoDuro(discoDuro);
        setTipo(tipo);
    }
    public Computador() {
      setProcesador(null);
       setRam(null);
       setDiscoDuro(-1);
        setTipo(null);
    }

   

   
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
     public String getTipo() {
        return this.tipo;
    }

    public String getProcesador() {
        return this.procesador;
    }

    public String getRam() {
        return this.ram;
    }

    public int getDiscoDuro() {
        return this.discoDuro;
    }
    
    @Override
    public String toString (){
        String cadena1=super.toString();
        String cadena= "\nTipo: "+getTipo()+"\nProcesador: "+getProcesador()
                +"\nRam: "+getRam()+"\nDisco Duro: "+getDiscoDuro();
        String result=cadena1+cadena;
        return result; 
}
    
    
}

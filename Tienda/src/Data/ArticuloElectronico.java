
package Data;


public class ArticuloElectronico {
   
    private String marca;
    private float precio;
    private String color;
    
    public ArticuloElectronico(String color,String marca,float precio){
    setPrecio(precio);
    setMarca(marca);
    setColor(color);
    }
    public ArticuloElectronico(){
    setPrecio(-1);
    setMarca("artuculo sin asignacion");
    setColor("campo no agregado");
    }
    
    
    
    public void setMarca(String marca){
    this.marca=marca;
     }
    public void setPrecio(float precio ){
    this.precio=precio;
    }
    public void setColor(String color){
    this.color=color;
    }
    public String getMarca(){
    return this.marca;
    }
    public float getPrecio(){
    return this.precio;
    }
    public String getColor(){
    return this.color;
    }
    
    public String caro(float precio){
        if(precio>=1000000){
            return "es caro";
        }else {
            return "no escaro";
        }
    }
    
    
    @Override
    public String toString(){
        String cadena="\nMarca: "+getMarca()+"\nPrecio: "+getPrecio()+"\nColor: "+getColor();
      return cadena; 
}
    
}

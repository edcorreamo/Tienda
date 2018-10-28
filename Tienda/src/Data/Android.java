
package Data;

public class Android extends Tablet{
    float versionAndorid;
    int numeroDeSalidas;
    boolean audifonos;

    public Android(float versionAndorid, int numeroDeSalidas, boolean audifonos) {
        setVersionAndroid(versionAndorid);
        setNumeroDeSalidas(numeroDeSalidas);
        setAudifonos(audifonos);
    }

    public Android(float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia, String color, String marca, float precio) {
        super(pantalla, espacialesParaLectura, referencia, color, marca, precio);
        setVersionAndroid(versionAndorid);
        setNumeroDeSalidas(numeroDeSalidas);
        setAudifonos(audifonos);
    }

    public Android(float versionAndorid, int numeroDeSalidas, boolean audifonos, float pantalla, boolean espacialesParaLectura, String referencia) {
        super(pantalla, espacialesParaLectura, referencia);
        setVersionAndroid(versionAndorid);
        setNumeroDeSalidas(numeroDeSalidas);
        setAudifonos(audifonos);
    }
   public Android(){
    setVersionAndroid(-1);
    setNumeroDeSalidas(-1);
    setAudifonos(false);
    }
    
    public void setVersionAndroid(float version){
    this.versionAndorid=version;
    }
    public void setNumeroDeSalidas(int salidas){
    this.numeroDeSalidas=salidas;
    }
    public void setAudifonos(boolean audifonos){
    this.audifonos=audifonos;
    }
    public float getVersionAndroid(){
    return this.versionAndorid;
    }
    public int getNumeroDeSalidas(){
    return this.numeroDeSalidas;
    }
    public boolean getAudifonos(){
    return this.audifonos;
    }
    
    public String moderno(float antiguo){
    if(antiguo<=7.0){
    return "es antiguo";
    }else{
    return "es moderno";
    }
    }
    @Override
    public String toString(){
    String cadena1=super.toString();
    String cadena="\nnombre Comercial :"+getVersionAndroid()+"\nversion : "+getNumeroDeSalidas()+"\nreferencia:"+getAudifonos();
    return cadena1+cadena;
    }
    
}

   
    

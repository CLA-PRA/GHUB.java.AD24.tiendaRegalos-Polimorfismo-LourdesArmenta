package datos;

//La clase Calculadora hereda de la clase ProductoElectronico
public class Calculadora   {
    private String tipo;
    final String familia = //coloque el codigo para obtener la Familia de la clase padre

    public Calculadora(String idProducto, String nombre, double precio, String descripcion, String familia
                       ,String marca, String modelo, String color, int garantia, 
                       String voltaje ,String tipo) {

        super(idProducto, nombre, precio, descripcion, familia, marca, modelo, color, garantia, voltaje);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //metodo getFamilia sobreescrito de la clase ProductoElectronico pra obtener la familia
    @Override
    public String getFamilia(){
        
    }

    //sobreescritura del metodo obtenerDetalles de la clase ProductoElectronico y
    //agregando el atributo tipo
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+"Calculadora [tipo=" + tipo + "]";
    }

    //sobreescritura del metodo aplicarDescuento de la clase ProductoElectronico
    @Override
    public boolean aplicarDescuento(double porcentaje) {
        
         
    }

    @Override
    public String toString() {
    
        return super.toString()+", tipo:" + tipo ;
    }

    
    
    

    


    

    
}
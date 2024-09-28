package datos;

//La clase ProductoElectroDomestico es una clase abstracta que hereda de la clase Producto
public abstract class ProductoElectroDomestico {
    //atributos de la clase ProductoElectroDomestico
    
    //utilizamos una constante para definir la familia de la clase
    //final String familia = super.getFamilia();
    final String familia = "ProductoElectrodomestico";

    public ProductoElectroDomestico() {
        //invocamos al constructor de la clase padre
        
    }
    
    public ProductoElectroDomestico(String idProducto, String nombre, double precio
                        ,String descripcion,String familia
                        ,String marca, String modelo, String color, int garantia, String voltaje) {
        
        //invocamos al constructor de la clase padre
        //super(idProducto, nombre, precio, descripcion, familia);

        

    }
    //metodos get y set de la clase ProductoElectroDomestico
   
    

    //sobreescritura del metodo obtenerDetalles
    

    //a un producto electrodomestico se le puede aplicar un descuento de hasta el 50%
    //aplica un descuento al precio del producto
    @Override
    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <=50)
          return true;
        else
          return false;
    
    }
    

    //metodo que retorna si un producto es vendible
    //todos los productos electrodomesticos son vendibles
    //implemente el metodo de la interfaz Vendible
   

    public String getFamilia(){
        return "ProductoElectrodomestico";
    }



    
    
}

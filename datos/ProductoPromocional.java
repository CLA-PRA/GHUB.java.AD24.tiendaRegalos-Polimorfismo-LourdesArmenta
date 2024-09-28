package datos;

public class ProductoPromocional extends Producto {
    final String familia = "ProductoPromocional";
    public ProductoPromocional(String idProducto, String nombre, double precio, String descripcion,
                               String familia) {
        super(idProducto, nombre, precio, descripcion,familia);
    }

    public String getFamilia(){
        return "Producto Promocional";
    }

    //sobreescritura la interfaz Vendible
    //todos los productos promocionales no son vendibles
    

    

   
    //a un producto promocional se le puede aplicar un descuento de hasta el 100%
    //sobre
    

    //SOBREESCRIBIR EL METODO obtenerDetalles
   

    //SOBREESCRIBIR EL METODO toString
   

    

    
}

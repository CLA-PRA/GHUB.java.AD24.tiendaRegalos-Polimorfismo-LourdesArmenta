package datos;

public class Inventario{
    
    //crear un arreglo de productos
   
    private int contador;

    public Inventario() {
        this.productos = new Producto[10];
        //inicializar el contador en 0
    }

    public Inventario(int capacidad) {
        this.productos = new Producto[capacidad];
       //inicializar el contador en 0
    }

    public Producto[] getProductos() {
        //retornar el arreglo de productos
    }


    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            //productos[contador] = producto;
            
        } else {
            System.out.println("Inventario lleno. No se puede agregar más productos.");
        }
    }

    public boolean eliminarProducto(String nombre) {
        
        //coloque el código faltante para eliminar un producto por nombre
        //retorne true si se elimina el producto y false en caso contrario
            
    }

    public boolean eliminarProducto(Producto producto) {
        //coloque el código faltante para eliminar un producto por objeto
        //retorne true si se elimina el producto y false en caso contrario
    }

    public Producto buscarProducto(String nombre) {
        //coloque el código faltante para buscar un producto por nombre
    }

    public double calcularValorTotalProductos() {
        //coloque el código faltante para calcular el valor total de los productos
    }

    public void aplicarDescuentoATodos(double porcentaje) {
        for (int i = 0; i < contador; i++) {
            productos[i].aplicarDescuento(porcentaje);
        }
    }

    public void mostrarInventario() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }


}
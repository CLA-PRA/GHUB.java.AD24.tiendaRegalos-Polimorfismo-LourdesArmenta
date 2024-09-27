
package datos;

//La clase Celular hereda de la clase ProductoElectronico
public class Celular {
   //atributos de la clase Celular
    final String familia = super.getFamilia();

    public Celular(String idProducto, String nombre, double precio, String descripcion, String familia
                    ,String marca, String modelo, String color, int garantia, String voltaje
                    ,int numCamaras, String sistemaOperativo, int capacidadAlmacenamiento, int ram, String tipoPantalla)
    {
        //invoque al constructor de la clase padre
       
        this.numCamaras = numCamaras;
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.ram = ram;
        this.tipoPantalla = tipoPantalla;
    }

    public int getNumCamaras() {
        return numCamaras;
    }

    public void setNumCamaras(int numCamaras) {
        this.numCamaras = numCamaras;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    @Override
    public String getFamilia(){
        //coloque el codigo para obtener la Familia de la clase padre
    }

    //sobreescritura del metodo obtenerDetalles de la clase ProductoElectronico y
    //agregando los atributos numCamaras, sistemaOperativo, capacidadAlmacenamiento, ram y tipoPantalla
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+"Celular [capacidadAlmacenamiento=" + capacidadAlmacenamiento + ", numCamaras=" + numCamaras + ", ram=" + ram + ", sistemaOperativo=" + sistemaOperativo + ", tipoPantalla=" + tipoPantalla + "]";
    }

    @Override
    //se le puede aplicar un descuento de hasta el 20%
    public boolean aplicarDescuento(double porcentaje) {
        //coloque el código faltante  
         
    }

    @Override
    public String toString() {

        return super.toString()+", capacidadAlmacenamiento=" + capacidadAlmacenamiento + 
                                ", numCamaras=" + numCamaras + ", ram=" + ram + 
                                ", sistemaOperativo=" + sistemaOperativo + ", tipoPantalla=" + 
                                   tipoPantalla;
    }

   

    @Override
    public boolean esVendible() {
        //coloque el código faltante ya qie un celular es vendible
    }
    
    

    
}
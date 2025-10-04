
public class Producto {
    private String id; //Identificador único del producto.
    private String nombre; // Nombre del producto.
    private double precio; // Precio del producto.
    private int cantidad; // Cantidad en stock.
    CategoriaProducto categoria; // Categoría del producto.

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public String mostrarId(){
        return id;
    } 
    
    public String mostrarNombre(){
        return nombre;
    }
    
    public double mostrarPrecio(){
        return precio;
    }
    
    public int mostrarCantidad(){
        return cantidad;
    }
    
    public CategoriaProducto mostrarCategoria(){
        return categoria;
    }
    
    public void mostrarInfo(){
        System.out.println("{Id:"+id
                           +",\n Nombre: "+nombre
                           +",\n Precio: "+precio
                           +",\n Cantidad: "+cantidad
                           +",\n Categoria: "+categoria+"}");
    }
    
    public void actualizarCantidad(int cantidad){
        this.cantidad += cantidad;
    }

    @Override
    public String toString() {
        return "\nProductoId: "+id 
                        +"{Nombre: "+nombre  
                        +", Precio: "+precio
                        +", Cantidad: " +cantidad
                        +", Categoria: "+categoria+"}";
    }
}

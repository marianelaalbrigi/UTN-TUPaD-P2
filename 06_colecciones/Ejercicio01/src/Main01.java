
public class Main01 {
    
    public static void main(String[] args) {
        //PUNTO 1: Creacion de Inventario y agregacion de productos.
        Inventario invent1 = new Inventario();
        invent1.agregarProducto(new Producto("0124","Blem", 10000, 100, CategoriaProducto.HOGAR));
        invent1.agregarProducto(new Producto("4131","Desiderata", 50000, 120, CategoriaProducto.ROPA));
        invent1.agregarProducto(new Producto("4512","Levis", 90000, 45, CategoriaProducto.ROPA));
        invent1.agregarProducto(new Producto("1001","Samsung", 300000, 60, CategoriaProducto.ELECTRONICA));
        invent1.agregarProducto(new Producto("90545","Lays", 3000, 52, CategoriaProducto.ALIMENTOS));
       
        //PUNTO 2: Listar los productos mostrando su info y categoria.
        System.out.println("---------------------- EJERCICIO 2 ----------------------");
        invent1.listarProductos();

        //PUNTO 3: Buscar un producto por ID y mostrar su información.
        System.out.println("---------------------- EJERCICIO 3 ----------------------");
        invent1.buscarProductoPorId("90545");        
             
        //PUNTO 4: Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\n---------------------- EJERCICIO 4 ----------------------");
        invent1.filtrarPorCategoria(CategoriaProducto.ROPA);
      
        //PUNTO 5: Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n---------------------- EJERCICIO 5 ----------------------");
        invent1.eliminarProducto("1001");
        System.out.println("---------------------------------------------------------");
        
        //Se comprueba que el producto ya no exista.
        invent1.buscarProductoPorId("1001");

        //PUNTO 6: Actualizar el stock de un producto existente.
        System.out.println("\n---------------------- EJERCICIO 6 ----------------------");
        invent1.actualizarStock("0124", 20);
        invent1.buscarProductoPorId("0124");

        //PUNTO 7: Mostrar el total de stock disponible
        System.out.println("\n---------------------- EJERCICIO 7 ----------------------");
        invent1.obtenerTotalStock();

        //PUNTO 8: Obtener y mostrar el producto con mayor stock.
        System.out.println("\n---------------------- EJERCICIO 8 ----------------------");
        System.out.println(invent1.obtenerProductoConMayorStock());

        //PUNTO 9: Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n---------------------- EJERCICIO 9 ----------------------");
        System.out.println(invent1.filtrarProductosPorPrecio(8000, 250000));

        //PUNTO 10: Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n---------------------- EJERCICIO 10 ----------------------");
        invent1.mostrarCategoriasDisponibles();
    }
    
}

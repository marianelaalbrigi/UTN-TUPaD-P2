import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    ArrayList<Producto> productos;  

    public Inventario() {
        this.productos=new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    
    public void listarProductos(){
        int i=0;
        for (Producto p : productos) {
            System.out.println("**** Producto #"+ ++i +" ****");
            p.mostrarInfo();
            System.out.println("\n");
        } 
    }
    
    //ITERADOR 
    private Producto buscadorProductos(String id){
        Producto pBuscado = null;
        Iterator <Producto> iter = this.productos.iterator();
        while(iter.hasNext() && pBuscado == null){
            Producto pIterado = iter.next();
            if(pIterado.mostrarId().equalsIgnoreCase(id)){
                pBuscado = pIterado;
            }
        } return pBuscado;
    }
    
    public void buscarProductoPorId(String id) {
        if(buscadorProductos(id) != null){
           buscadorProductos(id).mostrarInfo();
       } else {
           System.out.println("No se ha encontrado al Producto.");
       }       
    }
    
    public void eliminarProducto(String id){
        if(buscadorProductos(id) != null){
           Producto pBuscado=buscadorProductos(id);
           System.out.println("Se ha eliminado el siguiente producto: ");
           pBuscado.mostrarInfo();
           productos.remove(pBuscado); 
       } else {
           System.out.println("No se ha encontrado al Producto.");
       }
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        if(buscadorProductos(id) != null){
           Producto pBuscado=buscadorProductos(id);
           System.out.println("Se agregaron "+ nuevaCantidad + " unidades a "+ pBuscado.mostrarNombre());
           pBuscado.actualizarCantidad(nuevaCantidad);
       } else {
           System.out.println("No se ha encontrado al Producto.");
       }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria){
        for (Producto p : productos) {
            if(p.mostrarCategoria()==categoria){
                p.mostrarInfo();
                System.out.println("--------------------");
            }
        }
    }
    
    public void obtenerTotalStock(){
        int sumTotal = 0; 
        System.out.println("---------- Cantidades por producto ----------");   
        for (Producto p : productos) {
            System.out.println("-Id: "+p.mostrarId()+" - "+p.mostrarNombre()+" > "+p.mostrarCantidad());
            sumTotal+= p.mostrarCantidad();
        }
        System.out.println("----------------------------------------------");
        System.out.println("Total Stock: "+ sumTotal);
        System.out.println("----------------------------------------------");
    }
    
    public ArrayList <Producto> obtenerProductoConMayorStock(){
        int mayor = -1; 
        ArrayList <Producto> maxList= new ArrayList<>();
        
        for (Producto p : productos) {
            if(p.mostrarCantidad()==mayor){
                maxList.add(p);
            } else {
                if(p.mostrarCantidad()>mayor){
                    maxList.clear();
                    mayor=p.mostrarCantidad();
                    maxList.add(p);
                }
            }  
        }
        return maxList;        
    }
    
    public ArrayList <Producto>  filtrarProductosPorPrecio(double min, double max){
        ArrayList <Producto> minMaxList= new ArrayList<>();
        for (Producto p : productos) {
            if(p.mostrarPrecio()<max && p.mostrarPrecio()>min){
                minMaxList.add(p);
            } 
        } return minMaxList;
    }
    
    public void mostrarCategoriasDisponibles(){
        for(Producto p: productos){            
            System.out.println(p.mostrarCategoria()+" {"+p.mostrarCategoria().getDescripcion()+"}");
        }
    }

    @Override
    public String toString() {
        return "Inventario: " + productos;
    }

}

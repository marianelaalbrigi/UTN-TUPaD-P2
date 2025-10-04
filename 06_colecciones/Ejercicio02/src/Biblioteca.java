
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros=new ArrayList<>();
 
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros(){
        for(Libro elemento: libros){
            elemento.mostrarInfo();
        }
    }
    
    //ITERADOR 
    private Libro iteradorElementos(String x){
        Libro elemEncont=null;
        Iterator <Libro> iter = this.libros.iterator();
        while(iter.hasNext() && elemEncont==null){
            Libro elemBuscado = iter.next();
            if(elemBuscado.getIsbn().equalsIgnoreCase(x)){
                elemEncont=elemBuscado;
            }
        }   
        return elemEncont; 
    }
    
    public void buscarLibroPorIsbn(String isbn){
        if(iteradorElementos(isbn)!=null){
            iteradorElementos(isbn).mostrarInfo();
        } else {
            System.out.println("No se ha podido encontrar al libro.");
        }
    }
    
    public void eliminarLibro(String isbn){
       if(iteradorElementos(isbn) != null){
           Libro libroElim=iteradorElementos(isbn);
           System.out.println("Se ha eliminado el siguiente producto: ");
           libroElim.mostrarInfo();
           libros.remove(libroElim); 
       } else {
           System.out.println("No se ha encontrado al Producto.");
       }
    }
    
    public void obtenerCantidadLibros(){
        System.out.println("La biblioteca tiene un total de: "+ libros.size()+" libros");
    }
    
    public void filtrarLibrosPorAnio(int anio){
        List<Libro> librosxAnio = new ArrayList<>();
        
        for (Libro elemento:libros){
            if(elemento.getAnioPublicacion()==anio){
                librosxAnio.add(elemento);            
            }    
        }  System.out.println(librosxAnio);      
    }
    
    public void mostrarAutoresDisponibles(){
        for (Libro elemento:libros){
            System.out.println("Autores disponibles:\n");
            elemento.mostrarAutor();
        }
        
    }

    @Override
    public String toString() {
        return "Biblioteca {" + "nombre= " + nombre + ", libros= " + libros + '}';
    }
}

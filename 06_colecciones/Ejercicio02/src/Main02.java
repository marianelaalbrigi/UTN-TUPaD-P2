public class Main02 {

    public static void main(String[] args) {
        //PUNTO 1: Creamos una biblioteca.
        Biblioteca biblio1 = new Biblioteca("El aleph");
        
        //PUNTO 2: Crear al menos tres autores
        Autor autor1 = new Autor("01244","Gabriel García Marquez","Colombia");
        Autor autor2 = new Autor("00563","David Uclés","España");
        Autor autor3 = new Autor("02560","Dan Brown","Estados Unidos");
        Autor autor4 = new Autor("00255","Homero","Grecia");
        
        //PUNTO 3: Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblio1.agregarLibro("0254312218640", "Cien años de soledad",1987, autor1);       
        biblio1.agregarLibro("1024512155445", "La península de las casas vacías", 2024, autor2);
        biblio1.agregarLibro("0101376345432", "Ángeles y Demonios", 2000, autor3);
        biblio1.agregarLibro("0121554012154", "El Código da Vinci", 2003, autor3);
        biblio1.agregarLibro("0015401547897", "La ilíada", 1998, autor4);
        
        //PUNTO 4: Listar todos los libros con su información y la del autor.
        System.out.println("\n---------------------- EJERCICIO 4 ----------------------");
        biblio1.listarLibros();
        
        //PUNTO 5: Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n---------------------- EJERCICIO 5 ----------------------");
        biblio1.buscarLibroPorIsbn("0101376345432");
        
        //PUNTO 6: Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\n---------------------- EJERCICIO 6 ----------------------");
        biblio1.filtrarLibrosPorAnio(1987);
       
        //PUNTO 7:  Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n---------------------- EJERCICIO 7 ----------------------");
        biblio1.eliminarLibro("0015401547897");
        System.out.println("Listado actualizado:\n");
        biblio1.listarLibros();
        
        //PUNTO 8: Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n---------------------- EJERCICIO 8 ----------------------");
        biblio1.obtenerCantidadLibros();
                
        //PUNTO 9: Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n---------------------- EJERCICIO 9 ----------------------");
        biblio1.mostrarAutoresDisponibles();
       
    }
    
}

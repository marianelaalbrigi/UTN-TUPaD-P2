public class Libro {
    private String titulo, autor, anioPublicacion;
    private boolean tituloReg = false;
    private boolean autorReg = false;

    public Libro(String titulo, String autor, String anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro() {
    }
        

    public String getTitulo() {
        return titulo;
    }

    
    /**
    * Asigna un título al libro.
    * <p>No se permite modificar el título una vez registrado.
    * El título no puede ser nulo ni vacío.</p>
    *
    * @param titulo el título a asignar.
    */
    public void setTitulo(String titulo) {
        try {
            if(tituloReg){
                throw new IllegalStateException ("Error! Ya se existe un título en este registro.");
            }
            if (titulo == null || titulo.trim().equals("")){
                    throw new IllegalArgumentException ("Error! No ha ingresado un nombre en título.");
            }            
            this.titulo = titulo;
            tituloReg = true;    
        }         
        catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());      
        }
    }

    
    public String getAutor() {
        return autor;
    }

    
    /**
    * Asigna el nombre del autor.
    * <p>No se permite modificar el nombre una vez establecido.
    * El nombre no puede ser nulo, vacío ni contener números.</p>
    *
    * @param autor el nombre del autor a asignar.
    */
    public void setAutor(String autor) {
        try {
            if(autorReg){
                throw new IllegalStateException ("Error! Ya existe un nombre para el autor.");
            }
            else {
                if (autor == null || autor.trim().equals("")){
                    throw new IllegalArgumentException ("Error! Ingrese un nombre valido para autor.");
                } 
                else {
                    for (int i = 0; i < autor.length(); i++) {
                        if (Character.isDigit(autor.charAt(i))) {
                            throw new IllegalStateException("Error! El nombre de autor no puede contener números.");
                        }
                    }
                } 
            }            
            this.autor = autor;
            autorReg = true;    
        }         
        catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());      
        }      
    }

    
    public String getAnioPublicacion() {
        return anioPublicacion;
    }
    
    
    /**
    * Establece el año de publicación de un libro.
    * <p>Si no se ha registrado un título previamente, se muestra un error.
    * Si el año es 0, se asigna "Desconocido".</p>
    *
    * @param anioValidacion el año de publicación a validar.
    */
    public void setAnioPublicacion(int anioValidacion) {
        try {
            if (!tituloReg) {
               throw new IllegalStateException("Error! Primero debe registrar un título.");
            } 
            if (anioValidacion == 0) {
                anioPublicacion = "Desconocido";
                System.out.println("El Año de publicación se registrará como Desconocido.");
            } else {            
                this.anioPublicacion = Integer.toString(anioValidacion);
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    /**
    * Muestra en consola la información del libro.
    * Se imprime el título, el autor y el año de publicación.
    */
    public void mostrarInfo (){
        System.out.println("**** INFORMACIÓN DEL LIBRO ****"+
                "\n Título: "+ this.titulo +
                "\n Autor: "+ this.autor +
                "\n Año de publicación: " + this.anioPublicacion);
    }

}

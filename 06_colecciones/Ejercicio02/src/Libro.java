
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAnioPublicacion(anioPublicacion);
    }
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this (isbn, titulo,  anioPublicacion);
        this.autor=autor;
    }
    
    //SETTERS
    public void setIsbn(String isbn) {
        if(isbn!=null){
            this.isbn = isbn;
        }
    }

    public void setTitulo(String titulo) {
        if(titulo!=null){
            this.titulo = titulo;
        }    
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion!=0){
            this.anioPublicacion = anioPublicacion;
        }    
    }
    
    //GETTERS
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    //OTROS METODOS    
    public void mostrarInfo(){
        System.out.println("{Isbn:"+isbn
                           +",\n Titulo: "+titulo
                           +",\n Año de Publicacion: "+anioPublicacion
                           +",\n Autor: "+autor.getNombre()+"}\n");
    }
    
    public void mostrarAutor(){
        System.out.println(autor.getNombre()+" ("+ autor.getNacionalidad()+")");
    }
    
    @Override
    public String toString() {
        return "Libro {" + "isbn= " + isbn + ", titulo= " + titulo + ", anioPublicacion= " + anioPublicacion + "} // "+ autor;
    }
}

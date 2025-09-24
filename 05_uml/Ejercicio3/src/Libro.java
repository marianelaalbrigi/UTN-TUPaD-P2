public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Editorial editorial) {
        if(titulo!=null && isbn!=null && editorial!=null){
            this.titulo = titulo;
            this.isbn = isbn;
            this.editorial = editorial;
        }
    }
    
    public void setAutor(Autor autor){
      
        if (autor!=null && this.autor != null && this.autor != autor) {
            System.out.println("Este libro ya tiene un autor asignado");
            return;
        }
        
        if(autor !=null && this.getAutor()==null){
            this.autor = autor;
         
        } 
    }
    
    public Autor getAutor(){
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        if(autor==null || this.getAutor()==null){
            return "Libro {" + "titulo= " + titulo + ", isbn= " + isbn +"}\n" + editorial +"}\n{Autor: no asignado}";
        }else {
            return "Libro {" + "titulo= " + titulo + ", isbn= " + isbn +"}\n"+autor+"}\n" + editorial;
        }
    }
}

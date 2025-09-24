
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        if(titulo==null || artista==null){
            System.out.println("Error. Debe ingresar el título de la canción y el nombre del artista.");
            return;
        }else {
            this.titulo = titulo;
            this.artista = artista;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        if(artista!=null && this.getArtista()!=null && this.getArtista()!=artista){
            System.out.println("La canción ya tiene asignado el artista: " + this.getArtista().getNombre());
            return;
        }
        
        if(artista!=null && this.getArtista()==null){
            this.artista=artista;
        }
    }

    @Override
    public String toString() {
        return "Cancion {" + "titulo= " + titulo + "}\n" + artista;
    }
    
    
    
    
}

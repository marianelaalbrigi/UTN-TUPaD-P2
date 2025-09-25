
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        if(titulo==null){
            System.out.println("Error. Debe ingresar el título de la canción y el nombre del artista.");
            return;
        }else {
            this.titulo = titulo;
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

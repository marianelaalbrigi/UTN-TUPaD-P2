
public class Main11 {

    public static void main(String[] args) {
        Reproductor reproductor1 = new Reproductor();
        Artista artista1 = new Artista ("Tool","Post-metal");
        Cancion cancion1 = new Cancion ("Vicarious");
        cancion1.setArtista(artista1);
                
        reproductor1.reproducir(cancion1);        
    }    
}

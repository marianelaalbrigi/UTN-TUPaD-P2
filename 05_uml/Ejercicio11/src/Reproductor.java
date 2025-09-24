
public class Reproductor {

    public Reproductor() {
    }  
    
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo...\nCancion: "
                +cancion.getTitulo()
                +"\n"+cancion.getArtista());        
    }
}

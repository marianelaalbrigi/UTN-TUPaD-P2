
public class Main14 {

    public static void main(String[] args) {
        EditorVideo premiere = new EditorVideo();
        Proyecto proj1 = new Proyecto("Trailer_01", "2min");
       
        premiere.exportar(".avi", proj1);
    }
    
}

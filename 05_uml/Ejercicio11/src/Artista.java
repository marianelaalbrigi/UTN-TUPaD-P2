
public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        if(nombre==null || genero==null){
            System.out.println("Error. Debe ingresar un nombre y un género.");
            return;
        } else {
            this.nombre = nombre;
            this.genero = genero;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista {" + "nombre= " + nombre + ", genero= " + genero + '}';
    }
    
}

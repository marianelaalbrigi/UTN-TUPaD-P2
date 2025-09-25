
public class Proyecto {
    private String nombre;
    private String duracionMin;
    private Render render;

    public Proyecto(String nombre, String duracionMin) {
        if(nombre==null && duracionMin==null){
            System.out.println("Debe completar el nombre y la duración mínima del proyecto.");
            return;
        } else {
            this.nombre = nombre;
            this.duracionMin = duracionMin;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(String duracionMin) {
        this.duracionMin = duracionMin;
    }

    public Render getRender() {
        return render;
    }

    public void setRender(Render render) {
        if(render!=null && this.getRender()!=null && this.getRender()!=render){
            System.out.println("El proyecto ya fue renderizado.");
            return;
        } else {
           this.render = render; 
        }
    }

    @Override
    public String toString() {
        return "Proyecto {" + "nombre= " + nombre + ", duracionMin= " + duracionMin + ", " + render;
    }
    
}

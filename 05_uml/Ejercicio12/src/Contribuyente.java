
public class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        if(nombre==null || cuil==null){
            System.out.println("Error. Debe ingresar un nombre y un género.");
            return;
        } else {
            this.nombre = nombre;
            this.cuil = cuil;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente {" + "nombre= " + nombre + ", cuil= " + cuil + '}';
    }
   
    
}

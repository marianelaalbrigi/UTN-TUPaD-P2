
public class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        if(nombre == null || especialidad == null){
            System.out.println("El nombre y el mail no pueden ser nulos.");
            return;
        } else {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

   
    @Override
    public String toString() {
        return "Profesional {" + "nombre= " + nombre + ", especialidad= " + especialidad + '}';
    }
    
    
    
}


public class Paciente {
    private String nombre;
    private String obraSocial;
    private CitaMedica turno;
    
    public Paciente(String nombre, String obraSocial) {
        if(nombre == null || obraSocial == null){
            System.out.println("El nombre y el mail no pueden ser nulos.");
            return;
        } else {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }


    @Override
    public String toString() {
        return "Paciente {" + "nombre= " + nombre + ", obraSocial= " + obraSocial +"}";
    }
    
}

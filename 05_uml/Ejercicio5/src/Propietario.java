
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora pc;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPc(Computadora pc) {
        
        if(pc!=null && pc.getPropietario()!=null && pc.getPropietario()!=this){
            System.out.println("Esta PC ya tiene un propietario.");
            return;  
        }
        if(pc!=null && this.pc!=null && this.pc!=pc){
            System.out.println("Este propietario ya tiene un PC asignada.");
            return;  
        }
        this.pc = pc;
        
        if(pc!=null && pc.getPropietario()==null){
            pc.setPropietario(this);
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getPc() {
        return pc;
    }

    @Override
    
    public String toString() {
        if(pc==null){
        return "Propietario {" + "nombre= " + nombre + ", dni= " + dni + "\nComputadora {sin pc asignada}";
        }
        return "Propietario {" + "nombre= " + nombre + ", dni= " + dni + "\n" + pc;
    }
    
}


public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo auto;

    public Conductor(String nombre, String licencia) {
        if(nombre!=null && licencia!=null){
            this.nombre = nombre;
            this.licencia = licencia;
        }        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        if(auto!=null && auto.getConductor()!=null && auto.getConductor()!=this){
            System.out.println("Error.Este vehículo pertenece a otro conductor.");
            return;
        }
        
        if(auto!=null && this.getAuto()!=null && this.getAuto()!=auto){
            System.out.println("El conductor ("+this.getNombre()+") ya tiene un vehículo asignado.");
            return;
        }
        
        this.auto = auto; 
        if(auto!=null && auto.getConductor()==null){
           auto.setConductor(this);
        }        
    }

    @Override
    public String toString() {
        if (auto == null){
            return "Conductor {" + "nombre= " + nombre + ", licencia= " + licencia +"}\nAuto {no tiene auto asignado}";
        }
        return "Conductor {" + "nombre= " + nombre + ", licencia= " + licencia +"}\n"+ auto;
    }
    
    
    
    
}

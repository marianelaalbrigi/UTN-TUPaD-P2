
public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        if(patente!=null && modelo!= null && motor!= null){
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;        
        }
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if(patente!=null){
        this.patente = patente;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo!=null){ 
        this.modelo = modelo;
        }
    }
    
    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        if(conductor!=null && conductor.getAuto()!=null && conductor.getAuto()!=this){
            System.out.println("El conductor ("+conductor.getNombre()+") ya tiene un auto asignado ("+conductor.getAuto().getPatente()+").");
            return;
        }
        
        if(conductor!=null && this.getConductor()!=null && this.getConductor()!=conductor){
            System.out.println("El vehículo ya tiene un conductor asignado.");
            return;
        }
        
        this.conductor = conductor;
        
        if(conductor!=null && conductor.getAuto()==null){
            conductor.setAuto(this);
        }
    }

    @Override
    public String toString() {
        
        return "Vehiculo {" + "patente= " + patente + ", modelo= " + modelo + "}\n" + motor;
    }
    
}

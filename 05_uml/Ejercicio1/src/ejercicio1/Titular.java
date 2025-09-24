package ejercicio1;

import ejercicio1.Pasaporte;
import java.util.Objects;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    public Titular (String nombre, String dni){
	this.nombre = nombre;
	this.dni = dni;
    }
	
    public void setPasaporte(Pasaporte pasaporte){
        
        // Se valiDa si al ESTE TITULAR se le intenta dar un Pasaporte distinto al que ya tiene:
        // (1) ESTE titular tiene pasaporte asignado? 
        // (2) El pasaporte a asignar tiene un titular que no es ESTE titular? 
        // Si el titular tiene pasaporte, y ese pasaporte es diferente al que tiene, entonces se advierte que ya el titular ya tiene un pasaporte.
        if (this.pasaporte != null && pasaporte.getTitular() != this) {    
            throw new IllegalStateException("El titular ya tiene un pasaporte asignado: " + this.pasaporte.getNumPasaporte()); 
        }
         
        //Se valida que el pasaporte no sea asignado a mas de un titular:
        if (pasaporte != null &&                //(1)El pasaporte existe? 
            pasaporte.getTitular() != null &&   //(3)El titular del pasaporte existe? (si el pasaporte tiene un titular)
            pasaporte.getTitular() != this ) {  //(4)El pasaporte pertenece ESTE titular u a otro? 
            
            throw new IllegalStateException("Este pasaporte ya pertenece a otra persona: " + pasaporte.getTitular().getNombre());
        } 
        
        //A ESTE titular se le asigna el pasaporte.
        if(pasaporte!=null)
        this.pasaporte = pasaporte; 
        
        //Le asigno al pasaporte este titular (Bidireccionalidad)
        if (pasaporte != null && pasaporte.getTitular() == null) {
            pasaporte.setTitular(this); 
        }
    }
    
    public Pasaporte getPasaporte(){
        return pasaporte;
    }
    
    public String getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString() {
        if (pasaporte == null){
             return "Titular {" + "nombre= " + nombre + ", dni= " + dni + ", Pasaporte: sin pasaporte asociado}"; 
        } else {
            return "Titular {" + "nombre= " + nombre + ", dni= " + dni + "} \n" + pasaporte;
        }  
    }
}

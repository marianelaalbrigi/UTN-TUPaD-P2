package ejercicio1;

import ejercicio1.Foto;
import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;
    

    //CONSTRUCTOR 
    public Pasaporte(String numero, String ilustracion, String formato) {
            fechaEmision = LocalDate.now();
            this.numero = numero;
            this.foto = new Foto(ilustracion, formato);
    }
    
    public void setTitular(Titular titular){
        if (this.titular != null && this.titular != titular) {
        // Este pasaporte ya tiene titular, no se puede cambiar
            throw new IllegalStateException("Este pasaporte ya tiene un titular: " + this.titular.getNombre());
        }

        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); // Mantener bidireccionalidad
        }
    }

    public String getNumPasaporte(){
	return numero;
    }

    public Titular getTitular(){
	return titular;
    }
    
    public void mostrarFoto(){
        System.out.println(foto.getFoto());           
    }
    
    @Override
    public String toString() {
        return "Pasaporte {" + "numero= " + numero + ", fechaEmision= " + fechaEmision +"} \n"+ foto;     
    }
}

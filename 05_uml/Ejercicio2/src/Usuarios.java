
public class Usuarios {
    private String nombre;
    private String dni;
    private Celulares cel;
    
    public Usuarios(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
         if (dni != null){
             this.dni = dni;
        } 
    }
        
    public void setCelular(Celulares cel){
        //Verifica si el celular existe, si tiene asignado un usuario
        if(cel != null && cel.getUsuario() != null && cel.getUsuario() != this){
            throw new IllegalStateException("Este celular ya tiene el titular asignado:\n" + cel.getUsuario());           
        }
        
        // Verifica Si el cel existe y no tiene asignado
        this.cel=cel;
        if (cel != null && cel.getUsuario() !=this) {
            cel.setUsuario(this);   
        }     
    }
        
    public Celulares getCelular(){
        return cel;
    }

    @Override
    public String toString() {
        return "Usuario {" + "nombre= " + nombre + ", dni= " + dni +"}\n"+ cel;
        
        
    }  
    
}

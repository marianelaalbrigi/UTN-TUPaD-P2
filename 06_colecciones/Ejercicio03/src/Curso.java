
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    //GETTERS
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
            return nombre;
    }
    
    public Profesor getProfesor() {
            return profesor;
    }
    
    //SETTERS
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(Profesor nuevoProfesor) {
            
        if (this.profesor!=null){
            this.profesor.eliminarCurso(this);
        }
        
        this.profesor = nuevoProfesor;
        
        if(nuevoProfesor!=null && !this.profesor.getCursos().contains(this)){
            nuevoProfesor.agregarCurso(this);            
        }        
    }
    
    public void mostrarInfo(){
        System.out.println("{Codigo:"+codigo+",\nNombre: "+nombre+"\nProfesor: ");
        if(profesor != null){
            System.out.println(profesor.getNombre());
        } else {
            System.out.println("sin asignación");
        } 
    }
    
    
    
    
}

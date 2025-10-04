
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos= new ArrayList<>();

    public Profesor(String id, String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public Profesor(String id, String nombre, String especialidad) {
        setId(id);
        setNombre(nombre);
        setEspecialidad (especialidad);
    }
    
    //GETTERS
    public String getId() {
        return id;
    }
    
    public String getNombre() {
           return nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    //SETTERS
    public void setId(String id) {
        this.id = id;
    } 
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public void agregarCurso(Curso curso){
        if(curso==null){
            System.out.println("El curso no puede ser nulo.");
            return;
        }
        
        if(!cursos.contains(curso)){
            cursos.add(curso); 
            if(curso.getProfesor()!=this){
                curso.setProfesor(this);            
            }
        }
    }
    
    public void eliminarCurso(Curso curso){
        if(curso!=null && cursos.contains(curso)){
            cursos.remove(curso);
            if(curso.getProfesor()==this){
                curso.setProfesor(null);
            }
        }
    }
    
    public void listarCursos(){
        System.out.println("El profesor: "+ this.nombre);
        if(cursos.isEmpty()){
            System.out.println("no tiene cursos asignados");
        } else {
            System.out.println("tiene asignado:");
            for(Curso elemento: cursos){
                System.out.println(elemento.getNombre());
            }
        }    
    }
    
    public void mostrarInfo(){
        System.out.print("{Id:"+id+",\nNombre: "+nombre+"\nCantidad de cursos: ");
        if(cursos.isEmpty()){
            System.out.println("0");
        } else {
           System.out.println(cursos.size());
        } 
    }

    @Override
    public String toString() {
        return "Profesor{ " + "id= " + id + ", nombre= " + nombre + ", especialidad= " + especialidad + '}';
    }
    
    
}

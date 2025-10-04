
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Curso> cursos= new ArrayList<>();
    private List<Profesor> profesores= new ArrayList<>();

    public Universidad(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public List<Profesor> getProfesores() {
        return Collections.unmodifiableList(profesores);
    }

    
    public void setNombre(String nombre) {
        if(nombre==null){
            System.out.println("Debe ingresar un nombre.");
        } else
            this.nombre = nombre;
    }
        
    public void agregarProfesor(Profesor p){
        if(p != null && !profesores.contains(p)){
            profesores.add(p);
        }
    }
    public void agregarCurso(Curso c){
        if(c != null && !profesores.contains(c)){
            cursos.add(c);
        }
    }
    
    public Profesor iterarProfesores(String id){
        Profesor profEncont=null;
            Iterator <Profesor> piter = this.profesores.iterator();
            while(piter.hasNext() && profEncont==null){
                Profesor profeIterado = piter.next();
                if(profeIterado.getId().equalsIgnoreCase(id)){
                    profEncont=profeIterado;
                }
            }   return profEncont;    
    }
    
    
    private Curso iterarCursos(String id){
        Curso cursoEncont=null;
        Iterator <Curso> citer = this.cursos.iterator();
        while(citer.hasNext() && cursoEncont==null){
            Curso cursoIterado = citer.next();
            if(cursoIterado.getCodigo().equalsIgnoreCase(id)){
                cursoEncont=cursoIterado;
            }
        } 
        return cursoEncont;    
    }
        
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor profEncont = iterarProfesores(idProfesor);
        Curso cursoEncont = iterarCursos(codigoCurso);
        
        if (cursoEncont == null) {
        System.out.println("No se encontró el curso con código: " + codigoCurso);
        return;
        }

        if (profEncont == null) {
        System.out.println("No se encontró el profesor con id: " + idProfesor);
        return;
        }
        
        cursoEncont.setProfesor(profEncont);
    }
    
        
    public void  listarProfesores() {
        for(Profesor elemento: profesores){
            System.out.println(elemento.getNombre());
        }
    }
            
    public void listarCursos(){
        for(Curso elemento: cursos){
            System.out.println(elemento.getNombre());
        }
    }
    
    public void buscarProfesorPorId(String id){
        Profesor profEncontrado = iterarProfesores(id);
        if(profEncontrado==null){
            System.out.println("No se encontró al profesor.");
        } else {
            profEncontrado.mostrarInfo();
        }
    }
    
    public void buscarCursoPorCodigo(String codigo){
        Curso cursoEncontrado = iterarCursos(codigo);
        if(cursoEncontrado==null){
            System.out.println("No se encontró el curso.");
        } else {
            cursoEncontrado.mostrarInfo();
        }
    }
    
    public void eliminarCurso(String codigo){
        Curso cursoEncontrado = iterarCursos(codigo);
        if(cursoEncontrado==null){
            System.out.println("No se encontró el curso.");
        } else {
            if(cursoEncontrado.getProfesor()!=null) {
                cursoEncontrado.getProfesor().eliminarCurso(cursoEncontrado);
            }
            cursos.remove(cursoEncontrado);
        }     
    }
    
    public void eliminarProfesor(String id) {
        Profesor profEncontrado = iterarProfesores(id);
        if(profEncontrado==null){
            System.out.println("No se encontró al profesor.");
        } else {
            List <Curso> listaCurso = new ArrayList<>(profEncontrado.getCursos());
            for(Curso elemento: listaCurso){
                elemento.setProfesor(null);
            } profesores.remove(profEncontrado);
        }
    }
}

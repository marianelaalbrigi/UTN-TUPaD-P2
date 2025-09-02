public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    //Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    //Constructor vacío
    public Estudiante() {
    }

    //Get and Set de Nombre
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }
    }
    
    //Get and Set de Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null){
            this.apellido = apellido;
        }  
    }
    
    //Get and Set de Curso
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Get de Calificacion
    public double getCalificacion() {
        return calificacion;
    }

    //Métodos propios
    public void mostrarInfo() {
        System.out.println("**** INFORMACIÓN DEL ESTUDIANTE ****"+
                "\n Nombre: "+ nombre +
                "\n Apellido: "+ apellido +
                "\n Calificación: " + calificacion);
    }
    
    //Para reducir puntos: los puntos pueden ser entre 1 y 10 y, a su vez,  
    //la cantidad de puntos a reducir debe ser menor o igual a la calificacion.
    public void bajarCalificacion(double puntos) {
        if (puntos > 0 && puntos < 11){
            
            if(puntos <= calificacion){
                calificacion-=puntos;
            }    
        }    
    }
    
    //Para aumentar puntos: los puntos pueden ser entre 1 y 10 y, a su vez, 
    //los puntos que le adicionemos a calificacion no pueden darnos una calificacion
    //mayor a 10.
    public void subirCalificacion(double puntos) {       
        if(puntos > 0 && puntos < 11){
            if((puntos + calificacion) < 11){
                calificacion+=puntos;
            } 
        }  
    }
    
}

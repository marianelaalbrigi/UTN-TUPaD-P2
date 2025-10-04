public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    public Autor() {
    }
    
    public Autor(String id, String nombre, String nacionalidad) {
        setId(id);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }
    
    //GETTERS
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    //SETTERS
    public void setId(String id) {
        if(id!=null){
            this.id = id;
        }    
    }

    public void setNombre(String nombre) {
        if(nombre!=null){
            this.nombre = nombre;
        }
    }

    public void setNacionalidad(String nacionalidad) {
        if(nacionalidad!=null){
            this.nacionalidad = nacionalidad;
        }    
    }
    
    
    //OTROS METODOS    
    public void mostrarInfo(){
        System.out.println("{Id:"+id
                           +",\n Nombre: "+nombre
                           +",\n Nacionalidad: "+nacionalidad+"}");
    }

    @Override
    public String toString() {
        return "Autor {" + "id= " + id + ", nombre= " + nombre + ", nacionalidad= " + nacionalidad + "}";
    }    
}

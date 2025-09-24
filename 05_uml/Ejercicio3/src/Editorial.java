public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        if(nombre != null & direccion != null){
            this.nombre = nombre;
            this.direccion = direccion;
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Editorial {" + "nombre= " + nombre + ", direccion= " + direccion + '}';
    }

    
    
    
}

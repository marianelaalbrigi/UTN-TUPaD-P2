public class Banco {
    private String cuit;
    private String nombre;
   
    public Banco(String cuit, String nombre) {
        this.cuit = cuit;
        this.nombre = nombre;
    }
       
    public String getCuit() {
        return cuit;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Banco{ " + "cuit =" + cuit + ", nombre= " + nombre + '}';
    }
    
}

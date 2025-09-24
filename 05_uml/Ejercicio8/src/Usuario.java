
public class Usuario {
    private String nombre;
    private String mail;

    public Usuario(String nombre, String mail) {
        if(nombre == null || mail == null){
            System.out.println("El nombre y el mail no pueden ser nulos.");
            return;
        } else {
            this.nombre = nombre;
            this.mail = mail;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "\nUsuario {" + "nombre= " + nombre + ", mail= " + mail + '}';
    }
    
    
    
    
}

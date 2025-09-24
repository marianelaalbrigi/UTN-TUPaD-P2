
import java.time.LocalDate;

public class ClaveSeguridad {
    private String codigo;
    private LocalDate fechaModificacion;

    public ClaveSeguridad(String codigo) {
        if(codigo == null){
            System.out.println("Error! Debe ingresar una clave de seguridad.");
            return;
        } else {
           this.codigo = codigo;
           fechaModificacion = LocalDate.now();
        }
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
        fechaModificacion = LocalDate.now();
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad {" + "codigo= " + codigo + ", fechaModificacion= " + fechaModificacion + '}';
    }
}

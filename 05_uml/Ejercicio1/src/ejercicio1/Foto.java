package ejercicio1;


import java.util.Objects;

public class Foto {
    private String foto;
    private String formato;
    
    public Foto(String foto, String formato) {
        if (foto != null && formato != null) {
            this.foto = foto;
            this.formato = formato;
        }
    }

    public String getFoto() {
        return foto;
    }
    
    @Override
    public String toString() {
        return ("Foto {" + "Foto= "+ foto + ", Formato= " + formato+"}");   
    }
       
}

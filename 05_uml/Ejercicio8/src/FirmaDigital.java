
import java.time.LocalDate;
import java.util.Objects;


public class FirmaDigital {
    private LocalDate fecha;
    private int codigoHash;
    private Usuario user;
    
    public FirmaDigital(Usuario user) { // El constructor sin parametros, se genera la info automaticamente
        if(user==null){
            System.out.println("Debe ingresar un usuario");
            return; 
        } else {
            codigoHash = generarCodigoHash(); //llamo al metodo generar hashcode
            this.fecha = LocalDate.now();
            this.user = user;
        }    
    }

   
    private LocalDate getFecha() {
        return fecha;
    }

    private int generarCodigoHash() {
        codigoHash = hashCode(); //llamo al metodohashcode
        return codigoHash;
    }
  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigoHash);
        hash = 89 * hash + Objects.hashCode(this.fecha);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FirmaDigital other = (FirmaDigital) obj;
        if (!Objects.equals(this.codigoHash, other.codigoHash)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    @Override
    public String toString() {
        return "FirmaDigital {fecha= " + fecha + ", codigoHash= " + codigoHash +"}"+user;
    }
    
}


public class Motor {
    private String tipo;
    private String numSerie;

    public Motor(String tipo, String numSerie) {
        if (tipo!=null && numSerie!=null){    
            this.tipo = tipo;
            this.numSerie = numSerie;
        }
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getNumSerie() {
        return numSerie;
    }

    @Override
    public String toString() {
        return "Motor {" + "tipo= " + tipo + ", numSerie= " + numSerie + '}';
    }
    
    
}


public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre mother;

    public Computadora(String marca, String numeroSerie, String modeloMother, String chip) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.mother = new PlacaMadre(modeloMother,chip);
    }

    public void setPropietario(Propietario propietario) {
        if(propietario!=null && propietario.getPc()!=null && propietario.getPc()!=this){
            System.out.println("Este propietario ya tiene una PC asignada.");
            return;  
        }
        
        if(propietario!=null && this.getPropietario()!=null && this.getPropietario()!=propietario){
            System.out.println("Esta PC ya tiene un propietario.");
            return;  
        }
        
        this.propietario = propietario;
        if(propietario!=null && propietario.getPc()==null){
            propietario.setPc(this);
        }
    }
    public Propietario getPropietario() {
        return propietario;
        
        
    }public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        if(propietario == null){
            return "Computadora {" + "marca= " + marca + ", numeroSerie= " + numeroSerie + "\n" + mother + "\nPropietario {Sin propietario asignado}";
        }
        return "Computadora {" + "marca= " + marca + ", numeroSerie= " + numeroSerie + ", mother= " + mother;
    }

}

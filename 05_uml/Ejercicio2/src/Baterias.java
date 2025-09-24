
public class Baterias {
    private String modelo;
    private int capacidad;

    public Baterias(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    
    public int getCapacidad() {
        return capacidad;
    }

    
    @Override
    public String toString() {
        return "Bateria {" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
    
}

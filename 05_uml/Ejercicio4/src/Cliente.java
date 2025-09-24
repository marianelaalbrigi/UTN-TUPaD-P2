
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaCredito tarjeta;

    public Cliente(String nombre, String dni){
        if(dni!=null && nombre!=null){
            this.dni = dni;
            this.nombre = nombre;
        }
    }
    
    public void setTarjeta(TarjetaCredito tarjeta){
        if(tarjeta!=null && tarjeta.getCliente()!=null && tarjeta.getCliente()!=this){
            System.out.println("Esta tarjeta ya fue asignada a un cliente.");
            return;  
        }
        if (tarjeta!=null && this.tarjeta!=null && this.tarjeta!= tarjeta) {
            System.out.println("Este cliente ya tiene asignado una tarjeta.");
            return; 
        }
        this.tarjeta = tarjeta;
        if (tarjeta!=null && tarjeta.getCliente()==null) {
            tarjeta.setCliente(this);
        }
    }
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    @Override
    public String toString() {
        if(tarjeta == null){
            return "Cliente {" + "dni= " + dni + ", nombre= " + nombre + "}\nTarjeta {sin tarjeta asociada}";
        }   
        return "Cliente {" + "dni= " + dni + ", nombre= " + nombre + "}\n" + tarjeta;
    }
    
}

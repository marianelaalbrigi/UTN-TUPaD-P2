
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private LocalTime hora;
    private LocalDate fecha;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(LocalTime hora, LocalDate fecha, Mesa mesa) {
        if(hora == null || fecha == null || mesa == null){
            System.out.println("Error. No se ha guardado la reserva.");
            return;    
        }else{
            this.hora = hora;
            this.fecha = fecha;
            this.mesa = mesa;
        }
    }
    
    public void setCliente(Cliente cliente){
        if(cliente!=null && this.cliente!=null && this.cliente!=cliente){
            System.out.println("La reserva esta a nombre de otro cliente.");
            return;
        }
        
        if(cliente!=null && this.cliente==null){
            this.cliente=cliente;
        }
    }

    public LocalTime getHora() {
        return hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Reserva {" + "hora= " + hora + ", fecha= " + fecha + "}\n" + cliente + "\n" + mesa;
    }
    
}

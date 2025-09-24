
import java.time.LocalDate;
import java.time.LocalTime;


public class Main6 {

    public static void main(String[] args) {
        Cliente pers1 = new Cliente("Julia", "1512");
        Mesa mesa1 = new Mesa (5,6);
        Reserva reserva1 = new Reserva (LocalTime.of(21,30), LocalDate.of(2025,11,1), mesa1);
        
        //Asigno la reserva a pers1
        reserva1.setCliente(pers1);
        
        //Imprimo datos de la reserva
        System.out.println(reserva1);
    }
    
}


import java.time.LocalDate;
import java.time.LocalTime;

public class Main9 {
    
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Julia", "Osde");
        Profesional profesional1 = new Profesional("Dra. Diaz", "Pediatra");
        CitaMedica cita1 = new CitaMedica (LocalDate.of(2025,11,1), LocalTime.of(11,30));
        
        //Asigno al profesional y el paciente la cita
        cita1.setMedico(profesional1);
        cita1.setPaciente(paciente1);
       
        //Imprimo datos de la cita
        System.out.println(cita1);
    }
    
}


import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private Paciente paciente;
    private Profesional medico;

    public CitaMedica(LocalDate fecha, LocalTime hora) {
         if(fecha == null || hora == null){
            System.out.println("Error! Debe completar la fecha y la hora para agendar una cita.");
            return;
        } else {
            this.fecha = fecha;
            this.hora = hora;
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {     
        if(paciente!=null){
            this.paciente = paciente;
        }
    }

    public Profesional getMedico() {
        return medico;
    }

    public void setMedico(Profesional medico) {
        if(medico!=null){
            this.medico = medico; 
        }
    }

    @Override
    public String toString() {
        return "CitaMedica {" + "fecha= " + fecha + ", hora= " + hora + "}\n" + paciente + "\n" + medico;
    }
      
      
}

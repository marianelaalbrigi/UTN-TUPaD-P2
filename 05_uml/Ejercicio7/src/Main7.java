
public class Main7 {

    public static void main(String[] args) {
        Motor motor1 = new Motor("Nafta", "XZ2E12222");
        Vehiculo auto1 = new Vehiculo("MIC123", "Ford", motor1);
        Conductor persona1= new Conductor("Esmeralda Goldstein", "32125584");
        
        //Asigno a al conductor1 el auto1
        persona1.setAuto(auto1);
        System.out.println("Imprimo info de " +persona1.getNombre());
        System.out.println(persona1);
        System.out.println("----------------------------------------------------");
        
        
        //Asigno al auto2 el propietario2
        Motor motor2 = new Motor("Diesel", "YCNS2222");
        Vehiculo auto2 = new Vehiculo("XIX23", "Volkswagen", motor1);
        Conductor persona2= new Conductor("Adrián Miranda", "27555178");
        
        //Intengo asignarle el auto2 a la persona1
        auto2.setConductor(persona1);
        System.out.println("----------------------------------------------------");
         
        //Le asigno el auto2 a la persona2
        auto2.setConductor(persona2);
        System.out.println("Imprimo info de " +persona2.getNombre());
        System.out.println(persona2);
        System.out.println("----------------------------------------------------");
        
    }
    
}

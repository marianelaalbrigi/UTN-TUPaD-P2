
public class Main5 {

    public static void main(String[] args) {
        //Creo propietario 1, pc 1 con los contructores
        Propietario persona1= new Propietario("Esmeralda Goldstein", "32125584");
        Computadora pc1 = new Computadora("BENQ", "1245","ASUS-ROG Strix", "B550");
        
        System.out.println("Imprimo info de " +persona1.getNombre());
        System.out.println(persona1);
        System.out.println("----------------------------------------------------");
        System.out.println("Imprimo info de " +pc1.getMarca()+" "+pc1.getNumeroSerie());
        System.out.println(pc1);
        System.out.println("----------------------------------------------------");
        
        //Asigno a al propietario1 la pc1
	persona1.setPc(pc1);
        System.out.println("Imprimo info de " +persona1.getNombre());
        System.out.println(persona1);
        System.out.println("----------------------------------------------------");
        
        //Intento asignarle al propietario 2 la pc del propietario1
        Propietario persona2= new Propietario("Roberto Ramirez", "12111111");
        persona2.setPc(pc1);
    }
}

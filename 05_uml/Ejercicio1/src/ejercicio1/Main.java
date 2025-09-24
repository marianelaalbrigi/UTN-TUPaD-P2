package ejercicio1;

import ejercicio1.Titular;
import ejercicio1.Pasaporte;

public class Main {

    public static void main(String[] args) {
        
        //Creo un titular y pasaporte con los contructores
        Titular persona1 = new Titular ("Mario Corral", "35123456");
        Pasaporte pass1 = new Pasaporte("A15458", "foto_A15458", "png");
	asignarPasaporte(persona1, pass1);
        
        System.out.println("Imprimo info del titular 1:");
        System.out.println(persona1);
        System.out.println("\n----------------------------------------------------");    
        
        //Creo un pasaporte con mi metodo, que impide que se cree un pasaporte con valores nulos.
        Pasaporte pass2 = crearPasaporte(null, null, null);
        System.out.println(pass2);
        System.out.println("-----------------------------------------------------");
        
        //Asigno a pass2 valores validos y creo un objeto persona2 y luego le asigno un pasaporte 
        pass2 = crearPasaporte("B123", "foto_B123", "png");
        Titular persona2 = new Titular ("Josefina Pereyra", "33987654");
	asignarPasaporte(persona2, pass2);
        System.out.println("Imprimo info del titular 2:");
        System.out.println(persona2);
        System.out.println("----------------------------------------------------");


        //Intento a asignarle a la Persona1 un pasaporte de Persona2
        asignarPasaporte(persona1, pass2);
        System.out.println("----------------------------------------------------");  
        
        //Imprimo a persona1, para chequear que el pasaporte no se modifico
        System.out.println(persona1);
        System.out.println("----------------------------------------------------\n");
       
        
    }
    // METODOS AUXILIARES DE VALIDACION
    
    
    private static Pasaporte crearPasaporte(String numero, String ilustracion, String formato){
        if (numero != null || ilustracion != null || formato != null) {
            return new Pasaporte (numero, ilustracion, formato);
        } else {
            System.out.println("Error! El pasaporte debe tener un número, una foto y un formato válidos.");
            return null;
        }
        
    }
    private static void asignarPasaporte(Titular persona, Pasaporte numero){
        try {
            persona.setPasaporte(numero);
        } catch (IllegalStateException e) {
            System.out.println("Error! "+e.getMessage());
        }
    }
   

    private static void asignarTitular(Titular persona, Pasaporte numero){
        try {
            numero.setTitular(persona);
        } catch (IllegalStateException e) {
            System.out.println("Error! "+e.getMessage());
        }
    }
    
}

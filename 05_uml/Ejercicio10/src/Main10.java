
public class Main10 {

    public static void main(String[] args) {
        //Creación de titular1, cuenta1
        Titular titular1 = new Titular("María Gonzalez", "33123456");
        CuentaBancaria cuenta1 = new CuentaBancaria(100000, "1234mmm");
        
        //A la cuenta1, le asigno el titular1
        cuenta1.setTitular(titular1);
       
        
        //Imprimo info del titular de la cuenta 1
        System.out.println(cuenta1.getTitular());
        System.out.println("---------------------------------------------------------");
        
        //Creación de titular2, cuenta2
        Titular titular2 = new Titular("Felipe Martinez", "54123485");
        CuentaBancaria cuenta2 = new CuentaBancaria(20000, "xxxxx");
        
        //Intento asignarle al titular2 una cuenta ya existente (cuenta1 de Maria Gonzalez)
        titular2.setCuenta(cuenta1);
        System.out.println("---------------------------------------------------------");
        
        //Le asigno al titular2 la cuenta2 sin titular
        titular2.setCuenta(cuenta2);
        
        //Imprimo info del titular2
        System.out.println(titular2);
        
    }
    
}

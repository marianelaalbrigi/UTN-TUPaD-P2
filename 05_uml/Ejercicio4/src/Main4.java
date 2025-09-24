public class Main4 {

    public static void main(String[] args) {
        //Creo cliente1, el banco1 y tarjetal con los contructores
        Cliente cliente1 = new Cliente ("Julio", "24152154");
        Banco banco1 = new Banco("Banco Nación", "1245");
        TarjetaCredito tarjeta1 = new TarjetaCredito ("2540 2150 1245 2154", "25/06/2029", banco1);
       
        //Asigno a cliente1 su tarjeta1
	cliente1.setTarjeta(tarjeta1);
        
        System.out.println("Imprimo info de " +cliente1.getNombre());
        System.out.println(cliente1);
        System.out.println("----------------------------------------------------");    
       
        //Creo cliente2 y tarjeta2 
        Cliente cliente2 = new Cliente ("Maria Rosa", "39245154");
        TarjetaCredito tarjeta2 = new TarjetaCredito ("3571 2150 4515 9845", "12/06/2031", banco1);
                        
        //Intento asignarle al cliente2 la tarjeta del cliente1
        cliente2.setTarjeta(tarjeta1);
        System.out.println("----------------------------------------------------"); 
         
        //Cheque no focault no tenga libro asignado
        System.out.println("Imprimo info de "+cliente2.getNombre());
        System.out.println(cliente2);
        System.out.println("----------------------------------------------------");
       
        //Intento asignarle a la tarjeta 2 al cliente 1 que ya tiene tarjeta
        tarjeta2.setCliente(cliente1);
        System.out.println("----------------------------------------------------"); 
      
        //Asigno tarjeta2 a cliente2
        tarjeta2.setCliente(cliente2);
        System.out.println("----------------------------------------------------"); 
        System.out.println("Imprimo info de "+cliente2.getNombre());
        System.out.println(cliente2);
                
        System.out.println("\n----------------------------------------------------");  
        
        
        
        
    }
    
}

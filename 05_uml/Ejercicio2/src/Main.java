public class Main {

    public static void main(String[] args) {
        
        //Creo un usuario y celular con los contructores
        Usuarios user1 = new Usuarios ("Juana", "20123425");
        Baterias batt1 = new Baterias ("modelo1", 100);
        Celulares cel1 = new Celulares ("(54)11-1234-1234","Iphone", "m13", batt1);
                
        //Asigno cel1 a user1
	asignarCel(cel1, user1);
        System.out.println("Imprimo info del Usuario 1:");
        System.out.println(user1);
        System.out.println("\n----------------------------------------------------");    
        
        //Creo un celular y usuario con metodos, que impiden crearlos con valores nulos.
        Celulares cel2 = validarDatosCel(null, null, null,null);     
        Usuarios user2 = validarDatosUser(null, null);
        System.out.println("-----------------------------------------------------");    
        
        //Creo una batt2 / le doy valores validos a user2 y cel 2, luego le asigno al cel2 el user2
        Baterias batt2 = new Baterias ("modelo2", 50);
        cel2 = validarDatosCel("(54)11-1111-2222", "Samsung", "xs15", batt2);
        user2 = validarDatosUser("Marcos Diaz", "31987654");
	asignarUser(cel2, user2);
        
        System.out.println("Imprimo info del Usuario 2:");
        System.out.println(user2);
        System.out.println("----------------------------------------------------");

        //Intento a asignarle al User1 el cel de User2
        asignarCel(cel2, user1);
        System.out.println("----------------------------------------------------");  
        
        //Imprimo a User1, para chequear que su cel no se modifico
        System.out.println(user1);
        System.out.println("----------------------------------------------------\n");
        
        
        
    }
    //METODOS ALTERNATIVOS  
    
    private static Celulares validarDatosCel(String imei, String marca, String modelo, Baterias bateria){
        if(imei!=null && marca!=null && modelo != null && bateria!= null){
            return new Celulares (imei, marca, modelo, bateria);
        } else {
            System.out.println("Error! Para generar un Celular debe ingresar datos validos.");
            return null;
        } 
    }
    
    private static Usuarios validarDatosUser(String nombre, String dni){
        if(nombre!=null && dni!=null){
            return new Usuarios (nombre, dni);
        } else {
            System.out.println("Error! Para generar un Usuario debe ingresar datos validos.");
            return null;
        }
    }
    
    private static void asignarUser(Celulares cel, Usuarios user){
       try {
            cel.setUsuario(user);
        } catch (IllegalStateException e) {
            System.out.println("Error! "+e.getMessage());
        } 
    }
    
    private static void asignarCel(Celulares cel, Usuarios user){
        try {
            user.setCelular(cel);
        } catch (IllegalStateException e) {
            System.out.println("Error! "+e.getMessage());
        } 
    }
    
    
}


public class Main3 {

    public static void main(String[] args) {
        //Creo autor1 y editorial con los contructores
        Autor autor1 = new Autor ("Julio Cortazar", "Argentino");
        Editorial editorial1 = new Editorial ("Atlantida", "Calle n°1");
        
        //Creo un libro y le asigno la editorial1
        Libro libro1 = new Libro ("La rayuela","123458", editorial1);
                
        //Asigno a Cortazar su libro
	libro1.setAutor(autor1);
        
        System.out.println("Imprimo info de " +autor1.getNombre());
        System.out.println(libro1);
        System.out.println("\n----------------------------------------------------");    
       
        //Creo autor2 y editorial2 con los contructores
        Autor autor2 = new Autor ("Michel Foucault", "Frances");
        Editorial editorial2 = new Editorial ("Siglo XXI Editores", "Calle n°30");
        
        //Creo un libro2 y le asigno la editorial2
        Libro libro2 = new Libro ("Vigilar y castigar","3323458", editorial2);
                
        //Intento asignarle a la Rayuela (libro1) el autor: Foucault (autor2) 
        libro1.setAutor(autor2);
        System.out.println("----------------------------------------------------"); 
        
        //Cheque no focault no tenga libro asignado
        System.out.println("Imprimo info de "+libro2.getTitulo());
        System.out.println(libro2);
        System.out.println("----------------------------------------------------");
        
        //Asigno a libro2 su autor2
        libro2.setAutor(autor2);
        System.out.println("Imprimo info de "+autor2.getNombre());
        System.out.println(libro2);
                
        System.out.println("\n----------------------------------------------------");  
        
        
    }
    
}

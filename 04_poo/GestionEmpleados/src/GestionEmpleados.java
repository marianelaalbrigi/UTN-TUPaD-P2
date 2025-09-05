
public class GestionEmpleados {

    public static void main(String[] args) {
        //Creo empleado 1 con un tipo de constructor
        System.out.println("*******EMPLEADO 1********");
        Empleados empleado1 = new Empleados("Martín González", "Auxiliar Administrativo", 412000.0);
        System.out.println(empleado1);
        System.out.println();
        
        //Creo empleado 2 con otro tipo de constructor
        System.out.println("*******EMPLEADO 2********");
        Empleados empleado2 = new Empleados("Julia Aranguren", "Administrativo Clase A");
        System.out.println(empleado2);
        System.out.println();
        
        //Creo empleado invalido sin nombre y sin sueldo
        System.out.println("*******EMPLEADO 3 - ID NO REGISTRADO********");
        Empleados empleado3 = new Empleados("", "Gerente Administración");
        System.out.println(empleado3); //No se genera ni se guarda la info
        System.out.println();
        
        //Creo empleado valido y constanto que el id 3 siga disponible despues del usuario invalido
         System.out.println("*******EMPLEADO 4 - ID 3********");
        Empleados empleado4 = new Empleados("Romina Diaz", "Gerente Administración");
        System.out.println(empleado4);
        //aumento sueldo con int
        empleado4.actualizarSalario(10000);
        System.out.println(empleado4);
        System.out.println();
        
        //Vuelvo a ingresar los datos de empleado invalido
         System.out.println("*******EMPLEADO 3 - ID REGISTRADO********");
        empleado3.setNombre("Ariel Ramirez");
        empleado3.setSalario(600000);
        empleado3.setPuesto("Auxialiar RRHH");
        System.out.println(empleado3);
        //aumento sueldo con %
        empleado3.actualizarSalario(15.3);
        System.out.println(empleado3);
        System.out.println();
        
        Empleados.mostrarTotalEmpleados();
        
    }
    
}

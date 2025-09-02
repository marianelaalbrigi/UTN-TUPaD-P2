public class Main {

    public static void main(String[] args) {
                
        //EJERCITACIÓN N°1: REGISTRO DE ESTUDIANTES
        /*
        Estudiante estudiante1 = new Estudiante();
        //le agrego valores a los atributos por primera vez
        estudiante1.setNombre("Ana");
        estudiante1.setApellido("García");
        estudiante1.setCurso("Programación II");
        
        //por defecto la calificacion es 0, le sumo 8 y le intento bajar 10 (un numero mayor a la calificacion que 8)
        estudiante1.subirCalificacion(8);
        estudiante1.bajarCalificacion(10);
        
        //imprimo el resultado desde el metodo get del atributo calificacion
        System.out.println(estudiante1.getCalificacion());
        
        // intento bajarle 2.5
        estudiante1.bajarCalificacion(2.5);
        
        //muestro toda la info del estudiante
        estudiante1.mostrarInfo();
        */
        
        /*
        //EJERCITACIÓN N°2: REGISTRO DE MASCOTAS
        Mascotas Mascota1 = new Mascotas();
        
        //Intento setear la edad antes que el nombre
        Mascota1.setEdadMascota(2);
               
        //Seteo nombre por primera vez 
        System.out.println("Intento ingresar null en nombre: ");
        Mascota1.setNameMascota("null");
        
        System.out.println("Intento ingresar un espacio vacio en nombre: ");
        Mascota1.setNameMascota("");
          System.out.println("Intento ingresar un numero en nombre: ");
        Mascota1.setNameMascota("1fito");

        Mascota1.setNameMascota("Coco");
        System.out.println("El nombre de la mascota es: "+Mascota1.getNameMascota()); 
                    
        //Intento modificar el nombre
        Mascota1.setNameMascota("roman");
        
        //Intento agregar un valor invalido en edad
        Mascota1.setEdadMascota(-2);
        
        //Ingreso una edad valida 
        Mascota1.setEdadMascota(2); 
        
        //Seteo especie por primera vez
        Mascota1.setEspecie("Golden Retriever");
        
        System.out.println("\n");
        
        //Imprimo info completa
        Mascota1.mostrarInfo();
       */
        
        
        //EJERCITACIÓN N°3: REGISTRO DE MASCOTAS
        /*
        Libro libro1 = new Libro();
        
        //Si intento registrar el año antes que el titulo, sale error.
        libro1.setAnioPublicacion(0);
        
        //Registro el nombre del titulo
        libro1.setTitulo("Las mil y una noches");
        
        //Registro el autor como desconocido
        libro1.setAutor("Desconocido");
        
        //Si registro el año con cero, se guarda como desconocido.
         libro1.setAnioPublicacion(0);
        
        libro1.mostrarInfo();
        */           
        
        //EJERCITACIÓN N°4: GESTIÓN DE GALLINAS
        /*
        
        Gallinas gallina1 = new Gallinas(3, 2);     // Creo la primer gallina con tres años de edad y ya con dos huevos puestos en esos tres años. Su ID se genera automaticamente
        
        gallina1.mostrarEstado();                   // Primera visualizacion del estado
        
        gallina1.ponerHuevos();                     // Intenta poner huevos (puede poner 0 a 1 huevo) 
        gallina1.mostrarEstado();                   // Hago segunda visualizacion del estado
        
        gallina1.envejecer();                       // La hago envejecer un dia
        
        gallina1.ponerHuevos();                     // Intenta poner huevos (puede poner 0 a 1 huevo)
        
        gallina1.mostrarEstado();                   //Tercera visualizacion del estado
        
        
        Gallinas gallina2 = new Gallinas();         // Creo una segunda gallina //Su ID se genera automaticamente 
        gallina2.setEdad(0);                        // Registro su edad
        
        gallina2.mostrarEstado();                   // Primera visualizacion del estado
        
        gallina2.envejecer();                       // La hago envejecer un dia 
        gallina2.ponerHuevos();                     // Intenta poner huevos (puede poner 0 a 1 huevo)
        
        gallina2.mostrarEstado();                   // Segunda visualizacion del estado
        */
        
        
       
        //EJERCITACIÓN N°5: NAVE ESPACIAL
        NaveEspacial nave1 = new NaveEspacial();
        NaveEspacial nave2 = new NaveEspacial();
        
        System.out.println("************************************************************************");
        System.out.println("PRUEBAS CON NAVE 1");
        System.out.println("************************************************************************");
        
        nave1.setNombre("PHONIX II");        // Registro el nombre de la nave 1
        nave1.recargarCombustible(600);      // Intento hacer una carga que supera el maximo permitido.
        nave1.recargarCombustible(400);      // Hago una carga valida.
        nave1.despegar();                    // Despegue de nave 1
        nave1.mostrarEstado();               // Primera visualizacion de la nave 1
        
        System.out.println("************************************************************************");
        System.out.println("PRUEBAS CON NAVE 2");
        System.out.println("************************************************************************");
        nave2.recargarCombustible(100);     // Intento hacer una carga a la nave 2 antes de registrar el nombre.
        nave2.setNombre("ATLAS");           // Registro el nombre de la nave 2
        nave2.recargarCombustible(400);     // Carga valida de combustible
        nave2.mostrarEstado();              // Primera visualizacion de la nave 2
        nave2.despegar();                   // Despegue de nave 2
        nave2.avanzar(180000);              // Intento inválido de avanzar. Imprime aviso de falta de combustible
        nave2.recargarCombustible(200);     // Carga valida de combustible
        nave2.avanzar(180000);              // Avance de Nave 2
        nave2.mostrarEstado();              // Segunda visualizacion de la nave 2
        
    }
    
}

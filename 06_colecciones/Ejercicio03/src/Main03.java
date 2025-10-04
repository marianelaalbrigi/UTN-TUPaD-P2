
public class Main03 {
    
    public static void main(String[] args) {
        
        Universidad uba = new Universidad("Universidad de Buenos Aires");
        
        //PUNTO 1: Crear al menos 3 profesores y 5 cursos.
        Profesor profe1 = new Profesor("01", "Victoria Paz", "Pediatria");
        Profesor profe2 = new Profesor("02", "Guillermo Gimenez", "Biologia");
        Profesor profe3 = new Profesor("03", "Francisco Picaro", "Radiología");
        
        Curso curso1 = new Curso("S1-1","Anatomia");
        Curso curso2 = new Curso("S2-2","Fisiologia");
        Curso curso3 = new Curso("S3-1","Patologia");
        Curso curso4 = new Curso("S1-2","Salud Mental");
        Curso curso5 = new Curso("S2-1","Microbiologia");
        
        //PUNTO 2: Agregar profesores y cursos a la universidad.
        uba.agregarProfesor(profe1);
        uba.agregarProfesor(profe2);
        uba.agregarProfesor(profe3);
                
        uba.agregarCurso(curso1);
        uba.agregarCurso(curso2);
        uba.agregarCurso(curso3);
        uba.agregarCurso(curso4);
        uba.agregarCurso(curso5);
        
        //PUNTO 3: Asignar profesores a cursos usando asignarProfesorACurso(...).
        uba.asignarProfesorACurso(curso1.getCodigo(), profe3.getId());
        uba.asignarProfesorACurso(curso2.getCodigo(), profe3.getId());
        uba.asignarProfesorACurso(curso3.getCodigo(), profe1.getId());
        uba.asignarProfesorACurso(curso4.getCodigo(), profe1.getId());
        uba.asignarProfesorACurso(curso5.getCodigo(), profe2.getId());
        
        //PUNTO 4: Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n---------------------- EJERCICIO 4 ----------------------");
        //El curso 3(patologia) esta dado por profe1 (Victoria)
        //El curso 1(Anatomia) esta dado por profe3 (Fracisco)
        //Hago un enroque entre ellos.
        System.out.println("-------------------------ANTES-----------------------------");
        profe3.listarCursos();
        System.out.println("------------------------------------");
        profe1.listarCursos();
        
        System.out.println("------------------------DESPUES-----------------------------");
        curso3.setProfesor(profe3);
        curso1.setProfesor(profe1);
        
        profe3.listarCursos();
        System.out.println("------------------------------------");
        profe1.listarCursos();
        
        System.out.println("----------------INFO ACTUALIZADA DEL CURSO-----------------");
        curso3.mostrarInfo();
               
        //PUNTO 5: Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n---------------------- EJERCICIO 5 ----------------------");
        //Elimino del profe3, la materia Anatomia. Imprimo estado inicial sin eliminacion
        profe3.listarCursos();
        System.out.println("------------------------------------------------------------");
        uba.eliminarCurso(curso1.getCodigo());
        profe3.listarCursos();
        
        //PUNTO 6: Remover un profesor y dejar profesor = null,
        System.out.println("\n---------------------- EJERCICIO 6 ----------------------");
        System.out.println("--------------- LISTADO PREVIA ELIMINACION ----------------");
        uba.listarProfesores();
        
        uba.eliminarProfesor(profe3.getId());
        
        System.out.println("-------------- LISTADO POSTERIOR ELIMINACION ---------------");
        uba.listarProfesores();
        
        System.out.println("-------------- CURSO SIN EL PROFESOR ELIMINADO ---------------");
        curso3.mostrarInfo();
        
        //PUNTO 7: Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n---------------------- EJERCICIO 7 ----------------------");
        for(Profesor elemento: uba.getProfesores()){
            elemento.mostrarInfo();
            System.out.println("------------------------------------");
        }
    }
}

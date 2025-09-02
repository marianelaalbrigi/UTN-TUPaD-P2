import java.util.Random;

public class Gallinas {
    private Random random = new Random();
    
    private int edadActual=0;
    private int huevosPuestos=0;
    private static int idGallina=0;
    private int dia=1;
    
    public Gallinas(int edad, int huevosPuestos) {
        this.idGallina += 1;
        this.edadActual = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public Gallinas() {
        this.idGallina += 1;
    }
   
    public int getIdGallina() {
        return idGallina;
    }

    /**
     * Valida y establece la edad de la gallina. 
     * No permite valores negativos.
     *
     * @param edad la edad a validar y asignar.
     * @throws IllegalArgumentException si la edad es negativa.
     */  
    public void setEdad(int edad) {   
        try {
            if (edad < 0){
                throw new IllegalArgumentException("Error! Edad no permite valores negativos.");
            }  
            this.edadActual = edad;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }  
    }
   

    /**
    * Simula el paso del tiempo en días. 
    * Cada vez que se cumplen 365 días, se incrementa en 1 la edad de la gallina 
    * y el contador de días se reinicia.
    *
    * @return la edad actual de la gallina.
    */
    public int envejecer() {
        dia++;
        if (dia >= 365) {
        edadActual++;
        dia = 0;
        }
        return edadActual;
    }

    /**
    * Simula que la gallina pone huevos.
    * Cada vez que se llama, se suma un número aleatorio de huevos (0 o 1) al total.
    *
    * @return el total de huevos puestos por la gallina hasta el momento.
    */
    public int ponerHuevos(){
        huevosPuestos+= random.nextInt(2);
        return huevosPuestos;
    }
    
    
    /**
    * Muestra en consola la información de la gallina:
    * ID, edad (en años y días) y total de huevos puestos.
    */
    public void mostrarEstado(){
        System.out.println("**** INFORMACIÓN DE LA GALLINA ****"+
                "\n ID: "+ idGallina +
                "\n Total de Huevos puestos: "+ huevosPuestos +
                "\n Edad: " + edadActual + " anios y "+ dia + " dias"+
                "\n");
    }    
  
}

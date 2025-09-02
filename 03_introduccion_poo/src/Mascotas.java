public class Mascotas {
    private String nameMascota;
    private String especie;
    private int edadMascota = -1;
    private boolean nameRegistrado = false;
    
    //Constructor
    public Mascotas(String nameMascota, String especie, int edadMascota) {
        this.nameMascota = nameMascota;
        this.especie = especie;
        this.edadMascota = edadMascota;
    }
    
    
    //Constructor vacío
    public Mascotas() {
    }

    //Get and set Nombre de Mascota    
    public String getNameMascota() {
        return nameMascota;
    } 
    
    /**
    * Asigna el nombre de la mascota.
    * <p>No se permite modificar el nombre una vez establecido.
    * El nombre no puede ser nulo, vacío ni contener números.</p>
    *
    * @param nameMascota el nombre a asignar a la mascota.
    * @throws IllegalStateException si el nombre ya fue registrado previamente.
    * @throws IllegalArgumentException si el nombre es nulo, vacío o contiene números.
    */
    public void setNameMascota(String nameMascota) {   
        try {
            if(nameRegistrado){
                throw new IllegalStateException("Error! Ya se ha ingresado un nombre a la mascota.");
            }
            if (nameMascota == null || nameMascota.trim().equals("")){
                    throw new IllegalArgumentException ("Error! No ha ingresado un nombre.");
            }   
            for (int i = 0; i < nameMascota.length(); i++) {
                if (Character.isDigit(nameMascota.charAt(i))) {
                    throw new IllegalArgumentException("Error! El nombre no puede contener números.");
                }
            } 
                   
            this.nameMascota = nameMascota;
            nameRegistrado = true;    
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } 
    }
        
    //Get and set especie
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
         if(especie != null){
            this.especie = especie;
        }      
    }

    //Get and set edad Mascota
    public int getEdadMascota() {
        return edadMascota;
    }
    
    /**
     * Asigna la edad de la mascota.
     * Verifica que primero se haya registrado un nombre
     * y que la edad no sea negativa.
     *
     * @param edadMascota la edad a validar y asignar.
     * @throws IllegalStateException si el nombre de la mascota no fue registrado.
     * @throws IllegalArgumentException si la edad es negativa.
     */
    public void setEdadMascota(int edadMascota) {           
        try{
            if (!nameRegistrado) {
                throw new IllegalStateException("Error! Primero debe registrar un nombre a la mascota.");
            } else {
                if (edadMascota < 0) {
                    throw new IllegalArgumentException("Error! Edad no permite valores negativos.");
                }
            }    
            this.edadMascota = edadMascota;     
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }  
    }
    
   
    /**
    * Incrementa en 1 la edad de la mascota,
    * simulando que cumple un año más.
    *
    * @return la nueva edad de la mascota.
    */
    public int cumplirAnios() {
        edadMascota++;
        return edadMascota;
    }

    
    /**
    * Muestra en consola la información de la mascota:
    * Nombre, edad y especie.
    */
    public void mostrarInfo (){
        System.out.println("**** INFORMACIÓN DE LA MASCOTA ****"+
                "\n Nombre: "+ nameMascota +
                "\n Especie: "+ especie +
                "\n Edad: " + edadMascota);
    }    
}


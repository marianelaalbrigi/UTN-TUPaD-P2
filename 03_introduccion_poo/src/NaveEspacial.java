public class NaveEspacial {
    private String nombre, estado, despegue;
    private double combustibleRequerido=0;
    private double combustible =0;

    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public NaveEspacial() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public double getCombustible() {
        return combustible;
    }
    
    
    /**
     * Intenta realizar el despegue de la nave.
     * Requiere un mínimo de 340 toneladas de combustible.
     * Si no alcanza, el despegue se marca como "Fallido." y se informa cuánta cantidad falta.
     * Si alcanza, el despegue se marca como "Exitoso." y se descuentan 340 toneladas por el despegue.
     *
     * Efectos secundarios:
     * - Modifica los campos 'despegue' y 'combustible'.
     * - Muestra mensajes en consola (cuenta regresiva o aviso de falta de combustible).
     */
    public void despegar(){
        if (combustible < 340){
            System.out.println("Para realizar el despegue debe cargar " + (340-combustible) +"toneladas de combustible.\n");
            despegue = "Fallido.";
        } else         
            System.out.println("La nave "+nombre+" despegara en:"
                + "\n 3"
                + "\n 2" 
                + "\n 1" 
                + "\n despegando...\n"); 
            despegue = "Exitoso.";
            combustible -= 340;
    }
    
    
    /**
     * Intenta avanzar la distancia indicada.
     * El combustible requerido se calcula con la fórmula:
     * combustibleRequerido = (distancia * 100) / 128000.
     * Si el combustible disponible alcanza, se descuenta y el estado pasa a "Avanzando.".
     * Si no alcanza, no se descuenta y el estado pasa a "Detenido.", informando lo requerido.
     *
     * @param distancia distancia a recorrer, en kilómetros.
     *
     * Efectos secundarios:
     * - Puede modificar los campos 'combustible', 'estado' y 'combustibleRequerido'.
     * - Muestra mensajes en consola.
     */
    public void avanzar(double distancia){
        combustibleRequerido = (distancia *100)/128000;
        
        if (combustible >= combustibleRequerido) {
            System.out.println("Avanzando...\n");
            estado="Avanzando.";
            combustible -= combustibleRequerido; 
        } else {
            System.out.println("No hay suficiente combustible para avanzar."+
                               "\nEl combustible requerido para ese viaje es de: "+ combustibleRequerido+" toneladas.\n");
            estado="Detenido.";
        } 
    }
    
    
    /**
     * Intenta recargar combustible sin superar la capacidad máxima del tanque (500 toneladas).
     * Requiere que el nombre de la nave esté registrado previamente.
     * Si la recarga propuesta supera el límite, no se realiza y se informa cuánto se puede cargar.
     * Si la recarga es válida, se suma al combustible actual y se informa el nivel resultante.
     *
     * @param cantidad de combustible a cargar en toneladas. Debe ser positiva.
     * @throws IllegalStateException si el nombre de la nave no está registrado (nombre == null).
     *
     * Efectos secundarios:
     * - Puede modificar el campo 'combustible'.
     * - Muestra mensajes en consola.
     */
    public void recargarCombustible(double cantidad){
        try {
            if (nombre == null) {
                throw new IllegalStateException ("Error! Para cargar combustible primero registre el nombre de la Nave.\n");
            } 
            else {
                if ((combustible+cantidad) > 500){
                    System.out.println("La cantidad que intenta cargar supera el limite de carga."
                            +"\nIntente cargar: "+ (500-combustible)+ " toneladas.\n");                 
                }   
                else {
                    combustible+=cantidad;
                    System.out.println("Combustible disponible: "+ combustible+" toneladas.\n"); 
                }
            }    
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());  
        }
    }
    
    
    /**
     * Muestra en consola el estado actual de la nave.
     * La salida incluye: nombre de la nave, combustible disponible,
     * resultado del último despegue y estado actual de operación.
     *
     * Efectos secundarios:
     * - No modifica atributos; solo imprime información.
     */
    public void mostrarEstado(){
        System.out.println("**** INFORMACION DE LA NAVE "+nombre +" ****"+
                "\n Nombre de la Nave: "+ nombre +
                "\n Total de combustible: "+ combustible +
                "\n Despegue: "+ despegue +
                "\n Estado: " + estado+
                "\n");
    }
    
}

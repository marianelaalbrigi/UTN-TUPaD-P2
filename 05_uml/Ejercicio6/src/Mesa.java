public class Mesa {
    private int numero;
    private int cantidad;

    public Mesa(int numero, int cantidad) {
        if(!validarMesa(numero, cantidad)){
            System.out.println("Ingrese valores válidos para la Mesa.");
            return;
        }
        else {
            this.numero = numero;
            this.cantidad= cantidad;
        }
    }
    
    private boolean validarMesa(int numero, int capacidad){
        if (numero <=0 || capacidad <= 0){
            return false;
        } else
            return true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Mesa{" + "numero de mesa= " + numero + ", cantidad de Personas= " + cantidad + '}';
    }
  
}


public class Calculadora {

    public Calculadora() {
    }
    
    public void calcular(Impuesto impuesto){
        System.out.println("*********** Info del contribuyente ***********"
                +"\nNombre: "+impuesto.getContribuyente().getNombre()
                +"\nCuil: "+impuesto.getContribuyente().getCuil()
                +"\nMonto a abonar: $"+impuesto.getMonto());
    }
    
}
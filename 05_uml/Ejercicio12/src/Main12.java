
public class Main12 {

    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();
        Contribuyente persona1 = new Contribuyente("Mercedes Morán", "2712312311");
        Impuesto impuesto1 = new Impuesto(15000);
        impuesto1.setContribuyente(persona1);
        
        calc1.calcular(impuesto1);
    }
    
}

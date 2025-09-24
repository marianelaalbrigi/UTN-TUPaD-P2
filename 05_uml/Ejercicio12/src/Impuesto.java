
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        if(monto==0){
            System.out.println("Error. Debe ingresar un monto.");
            return;
        }else {
            this.monto = monto;
        }
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto {" + "monto= " + monto + "}\n" + contribuyente;
    }
    
    
    
}

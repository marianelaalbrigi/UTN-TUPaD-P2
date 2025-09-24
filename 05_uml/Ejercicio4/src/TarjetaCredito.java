public class TarjetaCredito {
    private String numTarjeta;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaCredito(String numTarjeta, String fechaVencimiento, Banco banco) {
        if (numTarjeta!= null && fechaVencimiento!=null && banco!=null){
            this.numTarjeta = numTarjeta;
            this.fechaVencimiento = fechaVencimiento;
            this.banco = banco;
        }
    }
    
    public void setCliente(Cliente cliente){
        if(cliente!=null && cliente.getTarjeta()!=null && cliente.getTarjeta()!= this){
            System.out.println("Este cliente ya tiene una tarjeta asignada.");
            return;  
        }
        if(cliente!=null && this.cliente!=null && this.cliente!=cliente){
            System.out.println("Esta tarjeta ya fue asignada a un cliente.");
            return;  
        }
        this.cliente=cliente;
        if (cliente!=null && cliente.getTarjeta()==null) {
            cliente.setTarjeta(this);
        } 
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public String getNumTarjeta() {
        return numTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }
    
    @Override
    public String toString() {
        return "TarjetaCredito {" + "numTarjeta= " + numTarjeta + ", fechaVencimiento= " + fechaVencimiento + "}\n";
    }
}

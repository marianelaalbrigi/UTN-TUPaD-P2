
import java.util.Random;

public class CuentaBancaria {
    Random rand = new Random();
    private String cbu="";
    private double saldo;
    private Titular titular;
    private ClaveSeguridad clave;

    public CuentaBancaria(double saldo, String codigo) {
        if(codigo == null){
            System.out.println("Error. Debe ingresar un codigo de Seguridad.");
            return;
        } else {
            this.cbu = generarCbu();
            this.saldo = saldo;
            this.clave = new ClaveSeguridad(codigo);
        }
    }
          
    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        if(titular!=null && titular.getCuenta()!=null && titular.getCuenta()!=this){
            System.out.println("Error!"+titular.getNombre()+"ya tiene asignada una cuenta bancaria.");
            return;
        }
        
        if(titular!=null && this.getTitular()!=null && this.getTitular()!=titular){
            System.out.println("La cuenta está asignada a otro titular (" + this.getTitular().getNombre()+").");
            return;
        }
        
        this.titular = titular; 
        if(titular!=null && titular.getCuenta()==null){
           titular.setCuenta(this);
        }
        
        this.titular = titular;
    }
    
    private String generarCbu(){
               
        for (int i = 0; i < 22; i++) {
            int digito = rand.nextInt(10); // genera un número del 0 al 9
            cbu += digito;                // lo agrega a la cadena
        }
        
        return cbu;
    }
    

    @Override
    public String toString() {
        return "CuentaBancaria {" + "cbu= " + cbu + ", saldo= " + saldo + "}\n" + clave;
    }
    
}

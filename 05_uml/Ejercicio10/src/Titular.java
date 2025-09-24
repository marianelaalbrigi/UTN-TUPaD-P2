
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
         if(nombre == null || dni == null){
            System.out.println("Error! Debe completar nombre y dni.");
            return;
        } else {
            this.nombre = nombre;
            this.dni = dni;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        if(cuenta!=null && cuenta.getTitular()!=null && cuenta.getTitular()!=this){
            System.out.println("Error.Esta cuenta pertenece a otro titular ("+ cuenta.getTitular().getNombre()+")");
            return;
        }
        
        if(cuenta!=null && this.getCuenta()!=null && this.getCuenta()!= cuenta){
            System.out.println("El titular ("+this.getNombre()+") ya tiene una cuenta bancaria asignada ("+this.getCuenta().getCbu() +").");
            return;
        }
        
        this.cuenta = cuenta; 
        if(cuenta!=null && cuenta.getTitular()==null){
           cuenta.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular {" + "nombre= " + nombre + ", dni=" + dni + "}\n" + cuenta;
    }
    
    
    
}

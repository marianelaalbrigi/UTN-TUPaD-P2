
import java.util.Objects;

public class Empleados {
    private int id;
    private String nombre;
    private boolean nombreValidado = false;
    private String puesto;
    private double salario;
    private double sueldoMinimo = 350000;
    private static int totalEmpleados;
    
  
    //CONSTRUCTORES
    //Constructor que llama al segundo contructor
    public Empleados(String nombre, String puesto) {
        this(nombre, puesto, 600000.0);        
    }
    
    //Constructor que llama a los setters con validaciones
    public Empleados(String nombre, String puesto, double salario) {
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario); 
    }
    
    //Constructor vacio
    public Empleados() {
       
    }
    
    public int getId() {
        return id;
    }
    
    //Si en setNombre se valida el nombre, se llama a este metodo.
    public void setId() {
        this.id = ++totalEmpleados;   
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    //Si se valida el nombre, se asigna un ID
    public void setNombre(String nombre) {
        try {
            if (nombre == null || nombre.trim().equals("")){
                throw new IllegalArgumentException ("Error! Ingrese un nombre válido.");  
            }
            this.nombre = nombre;
            nombreValidado=true;
            setId();
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }    
    }

    public String getPuesto() {
        return puesto;
    }

    //Si el nombre es valido, se acepta registrar el puesto. No puede haber un puesto sin persona.
    public void setPuesto(String puesto) {
        if (nombreValidado) {
            try {
                if (puesto == null || puesto.trim().equals("")) {
                    throw new IllegalArgumentException("Error. No ha ingresado el nombre del puesto.");           
                }
                this.puesto = puesto;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }  
        }       
    }

    public double getSalario() {
        return salario;
    }
    
    //Se valida que el sueldo sea mayor al minimo.
    public void setSalario(double salario) {
        try {
            if (salario < sueldoMinimo){         
                throw new IllegalArgumentException("El monto ingresado debe ser mayor al sueldo mínimo.");
            }
            this.salario = salario;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

          
    // METODOS
    public double actualizarSalario(double porcentaje){
        this.salario += (porcentaje/100) * this.salario;
        return this.salario;
    }
    
    public double actualizarSalario (int aumento){
        return this.salario += aumento;
    }
    
    public static void mostrarTotalEmpleados(){
        System.out.println("La cantidad total de empleados es: "+totalEmpleados);
    }

     @Override
    public String toString() {
        return "Empleado: Id: "+ id + " / Nombre = " + nombre + " / Puesto = " + puesto + " / Salario = " + salario;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.puesto);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.sueldoMinimo) ^ (Double.doubleToLongBits(this.sueldoMinimo) >>> 32));
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleados other = (Empleados) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sueldoMinimo) != Double.doubleToLongBits(other.sueldoMinimo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.puesto, other.puesto);
    }
    
    
    
    
}

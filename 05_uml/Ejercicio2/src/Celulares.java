
public class Celulares {
    private String imei;
    private String marca;
    private String modelo;
    private Usuarios user;
    private Baterias bateria;

    public Celulares(String imei, String marca, String modelo, Baterias bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
  
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        if(imei != null){
            this.imei = imei;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(imei != null){
            this.marca = marca;  
        }   
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){ 
        if(modelo != null){
            this.modelo = modelo;
        } 
    }
            
    public void setUsuario (Usuarios user){
        //Verifica si el celular ya tiene asignado titular.
        if(user != null && this.getUsuario()!=null && this.getUsuario()!=user){
             throw new IllegalStateException("Este celular ya tiene un titular asignado: " + this.getUsuario());           
        }
        //Verifica si el usuario ya tiene asignado un celular. Relacion 1:1
        if (user!= null && user.getCelular()!=null && user.getCelular() != this){
           throw new IllegalStateException("El usuario " + user.getNombre() + " ya tiene un celular asignado.");
        }   
        this.user = user;
        if (user != null && user.getCelular() != this) {
            user.setCelular(this);
        }
    }   
    
    public Usuarios getUsuario(){
        return user;
    }
    
    @Override
    public String toString() {
        return "Celular {" + "imei= " + imei + ", marca= " + marca + ", modelo= " + modelo + "}\n" + bateria;
    }

    
    
}

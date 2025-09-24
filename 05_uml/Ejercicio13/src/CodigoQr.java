
public class CodigoQr {
    private String valor;
    private Usuario user;

    public CodigoQr(String valor) {
        if(valor==null){
            System.out.println("Error. Debe ingresar un valor.");
            return;
        }else {
            this.valor = valor;
        }
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    
    
    
}

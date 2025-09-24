
public class GeneradorQr {
    public void generar(){
    }
    
    public GeneradorQr(String valor, Usuario user) {
        CodigoQr codigo = new CodigoQr(valor);
        codigo.setUser(user);
        System.out.println("CodigoQR generado: \n"+
                            "Valor: "+ codigo.getValor()+ 
                            "\n"+ codigo.getUser());
    }
}

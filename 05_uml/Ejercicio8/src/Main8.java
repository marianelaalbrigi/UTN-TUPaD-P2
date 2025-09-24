
public class Main8 {

    public static void main(String[] args) {
        //Creo usuario y documento
        Usuario user1 = new Usuario("Ana", "ana@gmail.com");
        Documento doc1 = new Documento("Facturación", "FacturaA", user1); //la firma se genera automaticamente junto con la fecha al momento de crear el documento
        
        //Imprimo info del doc
        System.out.println(doc1);
    }
    
}

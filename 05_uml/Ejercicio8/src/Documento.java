
public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    
    public Documento(String titulo, String contenido, Usuario user) {  
        if(titulo==null || contenido==null || user==null){
            System.out.println("Error! Debe completar todos los valores.");
                return;
        }else {                    
            this.titulo = titulo;
            this.contenido = contenido;
            firma =  new FirmaDigital(user);
        }               
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }
    

    @Override
    public String toString() {
        return "Documento{ " + "titulo= " + titulo + ", contenido= " + contenido + "}\n" + firma;
    }

    
    
    
}

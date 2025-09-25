
public class EditorVideo {

    public EditorVideo() {
    }
    
    public void exportar(String formato, Proyecto proyecto){
        Render render= new Render(formato);
        proyecto.setRender(render);
        String salida =proyecto.getNombre()+proyecto.getRender().getFormato();
                
        System.out.println("Renderizando y exportando video...\n"
                +"Archivo: "+ proyecto.getNombre()
                +"\nDuración: "+proyecto.getDuracionMin()
                +"\nFormato elegido: "+proyecto.getRender().getFormato()
                +"\nSalida: "+salida);
    }
}

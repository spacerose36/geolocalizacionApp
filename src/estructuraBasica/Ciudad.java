package estructuraBasica;

public class Ciudad extends Nodo {

    private String estadoEspecifico;
    @Override
    public String funcInfoGeo() {
        return "Ciudad";
    }

    public String getEstadoEspecifico() {
        return estadoEspecifico;
    }

    public void setEstadoEspecifico(String estadoEspecifico) {
        this.estadoEspecifico = estadoEspecifico;
    }
}

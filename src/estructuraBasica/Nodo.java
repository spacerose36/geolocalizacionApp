package estructuraBasica;

import java.util.ArrayList;
import java.util.List;

public abstract class Nodo {

    private String estadoComun;

    private List<Enlace> enlaces;

    public Nodo(String estadoComun) {
        this.estadoComun = estadoComun;
        this.enlaces = new ArrayList<>();
    }

    public Nodo(){
        this.enlaces = new ArrayList<>();
    }

    public abstract String funcInfoGeo();

    public String getEstadoComun() {
        return estadoComun;
    }

    public void setEstadoComun(String estadoComun) {
        this.estadoComun = estadoComun;
    }

    public List<Enlace> getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(List<Enlace> enlaces) {
        this.enlaces = enlaces;
    }
}

package visualizador;

import estructuraBasica.Grafo;

import java.io.IOException;

public abstract class VisualizadorAbstracto {
    private final Grafo grafo;

    public VisualizadorAbstracto(Grafo grafo) {
        this.grafo = grafo;
    }

    public abstract String visualizar();

    public abstract void exportar() throws IOException;

    public Grafo getGrafo() {
        return grafo;
    }
}

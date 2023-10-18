package visualizador;

import estructuraBasica.Grafo;

import java.io.IOException;

public abstract class VisualizadorAbstracto {
    private final Grafo grafo;

    public VisualizadorAbstracto(Grafo grafo) {
        this.grafo = grafo;
    }

    public final void visualizarYExportar() throws IOException {
        exportar(visualizar());
    }
    public abstract String visualizar();

    public abstract void exportar(String grafo) throws IOException;

    public Grafo getGrafo() {
        return grafo;
    }
}

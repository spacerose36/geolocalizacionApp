package estructuraBasica;

public class Enlace {
    private Nodo puntoPartida;

    private Nodo puntoLlegada;

    public Enlace(Nodo puntoPartida, Nodo puntoLlegada) {
        this.puntoPartida = puntoPartida;
        this.puntoLlegada = puntoLlegada;
        this.puntoLlegada.getEnlaces().add(this);
        this.puntoPartida.getEnlaces().add(this);
    }

    public Nodo getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(Nodo puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public Nodo getPuntoLlegada() {
        return puntoLlegada;
    }

    public void setPuntoLlegada(Nodo puntoLlegada) {
        this.puntoLlegada = puntoLlegada;
    }
}

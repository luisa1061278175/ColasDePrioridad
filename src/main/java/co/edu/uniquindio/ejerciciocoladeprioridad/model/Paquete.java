package co.edu.uniquindio.ejerciciocoladeprioridad.model;

public class Paquete implements Comparable<Paquete> {
    private String destino;
    private int prioridad;

    public Paquete(String destino, int prioridad) {
        this.destino = destino;
        this.prioridad = prioridad;
    }

    public String getDestino() {
        return destino;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paquete otroPaquete) {
        return Integer.compare(this.prioridad, otroPaquete.prioridad);
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "destino='" + destino + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}

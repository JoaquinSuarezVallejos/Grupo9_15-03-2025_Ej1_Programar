package Vuelo;

public class SistemaDeControlDeVuelo {

    private String fabricante;
    private int numModos;
    private String tipoSistema; // "manual" o "pilotoAutomatico"
    private int modoActual;

    public SistemaDeControlDeVuelo(String fabricante, int numModos, String tipoSistema) {
        this.fabricante = fabricante;
        this.numModos = numModos;
        this.tipoSistema = tipoSistema;
        this.modoActual = 0; // Modo inicial
    }

    @Override
    public String toString() {
        return "SistemaDeControlDeVuelo{" +
                "fabricante='" + fabricante + '\'' +
                ", numModos=" + numModos +
                ", tipoSistema='" + tipoSistema + '\'' +
                ", modoActual=" + modoActual +
                '}';
    }

    public void cambiarModo() {
        modoActual = (modoActual + 1) % numModos;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getModoActual() {
        return modoActual;
    }
}

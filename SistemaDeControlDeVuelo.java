package Avion;

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
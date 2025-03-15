package Partes;
public class Ala {
   private double envergadura;
   private String color;
   private String tipoMaterial;
   private int flap = 0;

    public Ala(double envergadura, String color, String tipoMaterial) {
        this.envergadura = envergadura;
        this.color = color;
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return "Ala{" +
                "envergadura=" + envergadura +
                ", color='" + color + '\'' +
                ", tipoMaterial='" + tipoMaterial + '\'' +
                ", flap=" + flap +
                '}';
    }

    public int cambiarFlap (boolean subir){
        if (subir){
            this.flap = this.flap + 1;
        }else{
            this.flap = this.flap - 1;
        }
        return this.flap;
    }

    public int getFlap() {
        return flap;
    }


    public double getEnvergadura() {
        return envergadura;
    }
    public String getColor() {
        return color;
    }
    public String getTipoMaterial() {
        return tipoMaterial;
    }
}

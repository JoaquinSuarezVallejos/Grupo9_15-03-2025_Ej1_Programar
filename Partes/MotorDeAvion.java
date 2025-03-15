package Partes;
public class MotorDeAvion {
    private String marca;
    private int hp;
    private double empuje;
    private boolean encender;

    //constructor
    public MotorDeAvion(String marca, int hp, double empuje) {
        this.marca = marca;
        this.hp = hp;
        this.empuje = empuje;
    }

    public boolean isEncendido(boolean encender){
        this.encender = encender;

        return  this.encender;
    }

    //getters
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "MotorDeAvion{" +
                "marca='" + marca + '\'' +
                ", hp=" + hp +
                ", empuje=" + empuje +
                ", encender=" + encender +
                '}';
    }

    public int getHp() {
        return hp;
    }

    public double getEmpuje() {
        return empuje;
    }

}

import Avion.Avion;
import Partes.Ala;
import Partes.MotorDeAvion;
import Vuelo.SistemaDeControlDeVuelo;

public class Main {
    public static void main(String[] args) {
        // ALAS DEL AVION
        // Crear las instancias de las alas
        Ala alaIzquierda = new Ala(10, "Blanco", "Metal");
        Ala alaDerecha = new Ala(10, "Blanco", "Metal");

        // Crear una lista de alas
        Ala[] listAla = { alaIzquierda, alaDerecha };

        // MOTOR DEL AVION
        MotorDeAvion motor = new MotorDeAvion("Boeing", 1000, 2500);

        // SISTEMA DE CONTROL DE VUELO DEL AVION
        SistemaDeControlDeVuelo sisVuelo = new SistemaDeControlDeVuelo("Boeing", 1010, "Manual");

        // ARMADO DEL PRIMER AVION
        Avion primerAvion = new Avion("Boeing", "747", motor, sisVuelo, listAla, 300, true);

        System.out.print(primerAvion.toString());
    }
}
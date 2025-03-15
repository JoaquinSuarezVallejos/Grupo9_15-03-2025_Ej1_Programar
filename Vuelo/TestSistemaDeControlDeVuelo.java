package Avion;
public class TestSistemaDeControlDeVuelo {
public static void main(String[] args) {
// Construcción de dos sistemas de control de vuelo
SistemaDeControlDeVuelo sistema1 = new SistemaDeControlDeVuelo("Boeing", 3, "manual");
SistemaDeControlDeVuelo sistema2 = new SistemaDeControlDeVuelo("Airbus", 4, "pilotoAutomatico");
// Cambiar modos y mostrar datos
        System.out.println("Sistema 1:");
        System.out.println(sistema1.toString());
        sistema1.cambiarModo();
        System.out.println(sistema1.getModoActual());
// Cambiar modos y mostrar datos
        System.out.println("Sistema 2:");
        System.out.println(sistema2.toString());
        sistema2.cambiarModo();
        System.out.println(sistema2.getModoActual());

    }
}
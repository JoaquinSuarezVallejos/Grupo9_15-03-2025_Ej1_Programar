/* Datos del Grupo: 
    N°: 9
    
    Fecha: 15/03/2025

    TP: Ej1_Programar

    Alumnos:
    • Giovanni Carrá
    • Mariano Dambolena
    • Joaquín Suárez Vallejos
    • Lucas López de Calle
    • Federico Petta
    • Carlos Stoffel
    • Tobías Díaz Cuellar
*/

import tp_01.Partes.Ala;
import tp_01.Partes.MotorDeAvion;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Mi programa \n");

        //Ejercicio 1
        Ala miPrimerAla = new Ala(12, "rojo","metal");
        Ala miPrimerAla2 = new Ala(102, "blanca","carton");
 
         System.out.println(miPrimerAla.getFlap());
         System.out.println(miPrimerAla.cambiarFlap(true));
         System.out.println(miPrimerAla.cambiarFlap(true));
         System.out.println(miPrimerAla.cambiarFlap(true));
         System.out.println(miPrimerAla.cambiarFlap(true));
 
         System.out.println("La posicion del flap quedo en: " + miPrimerAla.getFlap());
 
         System.out.println(miPrimerAla2.getFlap());
         System.out.println(miPrimerAla2.cambiarFlap(true));
         System.out.println(miPrimerAla2.cambiarFlap(true));
         System.out.println(miPrimerAla2.cambiarFlap(false));
         System.out.println(miPrimerAla2.cambiarFlap(true));
 
         System.out.println("La posicion del flap quedo en: " + miPrimerAla2.getFlap());

        //Ejercicio 3
        MotorDeAvion motorDeAvion = new MotorDeAvion("Boeing", 1000, 2500);
        MotorDeAvion motorDeAvion2 = new MotorDeAvion("Rolls-Royce", 1500, 3500);
        MotorDeAvion motorDeAvion3 = new MotorDeAvion("Rolls-Royce", 2500, 5500);

        System.out.println("La marca del primer avion es: " + motorDeAvion.getMarca());
        System.out.println("Los HP del segundo avion son: " + motorDeAvion2.getHp());
        System.out.println("El empuje del tercer avion es: " + motorDeAvion3.getEmpuje());


        if(motorDeAvion.isEncendido(true)){
            System.out.println("El motor se encuentra encendido");
        }else{
            System.out.println("El motor se encuentra apagado");
        }

    }
}
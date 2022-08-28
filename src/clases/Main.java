package clases;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        Carro nuevoCarro= new Carro();

        Moto nuevaMoto= new Moto();


        System.out.println("******************************************************************");
        System.out.println("C L A S E C A R R O");
        System.out.println("Desplegando Metodo mostrarKm Con PARAMETRO DOUBLE: ");
        nuevoCarro.mostrarKm(1520.00);
        System.out.println("Desplegando Metodo mostrarKm  SIN PARAMETROS: ");
        nuevoCarro.mostrarKm();
        System.out.println("******************************************************************");
        System.out.println("Desplegando Metodos SobreEscritos de Clase Carro");
        nuevoCarro.arrancar();
        nuevoCarro.girarDerecha();
        nuevoCarro.girarIzquierda();
        nuevoCarro.frenar();
        nuevoCarro.apagar();
        System.out.println("******************************************************************");
        System.out.println(" C L A S E M O T O");
        System.out.println("Desplegando Metodo mostrarInfo Con PARAMETRO STRING: ");
        nuevaMoto.mostrarInfo("Pasola");
        System.out.println("Desplegando Metodo mostrarInfo SIN PARAMETRO STRING: ");
        nuevaMoto.mostrarInfo();
        System.out.println("******************************************************************");
        System.out.println("Desplegando Metodos SobreEscritos de Clase Moto");
        nuevaMoto.arrancar();
        nuevaMoto.girarDerecha();
        nuevaMoto.girarIzquierda();
        nuevaMoto.frenar();
        nuevaMoto.apagar();
        System.out.println("******************************************************************");

    }
}

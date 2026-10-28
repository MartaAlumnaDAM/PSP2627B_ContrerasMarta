/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.u3;

/**
 *
 * @author VicenteMartínez
 */
public class A3_Inversa2 implements Runnable {

    private int minValue = 500;
    private int maxValue = 1000;

    A3_Inversa2() {

    }

    // El constructor no está en las especificaciones del programa
    // Pero es un ejemplo de funcionalidades que podermos añadir al código
    // de la clase, en este caso para ser más genérica
    A3_Inversa2(int min, int max) {
        super();    // Primero llamamos al constructor de Thread
        this.minValue = min;
        this.maxValue = max;
    }

    @Override
    public void run() {
        int sumaImpares = 0;
        for (int i = minValue; i <= maxValue; i++) {
            if (i % 2 != 0) {
                sumaImpares += i;
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "] - " + sumaImpares);
    }

}

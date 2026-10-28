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
public class A6_Sumatorio1 implements Runnable {

    private int minValue = 100;
    private int maxValue = 1000;

    A6_Sumatorio1() {

    }

    // El constructor no está en las especificaciones del programa
    // Pero es un ejemplo de funcionalidades que podermos añadir al código
    // de la clase, en este caso para ser más genérica
    A6_Sumatorio1(int min, int max) {
        super();    // Primero llamamos al constructor de Thread
        this.minValue = min;
        this.maxValue = max;
    }

    @Override
    public void run() {
        int sumaPares = 0;
        for (int i = minValue; i <= maxValue; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "] - " + sumaPares);
    }

}

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
public class A7_ParImpar2 implements Runnable {

    private int minValue = 0;
    private int maxValue = 10;

    A7_ParImpar2() {

    }

    // El constructor no está en las especificaciones del programa
    // Pero es un ejemplo de funcionalidades que podermos añadir al código
    // de la clase, en este caso para ser más genérica
    A7_ParImpar2(int min, int max) {
        super();    // Primero llamamos al constructor de Thread
        this.minValue = min;
        this.maxValue = max;
    }

    @Override
    public void run() {
        int sumaPares = 0;
        for (int i = minValue; i <= maxValue; i++) {
            if (i % 2 == 0) {
                System.out.println("[" + Thread.currentThread().getName() + "] - " + i);
            }
        }

    }

}

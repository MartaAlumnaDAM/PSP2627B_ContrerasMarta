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
public class A4_Divisores1 extends Thread {

    private int minValue = 1;
    private int maxValue = 200;

    A4_Divisores1() {

    }

    // El constructor no está en las especificaciones del programa
    // Pero es un ejemplo de funcionalidades que podermos añadir al código
    // de la clase, en este caso para ser más genérica
    A4_Divisores1(int min, int max) {
        super();    // Primero llamamos al constructor de Thread
        this.minValue = min;
        this.maxValue = max;
    }

    @Override
    public void run() {
        for (int i = minValue; i <= maxValue; i++) {
            if (i % 4 == 0) {
                System.out.println("[" + Thread.currentThread().getName() + "] - " + i);
            }
        }        
    }

}

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
public class A1_Numeros2 extends Thread {
    private int nMultiplos;
    
    A1_Numeros2() {
        this.nMultiplos = 10;
    }
    
    // El constructor no está en las especificaciones del programa
    // Pero es un ejemplo de funcionalidades que podermos añadir al código
    // de la clase, en este caso para ser más genérica
    A1_Numeros2(int n) {        
        this.nMultiplos = n;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < nMultiplos; i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] - " + i * 10);
        }
    }    
}

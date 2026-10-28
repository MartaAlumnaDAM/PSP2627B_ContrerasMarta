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
public class A9_Factorial1 implements Runnable {

    int number;
    public A9_Factorial1(int n) {
        this.number = n;
    }
    
    @Override
    public void run() {
        // Solicitamos el valor de n para calcular la suma de la serie


        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("[" + Thread.currentThread().getName() + "] - " + factorial);
    }
    
}

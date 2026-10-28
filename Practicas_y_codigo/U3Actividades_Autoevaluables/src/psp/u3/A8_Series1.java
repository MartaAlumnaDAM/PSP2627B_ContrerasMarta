/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.u3;

import java.util.Scanner;

/**
 *
 * @author VicenteMartínez
 */
public class A8_Series1 extends Thread {

    @Override
    public void run() {
        // Solicitamos el valor de n para calcular la suma de la serie
        Scanner sc = new Scanner(System.in);
        System.out.println("[" + Thread.currentThread().getName() + "] - Introduzca el valor de n: ");
        int n = sc.nextInt();

        int sumaSerie = 0;
        for (int i = 1; i <= n; i++) {
            sumaSerie += 2 * i;
        }
        System.out.println("[" + Thread.currentThread().getName() + "] - " + sumaSerie);
    }

}

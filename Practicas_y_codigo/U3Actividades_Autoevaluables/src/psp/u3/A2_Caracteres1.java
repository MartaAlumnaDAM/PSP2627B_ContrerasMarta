/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.u3;

import java.util.Random;

/**
 *
 * @author VicenteMartínez
 */
public class A2_Caracteres1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int randomChar = (int) Math.random()*('z'-'a')+'a';
            System.out.println("[" + Thread.currentThread().getName() + "] - " + (char)randomChar);
        }
    }
}

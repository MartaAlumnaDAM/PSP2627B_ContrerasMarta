/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.u3;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author VicenteMartínez
 */
public class A3_Inversa1 implements Runnable {

    private String inputString = "hilo";

    public A3_Inversa1() {
    }

    public A3_Inversa1(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public void run() {

        String reverseInput = "";
        for (int letter = inputString.length() - 1; letter >= 0; letter--) {
            reverseInput += inputString.charAt(letter);
            System.out.println("[" + Thread.currentThread().getName() + "] - " + reverseInput);
        }
    }
}

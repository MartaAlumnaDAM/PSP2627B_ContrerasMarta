/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.u3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author VicenteMartínez
 */
public class A5_Argumentos1 implements Runnable {

    String inputString;
    private final List vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'e', 'I', 'O', 'U');

    public A5_Argumentos1() {
    }

    public A5_Argumentos1(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public void run() {

        String onlyVowels;

        // Solución con Stream APU
        onlyVowels = inputString.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> vowels.contains((char) c))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("[" + Thread.currentThread().getName() + "] - " + onlyVowels);

    }
}

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
public class A2_Caracteres2 extends Thread {

    private final List vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'e', 'I', 'O', 'U');

    @Override
    public void run() {
        Scanner read = new Scanner(System.in);
        String onlyVowels;

        System.out.print("[" + Thread.currentThread().getName() + "] - Escribe un texto: ");
        String inputText = read.nextLine();

        // Solución con Stream APU
        onlyVowels = inputText.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> vowels.contains((char) c))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("[" + Thread.currentThread().getName() + "] - " + onlyVowels);

        // Solucion recorriendo el string posición a posición     
        for (int letter = 0; letter < inputText.length(); letter++) {
            if (vowels.contains(inputText.charAt(letter))) {
                onlyVowels += inputText.charAt(letter);
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "] - " + onlyVowels);

    }
}

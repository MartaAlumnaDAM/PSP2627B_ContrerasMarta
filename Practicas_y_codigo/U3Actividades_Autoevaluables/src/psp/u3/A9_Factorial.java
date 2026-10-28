/*
 * Hacer  un  programa  que  contenga  tres  hilos  en  ejecución,  
 * dos  de  ellos  realizaran  la suma  de  los  números  divisibles  entre  5  que  
 * se  encuentran  en  un  rango  de  100  al 1000,  y  el  hilo  restante,  la  
 * impresión  de  los  10  primeros  múltiplos  de  10. 
 * Hacedlo  extendiendo  de  la  clase  Thread.
 */
package psp.u3;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author VicenteMartínez
 */
public class A9_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args.length == 0) {
            System.exit(2);
        }

        int i = 0;
        for (String param : args) {
            try {
                int n = Integer.parseInt(param);
                Thread hilo = new Thread(new A9_Factorial1(n));
                hilo.setName("Factorial-thread" + (++i));
                hilo.start();
            } catch (NumberFormatException ex) {
                System.out.println(param + " is not a number. It will be iscarded");
            }
        }
    }
}
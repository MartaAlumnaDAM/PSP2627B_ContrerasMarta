/*
 * Hacer  un  programa  que  contenga  tres  hilos  en  ejecución,  
 * dos  de  ellos  realizaran  la suma  de  los  números  divisibles  entre  5  que  
 * se  encuentran  en  un  rango  de  100  al 1000,  y  el  hilo  restante,  la  
 * impresión  de  los  10  primeros  múltiplos  de  10. 
 * Hacedlo  extendiendo  de  la  clase  Thread.
 */
package psp.u3;

/**
 *
 * @author VicenteMartínez
 */
public class A4_Divisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A4_Divisores1 hilo1 = new A4_Divisores1();
        A4_Divisores1 hilo2 = new A4_Divisores1();
        A4_Divisores1 hilo3 = new A4_Divisores1();
        hilo1.setName("Divisores4-thread1");
        hilo2.setName("Divisores4-thread2");
        hilo3.setName("Divisores4-thread3");
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

}

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
public class A1_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A1_Numeros1 hilo1 = new A1_Numeros1();
        A1_Numeros1 hilo2 = new A1_Numeros1();
        A1_Numeros2 hilo3 = new A1_Numeros2();
        hilo1.setName("Divisores5-thread1");
        hilo2.setName("Divisores5-thread2");
        hilo3.setName("Multiplos10-thread1");
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

}

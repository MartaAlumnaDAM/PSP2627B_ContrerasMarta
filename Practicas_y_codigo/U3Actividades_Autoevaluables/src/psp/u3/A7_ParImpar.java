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
public class A7_ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        A7_ParImpar1 hilo1 = new A7_ParImpar1(1,10);
        Thread hilo2 = new Thread(new A7_ParImpar2(0,10));
        hilo1.setName("ParImpar-thread1");
        hilo2.setName("ParImpar-thread2");
        hilo1.start();
        hilo2.start();
    }
}

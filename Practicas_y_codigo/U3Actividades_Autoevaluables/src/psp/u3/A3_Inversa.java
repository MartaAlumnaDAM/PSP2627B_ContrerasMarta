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
public class A3_Inversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new A3_Inversa1("jamon"));
        Thread hilo2 = new Thread(new A3_Inversa2());
        hilo1.setName("Inversa-thread1");
        hilo2.setName("SumaImpares-thread1");
        hilo1.start();
        hilo2.start();
    }
    
}

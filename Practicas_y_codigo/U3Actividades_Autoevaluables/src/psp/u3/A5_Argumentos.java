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
public class A5_Argumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(2);
        }

        // Podemos esperar un único argumento con toda la cadena
        // y la partimos nosotros
        // La cadena hay que pasarla entrecomillada
        //
        // O bien si pasamos la cadena sin entrecomillar
        // La parte la JVM por nosotros y tendríamos que procesar
        // cada elmento de args[]
        int nameIndex=0;
        for (String word : args[0].split("\\s")) {
            Thread hilo = new Thread(new A5_Argumentos1(word));
            hilo.setName("Argumentos-thread" + (++nameIndex));
            hilo.start();
        }
    }
}

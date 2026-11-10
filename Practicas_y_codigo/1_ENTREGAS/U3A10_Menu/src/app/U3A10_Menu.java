/*


*/
package app;

/**
 *
 * @author Marta
 */
public class U3A10_Menu {

    public static void main(String[] args) {
        
        try{
            CreaHilo primeros = new CreaHilo(1,"src/datos/menu.txt","src/datos/primeros.txt");
            primeros.start();
            primeros.join();

            CreaHilo segundos = new CreaHilo(2, "src/datos/menu.txt", "src/datos/segundos.txt");
            segundos.start();
            segundos.join();

            CreaHilo postres = new CreaHilo(3, "src/datos/menu.txt", "src/datos/postres.txt");
            postres.start();
            postres.join();
            
        }catch(InterruptedException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
        
        
        
    }
    
}

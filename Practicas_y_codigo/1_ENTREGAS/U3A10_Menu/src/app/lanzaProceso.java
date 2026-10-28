package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author marta
 */
public class lanzaProceso extends Thread {

    String section;
    String archivo;

    public lanzaProceso() {
    }

    public lanzaProceso(String section, String archivo) {
        this.section = section;
        this.archivo = archivo;
    }

    private String leeSeccionArchivo() {

        String linea = null;
        String res = "";

        try (BufferedReader br = new BufferedReader(
                new FileReader(new File(archivo)))) {
            
            linea = br.readLine();
            
            while(linea != null){
                if(linea.startsWith(section)){
                    
                }
            }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        return res;
    }
    
    @Override
    public void run(){
        String res = leeSeccionArchivo();
        //escribirArchivo(res);
    }

}

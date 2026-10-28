package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class CreaHilo extends Thread{
    
    int seccion;
    String archivo;
    String archivoSalida;

    public CreaHilo() {
    }

    public CreaHilo(int submenu, String archivo) {
        this.seccion = submenu;
        this.archivo = archivo;
        this.archivoSalida = archivoSalida;
    }

    private String LeeMenu(){
        
        String linea = null;
        String submenu = "";

        try (BufferedReader br = new BufferedReader(
                new FileReader(new File(archivo)))) {
            
            linea = br.readLine();
            
            while(linea != null){
                
                String coincidencia = String.valueOf(seccion);
                
                if(linea.startsWith(coincidencia)){
                    submenu += linea;
                }
            }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        return submenu;
    }
    
    public void EscribeSubmenu(String submenu, String archivoSalida){
    
        try(PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                        new FileOutputStream(archivoSalida),StandardCharsets.UTF_8))
        )){
            pw.println(submenu);
        
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    
    }
    
    
    @Override
    public void run(){
    
        
    }
    
    
}

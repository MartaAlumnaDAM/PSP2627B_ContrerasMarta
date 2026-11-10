package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class CreaHilo extends Thread {

    int seccion;
    String archivo;
    String archivoSalida;

    public CreaHilo() {
    }

    public CreaHilo(int submenu, String archivo, String archivoSalida) {
        this.seccion = submenu;
        this.archivo = archivo;
        this.archivoSalida = archivoSalida;
    }

    private String LeeMenu() {

        String linea = null;
        String submenu = "";

        try (BufferedReader br = new BufferedReader(
                new FileReader(new File(archivo)))) {

            linea = br.readLine();

            while (linea != null) {

                String coincidencia = String.valueOf(seccion);

                if (linea.startsWith(coincidencia)) {
                    
                    String lineaLimpia = linea.substring(2) + "\n";
                    submenu += lineaLimpia;
                    System.out.println("El hilo: " + getName() + " escribe..." + lineaLimpia);
                    escribeSubmenu(lineaLimpia);
                }

                linea = br.readLine();
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return submenu;
    }

    public void escribeSubmenu(String submenu) {

        try (PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream(archivoSalida), StandardCharsets.UTF_8))
        )) {
         
            pw.println(submenu.split("\n"));

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    @Override
    public void run() {

        System.out.println("Ejecutando hilo: " + Thread.currentThread().getName());
        String submenu = LeeMenu();

        
    }

}

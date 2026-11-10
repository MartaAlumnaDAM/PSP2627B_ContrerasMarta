package psp.actividades;

public class CreaHilo extends Thread {

    int aleatorio;
    char sentido;
    int inferior;
    int superior;
    int sizeVector = 10;
    int[] vector = new int[sizeVector];

    public int generaAleatorio() {
        return aleatorio = (int) Math.random() * (superior - inferior) + inferior;
    }

    public void completaVector() {

        int elemento = generaAleatorio();
        
        if (sentido == 'D') {
            for (int i = 0; i < vector.length; i++) {
                vector[i] = elemento;
            }
        }
        
        else {
            for (int i = vector.length ; i > 0; i--) {
                vector[i] = elemento;
            }
        }

    }
    
    public void muestraArray(){
    
        for (int i = 0; i < vector.length; i++) {
                print(vector[i]);
            }
        
        
    }

    @Override
    public void run() {
        
        
    }

}

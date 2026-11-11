package u3a30_restaurante;

import java.util.ArrayList;
import java.util.List;

public class U3A30_Carta {
    
    private static List<String> platos = new ArrayList<>() {
            {
                add("Lentejas");
                add("Ensalada mixta");
                add("Sopa de verduras");
                add("Ternera planca");
                add("Macarrones con tomate");
                add("Arroz con marisco");
            }
        };

    public static String elegirComida() {


        double aleatorio = Math.random();
        
        int elegido = (int)(aleatorio * platos.size());
       
        return platos.get(elegido);
    }
}


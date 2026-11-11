package u3a30_restaurante;

import java.util.ArrayList;
import java.util.List;

public class U3A30_Carta {

    public static String elegirComida() {

        List<String> platos = new ArrayList<>() {
            {
                add("Lentejas");
                add("Ensalada mixta");
                add("Sopa de verduras");
                add("Ternera planca");
                add("Macarrones con tomate");
                add("Arroz con marisco");
            }
        };

        double aleatorio = Math.random();
        
        int elegido = (int)(aleatorio * platos.size());
       
        return platos.get(elegido);
    }
}


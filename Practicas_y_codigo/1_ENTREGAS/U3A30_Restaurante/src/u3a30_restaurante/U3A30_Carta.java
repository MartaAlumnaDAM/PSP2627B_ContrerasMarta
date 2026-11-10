package u3a30_restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class U3A30_Carta {

    public static U3A30_Plato elegirComida() {

        List<String> platos = new ArrayList<>() {
            {
                add("Lentejas");
                add("Ensalada mixta");
                add("Sopa de verduras");
            }
        };

        double aleatorio = Math.random();
        
        int elegido = (int)aleatorio * platos.size();
        
        for(int i = 0; i > platos.size(); i++){
        
        }
        
        return platos[elegido];
    }
}

package u3a30_restaurante;

public class U3A30_Plato {
    
    //private static U3A30_Carta platoElegido = new U3A30_Carta();
    private String nombre;
    
    public void prepara(){
        
        this.nombre = U3A30_Carta.elegirComida();
        
    }
    
    public void sirve(U3A30_Plato plato){
        
        this.nombre = "";
    }
}

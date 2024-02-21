import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap01 {
  public static void main(String[] args) {
    
    HashMap<Integer , String> m = new HashMap<>();

    m.put(998 ," Luis Godino");
    m.put(458 ," Mipa Logordo");
    m.put(665 ," Mariano Velañez");

    System.out.println("Los elementos de m son: \n"+m);

    for (int clave : m.keySet()) {
      
    }
  }
}

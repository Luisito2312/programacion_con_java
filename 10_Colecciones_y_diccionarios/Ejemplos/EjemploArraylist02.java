import java.util.ArrayList;

public class EjemploArraylist02 {
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();

    a.add("Verde");
    a.add("Rojo");
    a.add("Blanco");
    a.add("Azul");
    a.add("Verde");

    for (int i = 0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }
  }
}

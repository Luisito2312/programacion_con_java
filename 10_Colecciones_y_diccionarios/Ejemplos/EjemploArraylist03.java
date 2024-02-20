import java.util.ArrayList;

public class EjemploArraylist03 {
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();

    a.add("Verde");
    a.add("Azul");
    a.add("Rojo");
    a.add("Verde");
    a.add("Negro");
    a.add("Amarillo");
    a.add("Verde");
    a.add("Morado");

    for (String color : a) {
      System.out.println(color);
    }

    if (a.contains("Verde")) {
      System.out.println("El color verde está dentro de la lista de colores");
    }

    a.remove("Verde");

    System.out.println("Lista despues de elimiar el color verde");

    for (String color : a) {
      System.out.println(color);
    }

  }
}

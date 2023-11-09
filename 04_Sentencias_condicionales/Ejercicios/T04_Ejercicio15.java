import java.util.Scanner;

public class T04_Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el carácter con el que quieres dibujar la pirámide");
    String a = sc.nextLine();

    System.out.println("Elige hacia dónde quieres que apunte la pirámide");
    System.out.println("1 arriba  2 Abajo   3 Derecha   4 Izquierda");
    int b = sc.nextInt();

    switch (b) {
      case 1:
        System.out.println("     "+a);
        System.out.println("   "+a+a+a);
        System.out.println("  "+a+a+a+a+a);
        System.out.println(" "+a+a+a+a+a+a+a);
        System.out.println(a+a+a+a+a+a+a+a+a);
        break;
      
      case 2:
      System.out.println(a+a+a+a+a+a+a+a+a);
      System.out.println(" "+a+a+a+a+a+a+a);
      System.out.println("  "+a+a+a+a+a);
      System.out.println("   "+a+a+a);
      System.out.println("     "+a);

      case 3:
      System.out.println(a);
      System.out.println(a+a);
      System.out.println(a+a+a);
      System.out.println(a+a+a+a);
      System.out.println(a+a+a+a+a);
      System.out.println(a+a+a+a);
      System.out.println(a+a+a);
      System.out.println(a+a);
      System.out.println(a);

      case 4: 
      System.out.println("    "+a);
      System.out.println("   "+a+a);
      System.out.println("  "+a+a+a);
      System.out.println(" "+a+a+a+a);
      System.out.println(a+a+a+a+a);
      System.out.println(" "+a+a+a+a);
      System.out.println("  "+a+a+a);
      System.out.println("   "+a+a);
      System.out.println("    "+a);
      default:
        break;
    }
    sc.close();
  }
}

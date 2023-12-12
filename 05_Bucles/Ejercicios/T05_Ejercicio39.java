import java.util.Scanner;

public class T05_Ejercicio39 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int resltado = 1;
    int salva = 0;

    System.out.println("Introduzca un número entero");
    int n = sc.nextInt();

    for (int i = 1; i < n+1; i++) {
      salva = i;
      resltado *= salva;
      System.out.println(i+"! = "+resltado);
      
    }
    sc.close();
  }
}

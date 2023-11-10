import java.util.Scanner;

public class T04_Ejercicio21 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce las dos notas que has sacado en los examenes de programación separados por un espacio");
    int nota1 = sc.nextInt();
    int nota2 = sc.nextInt();
    sc.nextLine();
    int media = (nota1 + nota2) / 2;

    if (media < 5) {
      System.out.println("Que calificación tiene en el examen de recuperación ( apto/no apto )");
      String recup = sc.nextLine();

      if (recup.equals("apto")) {
        System.out.println("Enhorabuena, has aprobado");
      } else {
        System.out.println("Estas suspenso");
      }
    } else {
      System.out.println("Enhorabuena has aprobado");
    }
    sc.close();
  }
}

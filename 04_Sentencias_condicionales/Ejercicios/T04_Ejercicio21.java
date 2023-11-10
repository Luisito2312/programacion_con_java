import java.util.Scanner;

public class T04_Ejercicio21 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce las dos notas que has sacado en los examenes de programación separados por un espacio");
    Double nota1 = sc.nextDouble();
    double nota2 = sc.nextDouble();
    sc.nextLine();
    double media = (nota1 + nota2) / 2;

    if (media < 5) {
      System.out.println("Que calificación tiene en el examen de recuperación ( apto/no apto )");
      String recup = sc.nextLine();

      if (recup.equals("apto")) {
        System.out.println("Enhorabuena, has aprobado con un 5");
      } else {
        System.out.println("Estas suspenso con un "+media);
      }
    } else {
      System.out.println("Enhorabuena has aprobado con un "+media);
    }
    sc.close();
  }
}

import java.util.Scanner;

public class T04_Ejercicio24 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Cuál es su cargo, 1-Prog. junior, 2-Prog. senior, 3-Jefe de proyecto");
    int cargo = sc.nextInt();

    System.out.println("Introduzca su estado civil, 1-Soltero, 2-Casado");
    int estado = sc.nextInt();

    System.out.println("Cuántos días lleva visitando a clientes?");
    int clientes = sc.nextInt();

    Double sueldo = 0.0;
    switch (cargo) {
      case 1:
        sueldo = 950.0;
        break;
    
        case 2:
        sueldo = 1200.0;
        break;

        case 3:
        sueldo = 1200.0;
        break;
      default:
        break;
    }

    if (estado == 1){
      Double irpf = 0.25 ;
    } else {
      Double irpf = 0.20;
    }

    System.out.println("--------------------------");
    System.out.printf("Sueldo base   %8d\n" , sueldo);
  }
}

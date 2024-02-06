/*
 Ejercicio de examen
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class EjercicioExamen {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String menu = "";
    do {
      System.out.println("1. Nota media del alumno");
    System.out.println("2. Conversor de euros a pesetas");
    System.out.println("3. Conversor de pesetas a euros");
    System.out.println("4. Longitud de un número");
    System.out.println("5. Dígitos pares e impares");
    System.out.println("6. Divisores propios");
    System.out.println("7. Números amigos");
    System.out.println("8. Primo");
    System.out.println("9. N primeros primos");
    System.out.println("10. Factorial");
    System.out.println("SALIR");
    menu = sc.nextLine();

    switch (menu) {
      case "1":
      double nota1;
      double nota2;
      double nota3;
    
      System.out.println("Introduce la primera nota");
      nota1 = sc.nextDouble();
  
      System.out.println("Introduce la segunda nota");
      nota2 = sc.nextDouble();
  
      System.out.println("Introduce la tercera nota");
      nota3 = sc.nextDouble();
  
      double media = (double)(nota1 + nota2 + nota3) / 3;
  
      if (media >= 5) {
        System.out.printf("Has aprobado con un: \033[0;32m %.2f \033[0;0m" , media);
        
      } else {
        System.out.printf("Has suspendido con un: \033[0;31m %.2f \033[0;0m", media);
      }

        break;
      case "2":
      int pesetas;
      double euros;
      
      System.out.println("Introduce la cantidad de euros que va a pasar a pesetas");
      euros = sc.nextDouble();
  
      double conversion = euros * 166.386;
      pesetas = (int)(conversion);
  
      System.out.printf("%.2f euros ", euros);
      System.out.println("son: " + pesetas+" pesetas");
        break;
      case "3":
      int pesetas1;
      double euros1;
      
      System.out.println("Introduce la cantidad de pesetas que va a pasar a euros");
      pesetas1 = sc.nextInt();
  
      double conversion1 = pesetas1 / 166.386;
      euros1 = conversion1;
  
      System.out.print( pesetas1+" pesetas");
      System.out.printf(" son %.2f euros ", euros1);
        break;
      case "4":
      long numeroEjer4;
      int i = 0;
  
      System.out.println("Introduce un número para ver cuantos digitos tiene");
      numeroEjer4 = sc.nextLong();
  
      do {
        numeroEjer4 /= 10;
        i++;
      } while (numeroEjer4 !=0);
  
      System.out.println("El número tiene: "+i+" número de dígitos");
        break;

        case "5":
        System.out.println("Introduce un número para ver cuantos pares e impares tiene");
    long numero = sc.nextLong();

    long copiaNumero = numero;
    long aux;
    int pares = 0;
    int impares = 0;

    do {
      aux = copiaNumero % 10;
      copiaNumero %= 10;
      if (aux % 2 == 0 ) {
        pares++;
      } else  {
        impares++;
      }
    } while (copiaNumero !=0);

    System.out.println("El número "+numero+" tiene "+pares+" pares, y "+impares+"impares");
        break;


        case "6":
         System.out.println("Introduzca un número entero");
    int numeroEjer6 = sc.nextInt();

    int sumaDivisores = 0;

    for (int a = 1; a < numeroEjer6; a++) {
      if (numeroEjer6 % a == 0) {
        System.out.println("El número "+a+ " es un divisor propio de "+numeroEjer6);
        sumaDivisores += a;
      }
    }
    System.out.println("la suma de los divosores propios es: "+ sumaDivisores);
        break;


        case "7":
         boolean amigos = false;
    int sumaDivisores1 = 0;
    int sumaDivisores2 = 0;

    System.out.println("Introduce el primer numero a comprobar");
    int num1 = sc.nextInt();

    System.out.println("Introduce el segundo numero a comprobar");
    int num2 = sc.nextInt();

    for (i = 1; i < num1; i++) {
      if (num1 % i == 0) {
        sumaDivisores1 += i;
      }
    }
    
    for (i = 1; i < num2; i++) {
      if (num2 % i == 0) {
        sumaDivisores2 += i;
      }
    }

    if ((sumaDivisores1 == num2) && (sumaDivisores2 == num1)) {
      amigos = true;
    } else {
      amigos = false;
    }

    System.out.println("Son los números "+num1+" y "+num2+" amigos?");
    if (amigos == true) {
      System.out.println(amigos);
    } else if (amigos == false) {
      System.out.println(amigos);
    }
        break;


        case "8":
        System.out.println("Introduce un número para ver si es primo");
    int num = sc.nextInt();

    int j = 0;

    for (i = 1; i <= num; i++) {
      if (num % i == 0) {
        j++;
      }
    }

    if (j == 2) {
      System.out.println("El número es primo");
    } else if (j !=2) {
      System.out.println("El número no es primo");
    }
        break;


        case "9":
        System.out.println("Introduce un número");
        numero = sc.nextInt();

    j = 0;

    for (i = 1; i <= numero; i++) {
      j = 0;
      for (int k = 1; k <= i; k++) {
        if (i % k == 0) {
          j++;
        }      
      }
      if (j ==2) {
        System.out.println("El número "+i+" es primo");
      } else if (j != 2) {
    }
  }
        break;


        case "10":
        System.out.println("Introduce un número para calcular su factorial");
    numero = sc.nextInt();

    aux = 1;

    for (i = 1; i <= numero; i++) {
      aux *= i;
    }

    System.out.println(numero+"! = "+aux);
        break;
        case "SALIR":
        
        break;
      default:
        break;
    }
    System.out.println("");
   
    } while (menu !="SALIR");

    
sc.close();
  }
}

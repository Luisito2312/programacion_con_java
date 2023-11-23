import java.util.Scanner;

public class T05_Ejercicio32 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int i = 0;
    long NumeroVolteado = 0;
    int npares = 0;
    int NumeroDeCifras = 0;
    int digito = 0;
    

    System.out.print("Introduce un número entero y positivo");
    int n = sc.nextInt();
    int Copian = Math.abs(n);
    sc.close();

    while (Copian > 0) {
      NumeroVolteado = (Copian % 10) + (NumeroVolteado * 10);
      Copian /= 10;
      NumeroDeCifras++;
    }

    System.out.print("Digitos pares: ");

    for ( i = 0; i < NumeroDeCifras; i++) {
      digito = (int) (NumeroVolteado % 10);

      if (digito % 2 == 0) {
        System.out.print(digito + " ");
        npares += digito;
      }
      NumeroVolteado /= 10; 
    }
    System.out.println("\n La suma de los números pares es: "+npares);
 }
}

import java.util.Scanner;

public class Examen3 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el radio de la base mayor R (cm): ");
    Double radio = sc.nextDouble();

    System.out.println("introduzca el radio de la base menor r (cm): ");
    Double radioo = sc.nextDouble();

    System.out.println("Introduzca la altura h (cm): ");
    Double altura = sc.nextDouble();

    Double volumen =0.33*Math.PI*altura*((radio*radio)+(radioo*radioo)+(radio*radioo)) ;

    System.out.printf("El volumen del toroide es: \033[1;31m " + volumen+ " cm \u00B3 \033[0m"  );

    sc.close();
  }
}

//(1/3) *  Math.PI * altura * ((radio * radio) + (radioo * radioo) + (radio * radioo))
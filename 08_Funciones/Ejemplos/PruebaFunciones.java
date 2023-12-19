import matematicas.varias;
import matematicas.volumen;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class PruebaFunciones {
  public static void main(String[] args) {
  int n;

  //Probamos la funcion es primo alojada en la clase "varias" dentro del paquete "Matematicas"
  System.out.println("Introduzca un número entero positivo");
  n = Integer.parseInt(System.console().readLine());

  if (varias.esPrimo(n)) {
    System.out.println("El número es primo");
  } else {
    System.out.println("El número no es primo");
  }

  //Prueba funcion digitos
  System.out.println("Introduce un número entero positivo");
  n = Integer.parseInt(System.console().readLine());

  int numDigitos = varias.digitos(n);

  System.out.println("El número "+ n + " tiene " + numDigitos + " digitos");

  //Ahora el del volumen que también hemos añadido a la clase matematicas. le pasamos las dos variables "r" "h"
  double r;
  double h;

  System.out.println("Introduce el radio");
  r = Double.parseDouble(System.console().readLine());

  System.out.println("Introduzca la altura");
  h = Double.parseDouble(System.console().readLine());

  System.out.println("El volumen del cilindro es "+ volumen.volumenCilindro(r, h));

  //Probamos la funcion de darle la vuelta a un numero
Scanner sc = new Scanner(System.in);

  System.out.println("Introduce un número");
  long j = sc.nextLong();


  System.out.println("El número volteado es "+ varias.voltea(j));

  //Prueba funcion voltea(int)
  Scanner scanner = new Scanner(System.in);

  System.out.println("Introduce un número");
  int y = sc.nextInt();


  System.out.println("El número volteado es "+ varias.voltea(y));

  //escapicua
  System.out.println("Introduce un numero para ver si es capicuo");
  long k = Long.parseLong(System.console().readLine());
  if (esCapicua(k)) {
    System.out.println("El número es capicuo");
  } else {
    System.out.println("El número no es capicuo");
  }
  }

  
}

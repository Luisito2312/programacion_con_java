import matematicas.varias;
import matematicas.volumen;

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

  //Ahora el del volumen
  double r;
  double h;

  System.out.println("Introduce el radio");
  r = Double.parseDouble(System.console().readLine());

  System.out.println("Introduzca la altura");
  h = Double.parseDouble(System.console().readLine());

  System.out.println("El volumen del cilindro es "+ volumen.volumenCilindro(r, h));
  }
}

import matematicas.varias;

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
}
}

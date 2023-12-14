public class numeroprimoconfuncion {

   //funciones definidas por el usuario
    public static boolean esPrimo( int x ) {
      for (int i = 2; i < x; i++) {
        if ((x % i) == 0) {
          return false;
        }
        
      }
      return true;
  }
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int n = Integer.parseInt(System.console().readLine());

    if (esPrimo(n)) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
  }
}
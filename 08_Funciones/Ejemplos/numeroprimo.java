public class numeroprimo {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    boolean esPrimo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

    // El if anterior se puede abreviar de esta otra manera.
    // Descomenta para probarlo.
    // System.out.println("El número introducido" + (esPrimo ? "" : " no") + " es primo.");
  }
}

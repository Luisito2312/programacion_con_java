public class T07_Ejercicio12_Bien {
  public static void main(String[] args) {
    int[] numeros = new int[10];
    int indiceInicial;
    int indiceFinal;

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Introduzca un número para almacenar");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }

    // Muestro la tabla de valores
    System.out.print("Indice ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%5s   |", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%5s   |", numeros[i]);
    }

    boolean continuar;
    do {
      continuar = true;
      System.out.println("\nIntroduzca la posición inicial");
      indiceInicial = Integer.parseInt(System.console().readLine());

      System.out.println("Introduzca la posición final");
      indiceFinal = Integer.parseInt(System.console().readLine());

      if (indiceFinal < indiceInicial) {
        System.out.println("Incorrecto, el número inicial debe ser menor que el final");
        continuar = false;
      }

      if ((indiceFinal < 0) || (indiceFinal > 9) || (indiceInicial < 0) || (indiceInicial > 9)) {
        System.out.println("Debes introducir un número entre (0-9)");
        continuar = false;
      }
    } while (!continuar);

    int[] copiaNumeros = new int[10];
    for (int i = 0; i < copiaNumeros.length; i++) {
      copiaNumeros[i] = numeros[i];
    }

    // Move the elements from the beginning to indiceInicial one position to the right
    for (int i = indiceInicial; i > 0; i--) {
      copiaNumeros[i] = copiaNumeros[i - 1];
    }

    copiaNumeros[0] = numeros[9];

    // Move the elements from indiceFinal to the end one position to the right
    for (int i = 9; i > indiceFinal; i--) {
      copiaNumeros[i] = copiaNumeros[i - 1];
    }

    // Exchange the elements at indiceInicial and indiceFinal
    int temp = copiaNumeros[indiceFinal];
    copiaNumeros[indiceFinal] = copiaNumeros[indiceInicial];
    copiaNumeros[indiceInicial] = temp;



    // Print the updated array
    System.out.print("Indice ");
    for (int i = 0; i < copiaNumeros.length; i++) {
      System.out.printf("%5s   |", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < copiaNumeros.length; i++) {
      System.out.printf("%5s   |", copiaNumeros[i]);
    }
  }
}

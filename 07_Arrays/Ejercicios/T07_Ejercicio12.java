public class T07_Ejercicio12 {
  public static void main(String[] args) {
    int[] numeros = new int[10];
    int indiceInicial;
    int indiceFinal;
    int aux = 0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Introduzca un número para almacenar");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }

    //Muestro la tabla de valores
    System.out.print("Indice ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%5s   |", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%5s   |",numeros[i]);
    }

    boolean continuar;
    do {
      continuar = true;
      System.out.println("\nIntroduzca la posición inicial");
    indiceInicial = Integer.parseInt(System.console().readLine());

    System.out.println("Introduzca la posición final");
    indiceFinal = Integer.parseInt(System.console().readLine());

    if (indiceFinal < indiceInicial) {
      System.out.println("Incorrecto, el numero inicial tiene que ser menor que el final");
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

    copiaNumeros[indiceFinal] = numeros[indiceInicial];
    copiaNumeros[indiceInicial] = numeros[indiceFinal];

    for (int i = 0; i < indiceInicial; i++) {
      copiaNumeros[i] = numeros[i+1];
    }

    for (int i = indiceFinal; i < copiaNumeros.length; i++) {
      copiaNumeros[i] = numeros[i];
    }

    System.out.print("Indice ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%5s   |", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%5s   |",numeros[i]);
    }
  }
}

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

    System.out.println("Introduzca la posición inicial");
    indiceInicial = Integer.parseInt(System.console().readLine());

    System.out.println("Introduzca la posición final");
    indiceFinal = Integer.parseInt(System.console().readLine());

    aux = indiceInicial;
    numeros[indiceInicial] = numeros[indiceFinal];
    numeros[indiceFinal] = numeros[aux];

    for (int i = 9; i < indiceFinal; i--) {
      numeros[i] = numeros[i-1];
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

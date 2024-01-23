public class T07_Ejercicio07 {
  public static void main(String[] args) {
    
    // Creo el array
    int[] numeros = new int[100];
    int valorIntroducido;
    int primerValorArray;

    // Genero los números aleatorios del array
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int)(Math.random() * 21);
    }

    // Muestro los números por pantalla
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }

    // Leo el número que voy a introducir en la primera posición
    System.out.println("\nIntroduce un valor para cambiar por el primero:");
    valorIntroducido = Integer.parseInt(System.console().readLine());

    // Guardo el primer valor del array antes de hacer los intercambios
    primerValorArray = numeros[0];

    // Hago los intercambios
    for (int i = 0; i < numeros.length - 1; i++) {
      int temp = numeros[i + 1];
      numeros[i + 1] = primerValorArray;
      primerValorArray = temp;
    }

    // Cambio el primero por el que he introducido
    numeros[0] = valorIntroducido;

    // Muestro la lista actualizada
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
  }
}

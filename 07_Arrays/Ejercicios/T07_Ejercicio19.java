public class T07_Ejercicio19 {
  public static void main(String[] args) {
    int[] num = new int[12];
    for (int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random()*201);
    }

    System.out.println("Array original: ");
    System.out.print("Índice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%5d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%5d", num[i]);
    }

    System.out.print("\nIntroduzca el número que quiere insertar ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce la posición donde quiere insertar el número (0-11) ");
    int posicion = Integer.parseInt(System.console().readLine());

    //Desplazar los valores e insertar los números
    for (int i = num.length - 1; i < posicion; i--) {
      num[i] = num[i - 1];

    }
    num[posicion] = numeroIntroducido;

    //Mostramos por pantalla el resultado 
    System.out.println("Array Modificado: ");
    System.out.print("Índice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%5d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%5d", num[i]);
    }
  }
}

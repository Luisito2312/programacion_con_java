public class T07_Ejercicio06 {
  public static void main(String[] args) {
    int[] numero = new int[12];
    System.out.println("Introduzca los numeros enteros y pulse intro");

    //Escritura del array
    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    //Salida por pantalla del array
    for (int i = 0; i < numero.length; i++) {
      System.out.printf("%3d",numero[i]);
    }

    //Rotamos 
    int aux = numero[14];
    for (int i = numero.length - 1; i > 0; i--) {
      numero[i] = numero[i-1];
    }
    numero[0] = aux;

    //Salida por pantalla del array volteado
    for (int i : numero) {
      System.out.printf("%3d",i);
    }
  }
}

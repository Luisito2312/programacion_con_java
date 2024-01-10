

public class T07_Ejercicio01 {
  public static void main(String[] args) {
    int[] numero = new int[20];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

      if (numero[i] > maximo) {
        maximo = numero[i];
      }

      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    
    
    for (int i = 0; i < numero.length; i++) {
      System.out.print(numero[i] + " ");
      if (numero[i] == maximo) {
        System.out.println("maximo");
      }
      if (numero[i] == minimo) {
        System.out.println("minimo");
      }
    }
  }
}

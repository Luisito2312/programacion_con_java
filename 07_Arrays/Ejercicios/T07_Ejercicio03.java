public class T07_Ejercicio03 {
  public static void main(String[] args) {
    
    int[] num = new int[10];

    System.out.println(num.length);
    System.out.println("Introduce un número");

    for (int i = 0; i < num.length; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }

    for (int i = 9; i  >= 0; i--) {
      System.out.print(" " + num[i]);
    }
  }
}

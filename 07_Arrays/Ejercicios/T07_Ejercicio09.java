public class T07_Ejercicio09 {
  public static void main(String[] args) {
    
    //Creo el array
    int[] num = new int[8];

    //Pido los números 
    for (int i = 0; i < num.length; i++) {
      System.out.println("Introduzca un número");
      num[i] = Integer.parseInt(System.console().readLine());
    }

    for (int j = 0; j < num.length; j++) {
      if (num[j] %2 == 0) {
        System.out.println(num[j]+" Par ");
      } else {
        System.out.println(num[j]+" Impar ");
      }
    }
  }
}

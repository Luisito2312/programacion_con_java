public class T05_Ejercicio22 {
  public static void main(String[] args) {
    
    for (int i = 2; i <= 100; i++) {
      int cuentoDivisores = 0;

      for (int k = 1; k <= i; k++) {
        if (i % k == 0) {
          cuentoDivisores++;
        }
      }

      if (cuentoDivisores == 2) {
        System.out.println(i);
      }
    }
  }
}

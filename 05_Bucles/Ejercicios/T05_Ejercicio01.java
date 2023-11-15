public class T05_Ejercicio01 {
  public static void main(String[] args) {

    int num = 1;
    int multp = num % 5;
    
    for ( num = 0; num < 101; num++ ){
      if (multp == 5) {
        System.out.println(multp);
      }

    }
  }
}


//for (int i = 1; i < 11; i++) { // primera instancia (definir contador), segunda (condicion para seguir en el bucle), tercera (cada vez que se repita el bucle se repite)
//     System.out.println(i);
//   }
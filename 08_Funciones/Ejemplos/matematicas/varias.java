package matematicas;

public class varias {
 /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }
    
    /** 
     * Función que sirve para voltear números, positivos y negativos. 
     * @param x (Parámetro de entrada) tiene que ser de tipo long
     * @return long este es el número volteado
     */
  
    public static long voltearNum(long x) {
      if (x < 0) {
         return voltearNum(-x);
      }
      long numeroVolteado = 0;
       while (x > 0) {
        numeroVolteado = (numeroVolteado * 10) + (x % 10);
        x /= 10;
      }
      return numeroVolteado;
  
}
}

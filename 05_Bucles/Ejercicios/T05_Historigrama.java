/*
 Hacer un ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) hasta que se introduzca un número negativo. A continuación se mostrará una tabla donde en la primera columna aparecerán los números introducidos y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T05_Historigrama {
  public static void main(String[] args) {
    int CifraIntroducida = 0; //Almaceno la cifra introducida
    long NumeroCompleto = 0;  //Se frmara cuando finalice todos los bucles
    long NumeroVolteado = 0;
    int digito = 0; // Variable que lee el digito
    int digitomayor = 0; //Almacena el digito mayor conforme lee el numero
    int numeroDigitos = 0; // Almacena el numero total de digitos

    System.out.println("Introduce numeros del 0 al 9 y para parar introduce un negativo");
    do {
      CifraIntroducida = Integer.parseInt(System.console().readLine());
      if ((CifraIntroducida >= 0) && (CifraIntroducida <= 9)) {
         NumeroCompleto = (NumeroCompleto * 10) + CifraIntroducida;
      }
    } while ((CifraIntroducida >= 0) && (CifraIntroducida <= 9));

    //Vuelta al numero y ademas vamos a ver cual es el digito mayor
    while (NumeroCompleto > 0) {
      digito = (int) (NumeroCompleto % 10);
      if (digito > digitomayor) {
        digitomayor = digito;
      }
      NumeroVolteado = (NumeroVolteado * 10) + digito;
      NumeroCompleto /= 10;
      numeroDigitos++;
    } 

    //Empezamos a mostrar en forma de tabla, tniendo en cuenta que hay que pintar digitomayor + 1 columnas y numeroDigitos filas.
    int numeroColumna = digitomayor +1;
    int numeroFilas = numeroDigitos;

    //Pintamos la primera hilera de guiones
    for (int i = 1; i <= numeroColumna; i++) {
      System.out.print(" ---");
    }

    //Empezamos a pintar las filas
    for (int i = 1; i <= numeroFilas; i++) {
      System.out.println();
      digito = (int) NumeroVolteado % 10; // COjo el digito menos significativo del volteado
      NumeroVolteado/=10;
      System.out.print("| "+ digito + " |"); // Pintar la primera columna

      //Pintamos tantas columnas con astericso como indique el digito
      for (int j = 1; j <= digito; j++) {
        System.out.print(" * |");
      }

      //Pintamos el resto de columnas sin asterisco
      for (int j = 1; j < numeroColumna - digito ; j++) {
        System.out.print("   |");
      }
    System.out.println();
    
    for (int j = 1; j <= numeroColumna; j++) {
      System.out.print(" ---");
    }
    
    }
  }
}


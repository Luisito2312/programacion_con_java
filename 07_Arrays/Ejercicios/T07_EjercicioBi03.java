/*
 Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.

Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Luis Godino
 */
public class T07_EjercicioBi03 {
  public static void main(String[] args) {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    //Rellenar el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*900 + 100);
      }
    }

    //Mostramos el array
    int sumaFila;
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d" , tabla[fila][columna]);
        sumaFila = sumaFila + tabla[fila][columna];
      }
      System.out.printf("|%8d\n" , sumaFila); //Muestro la suma de la fila y salto de linea
      
    }

    //Muestra las sumas parciales de las columnas
    for (columna = 0; columna < 50; columna++) {
      System.out.print("-");
    }
    System.out.println();

    int sumaColumna;
    int sumaTotal = 0;

    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < tabla.length; fila++) {
        sumaColumna = sumaColumna + tabla[fila][columna];
      }
      System.out.printf("%8d" , sumaColumna); //Muestro la suma de la fila y salto de linea
      sumaTotal += sumaColumna;
    }

    System.out.printf("|%8d",sumaTotal);

  }
}

public class T07_EjercicioBi04 {
  public static void main(String[] args) throws InterruptedException {
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
        Thread.sleep(200);
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
        Thread.sleep(70);
      }
      System.out.printf("%8d" , sumaColumna); //Muestro la suma de la fila y salto de linea
      sumaTotal += sumaColumna;
    }

    System.out.printf("|%8d",sumaTotal);
  }
}

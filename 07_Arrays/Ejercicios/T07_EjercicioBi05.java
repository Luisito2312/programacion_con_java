/*
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
 * 
 * @author Luis Godino
 */
public class T07_EjercicioBi05 {
  public static void main(String[] args) {
    int[][] tabla = new int[6][10];
    int fila;
    int columna;
    int numMax = Integer.MIN_VALUE;
    int numMin = Integer.MAX_VALUE;
    int posicionFilaMax = 0;
    int posicionColumnaMax = 0;
    int posicionFilaMin = 0;
    int posicionColumnaMin = 0;

    //Rellenar el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*1001);
        if (tabla[fila][columna] > numMax) {
          numMax = tabla[fila][columna];
          posicionFilaMax = fila +1;
          posicionColumnaMax = columna +1;
        }
  
        if (tabla[fila][columna] < numMin) {
          numMin = tabla[fila][columna];
          posicionFilaMin = fila +1;
          posicionColumnaMin = columna +1;
        }
      }
    }


    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d" , tabla[fila][columna]);
      }
      System.out.println();
    }

    System.out.println("El número mayor se encuentra en las coordenadas: "+posicionFilaMax +" "+posicionColumnaMax);
    System.out.println("El número menor se encuentra en las coordenadas: "+posicionFilaMin +" "+posicionColumnaMin);
  }
}

public class Ejercicio2 {

  // Función para generar una tabla con números aleatorios
  public static int[][] generarTablaAleatoria(int filas, int columnas, int maxAleatorio) {
  
    int[][] tablaAutomatica = new int[filas][columnas];

    for (int i = 0; i < tablaAutomatica.length ; i++) {
      for (int j = 0; j < tablaAutomatica[filas -1].length; j++) {
        tablaAutomatica[i][j] = (int)(Math.random()*maxAleatorio);
      }
    }

    return tablaAutomatica;
    
  }

  

  // Función para generar una tabla introduciendp números manualmente
  public static int[][] generarTablaManual(int filas, int columnas) {

    int[][] tablaManual = new int[filas][columnas];

    for (int i = 0; i < tablaManual.length; i++) {
      for (int j = 0; j < tablaManual[filas - 1].length; j++) {
        System.out.println("Introduce el valor que quieres introducir en la columna "+ j + " de la fila "+ i);
        tablaManual[i][j] = Integer.parseInt(System.console().readLine());
      }
    }

    return tablaManual;
  }

  // Función para mostrar la tabla
  public static void mostrarTabla(int[][] tabla) {
    if (tabla == null) {
      System.out.println("Primero debe generar la tabla.");
      return;
    } else {

      for (int i = 0; i < tabla.length; i++) {
        for (int j = 0; j < tabla.length; j++) {
          System.out.println(tabla[i][j]);
        }
      }
    }
  }

  // Función para intercambiar dos filas en la tabla
  public static void intercambiarFilas(int[][] tabla, int fila1, int fila2) {
    
    int aux;
      for (int j = 0; j < tabla.length; j++) {
        aux = tabla[fila1][j];
        tabla[fila1][j] = tabla[fila2][j];
        tabla[fila2][j] = aux;
    }
  }

  // Función para intercambiar dos columnas en la tabla
  public static void intercambiarColumnas(int[][] tabla, int col1, int col2) {
    int aux;
      for (int i = 0; i < tabla.length; i++) {
        aux = tabla[i][col1];
        tabla[i][col1] = tabla[i][col2];
        tabla[i][col2] = aux;
    }
  }

  // Función para sumar los elementos de una fila
  public static int sumarFila(int[][] tabla, int fila) {
    int resultado = 0;
    for (int i = 0; i < tabla.length; i++) {
      resultado += tabla[fila][i];
    }
    return resultado;
  }

  // Función para sumar los elementos de una columna
  public static int sumarColumna(int[][] tabla, int col) {
    int resultado = 0;
    for (int i = 0; i < tabla.length; i++) {
      resultado += tabla[i][col];
    }
    return resultado;
  }


  public static void main(String[] args) {
    int[][] tabla = null;
    boolean continuar = true;
    int filas;
    int columnas;
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma;
    int colSuma;

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:

        int maxAleatorio;
        System.out.println("Introduce el número de filas que quieres que tenga tu tabla");
        filas = Integer.parseInt(System.console().readLine());
        
        System.out.println("Introduce el número de columnas que quieres que tenga la tabla");
        columnas = Integer.parseInt(System.console().readLine());
    
        System.out.println("Introduce el número máximo aleatorio que puede tener la tabla");
        maxAleatorio = Integer.parseInt(System.console().readLine());
          tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
          break;

        case 2:
        System.out.println("Introduce el número de filas que quieres que tenga tu tabla");
        filas = Integer.parseInt(System.console().readLine());
        
        System.out.println("Introduce el número de columnas que quieres que tenga la tabla");
        columnas = Integer.parseInt(System.console().readLine());
          tabla = generarTablaManual(filas, columnas);
          break;
        case 3:
        
          mostrarTabla(tabla);
          break;
        case 4:
          System.out.println("Introduce la fila que quieres intercambiar");
          fila1 = Integer.parseInt(System.console().readLine());

          System.out.println("Introduce la fila por la que la quieres cambiar");
          fila2 = Integer.parseInt(System.console().readLine());

          intercambiarFilas(tabla, fila1, fila2);
          break;
        case 5:
        System.out.println("Introduce la columna que quieres intercambiar");
        col1 = Integer.parseInt(System.console().readLine());

        System.out.println("Introduce la columna por la que la quieres cambiar");
        col2 = Integer.parseInt(System.console().readLine());
          intercambiarColumnas(tabla, col1, col2);
          break;
        case 6:
          System.out.println("Introduce el número de fila que quieres sumar");
          filaSuma = Integer.parseInt(System.console().readLine());


          int sumaFila = sumarFila(tabla, filaSuma);
          System.out.println("La suma de la fila es: "+sumaFila);
          break;
        case 7:
          System.out.println("Introduce el número de la columna que quieres sumar");
          colSuma = Integer.parseInt(System.console().readLine());

          int sumaCol = sumarColumna(tabla, colSuma);
          System.out.println("La suma de la fila es: "+sumaCol);
          break;
        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}


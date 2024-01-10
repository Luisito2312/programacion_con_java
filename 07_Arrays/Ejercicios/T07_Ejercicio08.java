public class T07_Ejercicio08 {
  public static void main(String[] args) {
    String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    int[] temperatura = new int[12];
    

    //Escritura del array
    for (int i = 0; i < temperatura.length; i++) {
      System.out.println("Introduzca la temperatura media del mes "+mes[i]+": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }

    //Mostramos por pantalla en forma de histograma
    for (int i = 0; i < mes.length; i++) {
      System.out.printf("%12s |", mes[i]);

      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print("@");
      }
      System.out.println();
    }

  }
}

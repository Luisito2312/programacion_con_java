package Tarea_Evaluable;

public class quiniela {
  public static void main(String[] args) {

    int contador = 0;
    int[] aciertos = new int[3];
    int[] numAletorios = new int[42];
    int[] victorias = new int[14];
    for (int i = 0; i < numAletorios.length; i++) {
      numAletorios[i] = (int)(Math.random()*3+1);
    }

    for (int i = 0; i < victorias.length; i++) {
      victorias[i] = (int)(Math.random()*3+1);
    }

    for (int i = 1; i < 15; i++) {
      int numapuesta = 0;
      System.out.printf("%2s. ",i);
      for (int j = 1; j <= 3; j++) {
        switch (numAletorios[contador]) {
          case 1:
            System.out.print("|"+numAletorios[contador]+"  |");
            break;
          case 2:
            System.out.print("|  "+numAletorios[contador]+"|");
            break;
          case 3:
            System.out.print("| X |");
            break;
          default:
            break;
        }
        numapuesta++;
        if (victorias[numapuesta] == numAletorios[contador]) {
          aciertos[numapuesta] += 1;
        }
        contador++;
      }
      System.out.println();
    }

    System.out.println("En la primera apuesta has conseguido: "+aciertos[0]+" aciertos");
  }
}

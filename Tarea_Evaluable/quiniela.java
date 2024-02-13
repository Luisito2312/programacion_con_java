package Tarea_Evaluable;

public class quiniela {
  public static void main(String[] args) {

    int contador = 0;
    int[] aciertos = new int[4];
    int[] numAletorios = new int[42];
    int[] victorias = new int[14];
    int[] partidoUltimo = new int[2];
    int[] partidoUltimoacierto = new int[2];
    for (int i = 0; i < numAletorios.length; i++) {
      numAletorios[i] = (int)(Math.random()*3+1);
    }

    for (int i = 0; i < victorias.length; i++) {
      victorias[i] = (int)(Math.random()*3+1);
    }

    for (int i = 0; i < partidoUltimo.length; i++) {
      partidoUltimo[i] = (int)(Math.random()*3+1);
    }

    for (int i = 0; i < partidoUltimoacierto.length; i++) {
      partidoUltimoacierto[i] = (int)(Math.random()*3+1);
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
        if (victorias[numapuesta] == numAletorios[contador]) {
          aciertos[numapuesta] += 1;
        }
        contador++;
        numapuesta++;
        
      }
      System.out.println();
    }
    System.out.printf("%2s. | Local",15);
      switch (partidoUltimoacierto[0]) {
        case 1:
          System.out.print(" "+partidoUltimoacierto[0]+" Visitante");
          break;
        case 2:
          System.out.print(" "+partidoUltimoacierto[0]+" Visitante");
          break;
        case 3:
          System.out.println(" M Visitante");
          break;
      
        default:
          break;
      }
      switch (partidoUltimoacierto[1]) {
        case 1:
          System.out.print(" "+partidoUltimoacierto[1]);
          break;
        case 2:
          System.out.print(" "+partidoUltimoacierto[1]);
          break;
        case 3:
          System.out.println(" M");
          break;
      
        default:
          break;
      }

    
    System.out.println();
    System.out.println("En la primera apuesta has conseguido: "+aciertos[0]+" aciertos");
    if (aciertos[0] >= 10) {
      System.out.println("¡Ha ganado un premio!");
    }
    System.out.println("En la segunda apuesta has conseguido: "+aciertos[1]+" aciertos");
    if (aciertos[1] >= 10) {
      System.out.println("¡Ha ganado un premio!");
    }
    System.out.println("En la tercera apuesta has conseguido: "+aciertos[2]+" aciertos");
    if (aciertos[2] >= 10) {
      System.out.println("¡Ha ganado un premio!");
    }

    contador = 0;
    for (int i = 1; i < 15; i++) {
      System.out.printf("%2s. ",i);
      for (int j = 1; j <= 3; j++) {
        switch (victorias[contador]) {
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
      }
      contador++;
      System.out.println();
    }

  }
}

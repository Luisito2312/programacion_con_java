public class Ejercicio1 {
  public static void main(String[] args) {
    int intervaloInicial = 0;
    int intervaloFinal = 0;
    int espaciosArray;
    int numeroAdivinar = 0;
    int intervaloInicialIa;
    int intervaloFinalIa;
    int intentoadivinar;
    int copiaIntervaloInicial = intervaloInicial;

  System.out.println("Introduce el inicio del intervalo");
  intervaloInicial = Integer.parseInt(System.console().readLine());

  System.out.println("Introduce el final del intervalo");
  intervaloFinal = Integer.parseInt(System.console().readLine());

  espaciosArray = intervaloFinal - intervaloInicial;

  int[] intervaloNumeros = new int[espaciosArray + 1];

  for (int i = 0; i < intervaloNumeros.length; i++) {
    intervaloNumeros[i] += copiaIntervaloInicial;
    copiaIntervaloInicial++;
  }

  do {
    intervaloInicialIa = (int)(Math.random()*intervaloFinal) + intervaloInicial;
    intervaloFinalIa = (int)(Math.random()*intervaloFinal) + intervaloInicial;
  } while ((intervaloInicialIa >=  intervaloFinalIa) && ((intervaloInicialIa < intervaloInicial) && (intervaloFinalIa > intervaloFinal )));

  int intentos = (int)(Math.log(intervaloFinalIa-intervaloInicialIa+1) / Math.log(2));

  do {
    numeroAdivinar = (int)((Math.random()* intervaloFinalIa) + intervaloInicialIa);
  } while ((numeroAdivinar < intervaloInicialIa) || (numeroAdivinar > intervaloFinalIa));
 

  System.out.println("Dentro del rango que has introducido he decidido coger el número entre los valores: "+intervaloInicialIa+ " y "+intervaloFinalIa);
  
  System.out.println("Intenta adivinar el número, tienes "+ intentos + " intentos");

 
    do {
      intentoadivinar = Integer.parseInt(System.console().readLine());
  
      if (intentoadivinar > numeroAdivinar) {
        System.out.println("Te has pasado");
      } else if (intentoadivinar < numeroAdivinar) {
        System.out.println("Te has quedado corto");
      }
      intentos--;
      System.out.println("Te quedan "+ intentos+ " intentos");
    } while ((intentoadivinar != numeroAdivinar) && (intentos > 0));
    
    if (intentoadivinar == numeroAdivinar) {
      System.out.println("Enhorabuena!!!! has acertado");
      System.out.println("Efectivamente el núemro era: "+ numeroAdivinar);
    } else if (intentos == 0) {
      System.out.println("Has superado el núemro de intentos");
      System.out.println("El número que estaba pensando era el: "+ numeroAdivinar);
    }
  }
}

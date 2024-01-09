public class array02 {
  public static void main(String[] args) {
    int[] n = {26, -30, 0, 50, 100};
    
    System.out.println("Los valores del array son los siguientes: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] +", " + n[3]);

    int suma = n[1] + n[3];
    System.out.println("La suma de el segundo elemento y el cuarto del array es: "+suma);

    System.out.println("El array contiene "+ n.length +" elementos, cual deseas ver? (0-4)");
    int indice = Integer.parseInt(System.console().readLine());

    System.out.print("El elemento que se encuentra en la posicion "+ indice+ " es el " + n[indice]);
  }
}

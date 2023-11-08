import java.util.Scanner;

public class Examen4 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("\033[1;30mCALCULADORA DE TIEMPO \033[0m");
    System.out.println("=====================");
    System.out.println("Introduce una cantidad de días: ");
    int dias = sc.nextInt();

   int año = dias / 365 ; 
   int mes = dias / 30 ;
   int dia = dias - (año * 365) - (mes * 30);

    System.out.println(dias + " días son " + año+" años, "+mes+" meses y " +dia+" dias");

    sc.close();
  }
}

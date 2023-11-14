import java.util.Scanner;

public class T04_Ejercicio23 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el precio del artículo que va a comprar");
    Double precio = sc.nextDouble();
    
    System.out.println("Introduce el tipo de IVA que quiere aplicar general, reducido, superreducido");
    String tipoiva = sc.nextLine();
    sc.nextLine();
   
    System.out.println("Tiene algún código promocional nopro, mitad, meno5, 5porc");
    String tipodesc = sc.nextLine();

    //Calculamos el IVA y el precio antes de usar coddigo promocional
    int porcentajeiva = 0;
    switch (tipoiva) {
      case "general":
        porcentajeiva = 21;
        break;
      
      case "reducido":
        porcentajeiva = 10;
        break;
       
      case "superreducido":
        porcentajeiva = 4;
      default:
        break;
    }
    
    Double tipodescuento = 0.0;

    switch (tipodesc) {
      case "nopro":
        tipodescuento = 0.0;
        break;

      case "mitad":
        tipodescuento = precio / 2;
        break;

      case "meno5":
        tipodescuento = 5.0;
        break;

      case "5porc":
        tipodescuento = precio * 0.05;
        break;  
      default:
        System.out.println("Has introducido un codigo promocional erróneo");
        break;
    }

    Double iva = precio * (porcentajeiva / 100);

    System.out.printf("Base imponible  %8d\n" , precio);
    System.out.printf("IVA "+porcentajeiva+"  %8d\n" , iva);
  }
}

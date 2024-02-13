public class PruebaVehiculo {
  public static void main(String[] args) {
    Coche Saab = new Coche("1111AAA", "Saab", "56");
    Bicicleta bh = new Bicicleta("BH");

    int opcion = 0;
    int km =0;

    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta\r\n" + //
                "2. Haz el caballito con la bicicleta\r\n" + //
                "3. Anda con el coche\r\n" + //
                "4. Quema rueda con el coche\r\n" + //
                "5. Ver kilometraje de la bicicleta\r\n" + //
                "6. Ver kilometraje del coche\r\n" + //
                "7. Ver kilometraje total\r\n" + //
                "8. Salir\r\n" + //
                "Elige una opción (1-8):");
      opcion = Integer.parseInt(System.console().readLine());
      switch (opcion) {
        case 1:
          System.out.println("Cuantos kilometros quieres recorrer?");       
          km = Integer.parseInt(System.console().readLine());
          bh.recorre(km); 
        break;
      
        case 2:
        bh.hacerCaballito();
      break;
             
      case 3:
      System.out.println("Cuantos kilometros quieres recorrer?");       
      km = Integer.parseInt(System.console().readLine());
      Saab.recorre(km); 
    break;

    case 4:
          Saab.quemaRueda(); 
        break;

    case 5:
        System.out.println("Kilometros recorridos por la bicicleta: "+ bh.getKilometrosRecorridos());       
        
        break;
    case 6:
    System.out.println("Kilometros recorridos por la bicicleta: "+ Saab.getKilometrosRecorridos());
      break;

    case 7:
      System.out.println("Los vehiculos llevan recorridos un total de: "+ Vehiculo.getKilometrosTotales());
        break;
      
        default:
        break;
                }
    }
  }
}

public class PruebaCoche {
  public static void main(String[] args) {
    Coche cocheLuis = new Coche("1111AAA", "Saab", "56");
    Coche cochePaco = new Coche("1111BBB", "Suzuki", "32");
    cocheLuis.recorre(32);
    cocheLuis.recorre(56);
    cochePaco.recorre(65);
    cochePaco.recorre(44);

    // System.out.println("El coche de luis ha recorrido " + cocheLuis.getKilometraje()+" Km");
    // System.out.println("El coche de juan ha recorrido " +cochePaco.getKilometraje()+" Km");
    // System.out.println("El kilometraje total es: "+Coche.getKilometrajeTotal()+" Km");
  }
}

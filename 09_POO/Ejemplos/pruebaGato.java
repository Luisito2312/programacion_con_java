public class pruebaGato {
  public static void main(String[] args) {
    // Gato garfield = new Gato();
    // garfield.sexo = "macho";


    // garfield.come("yogur");
    // garfield.maulla();
    // garfield.ronronea();

    System.out.print("Cuantos gatos quieres crear: ");
    int numGatos = Integer.parseInt(System.console().readLine());

    Gato[] gaticos = new Gato[numGatos];

    String[] nombres = {"Garfield", "Botas","Willy", "Pancho", "Misifu"};
    String[] colores = {"Marron", "Negro", "Pardo"};
    

    
    for (int i = 0; i < numGatos; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.print("Que raza deseas: ");
      String raza = System.console().readLine();
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "Macho",0 , 0);
    }

    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].raza);
    }
    
  }
}

package clases;

public class Clinica {
  ///Atributos
  final int n = 100;
  private Mascota[] listado;


  //Constructor
  public Clinica(){
    listado = new Mascota[n];
  }

  //Métodos
  public boolean esVacia() { //La funcion recorre el array y si encuentra un hueco que tenga una mascota, devuelve falso
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] != null) {
        return false;
      }
    }
    return true;
  }

  public boolean esLlena() { //La funcion recorre el array y si encuentra un hueco que tiene mascota devuelve true
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] == null) {
        return false;
      }
    }
    return true;
  }

  public int totalPerros() {
    return Perro.getTotalPerros();
  }

  public int totalGatos() {
    return Gato.getTotalGatos();
  }

  public int totalMascotas() {
    return Mascota.getTotalMascotas();
  }

  public Mascota buscarChip(String chip) { //Recorre el array y si coincide devuelve la mascota, si no devuelve null
    for (int i = 0; i < listado.length; i++) {
      if ((listado[i] != null) && (listado[i].getChip().equals(chip))) {
        return listado[i];
      }
    }
    return null;
  }

  public void agregar(Mascota mascota) {
    int primeraLibre = -1;
    do {
      primeraLibre++;
    } while (listado[primeraLibre] != null);

    listado[primeraLibre] = mascota;
  }

  public void listar() {
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] != null) {
        System.out.println(listado[i].toString());
      }
    }
  }
}


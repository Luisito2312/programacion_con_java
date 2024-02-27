package clases;

import java.util.ArrayList;

public class Clinica {
  ArrayList<Mascota> a = new ArrayList<Mascota>();

  public boolean esVacia(){
    boolean vacia;
    int aux = 0;
    for (Mascota mascota : a) {
      if ( mascota == null ) {
        aux++;
      }
    }

    if (aux == 100) {
      vacia = true;
    } else {
      vacia = false;
    }
    return vacia;
  }

  public boolean esLlena(){
    boolean llena;
    int aux = 0;
    for (Mascota mascota : a) {
      if (mascota == null) {
        aux++;
      }
    }
    if (aux == 100) {
      llena = false;
    } else {
      llena = false;
    }
    return llena;
  }

  public void agregar(Mascota mascota){
    for (Mascota animal : a) {
      if (animal == null) {
        a.add(mascota);
      }
    }
    Mascota.totalMascotas++;
  }

  public Mascota buscarChip(String chip){
    Mascota b = new Mascota();
    for (Mascota mascota : a) {
      if (mascota.getChip() == chip) {
        b = mascota;
      } else {
        b = null;
      }
    }
    return b;
  }

  public String listar(){
    for (Mascota mascota : a) {
      return mascota.toString();
    }
  }

  public int totalPerros(){

  }
  }


public class Cubo {
  /////Atributos
  int capacidad; //Capacidad máxima en litros
  int contenido; //Capacidad actual en litros



  ////Constructor
  Cubo (int cap){
    this.capacidad = cap;
  }

  /////Getters
  int getCapacidad(){
    return this.capacidad;
  }

  int getContenido(){
    return this.contenido;
  }


  /////Setters
  void setContenido(int litros){
    this.contenido = litros;
  }


  /////Otros métodos
  void vacia(){
    this.contenido = 0;
    System.out.println("Sa vaciao");
  }

  void llena(){
    this.contenido = this.capacidad;
    System.out.println("Sa llenao");
  }

  void pinta() {
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
    if (this.contenido >= nivel) {
    System.out.println("#~~~~#");
    } else {
    System.out.println("#    #");
    }
    }
    System.out.println("######");
    }
}

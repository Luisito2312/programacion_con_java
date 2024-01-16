/*
 Va a ser la clases que contendra el metodo principal (main)
 * 
 * @author Luis Godino
 */
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibro = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Perry mayweather";
    lib.numPaginas = 354;
    lib.edicion = 1;
    System.out.println("Titulo: " + lib.titulo);
    System.out.println("Autor: " + lib.autor);
    System.out.println("Número de páginas: " + lib.numPaginas);
    System.out.println("Edicion: " + lib.edicion);
    

  }
}

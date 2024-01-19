public class PruebaCubo {
  public static void main(String[] args) {
    Cubo cubo = new Cubo(10);
    cubo.setContenido(6);

    Cubo cuboDestino = new Cubo(8);
    cuboDestino.setContenido(1);

    cubo.pinta();
    cuboDestino.pinta();
   
    cubo.vuelcaEn(cuboDestino);

    cubo.pinta();
    cuboDestino.pinta();
  }
}

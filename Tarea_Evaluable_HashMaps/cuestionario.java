import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class cuestionario {
  public static void main(String[] args) {
    ArrayList<String> incorrectas = new ArrayList<>();
    HashMap<String, String> correctas = new HashMap<>();
    String[] posicionPregunta = new String[3];
    int contadorArraylist = 0;
    String respuesta;
    String respuestaAux = " ";
    String respuestaAux1;

    //ArrayList
    incorrectas.add("Paris");
    incorrectas.add("Amsterdam");
    incorrectas.add("Varsovia");
    incorrectas.add("Lisboa");
    incorrectas.add("Praga");
    incorrectas.add("Bucarest");
    incorrectas.add("San Marino");
    incorrectas.add("Estocolmo");
    incorrectas.add("Belgrado");
    incorrectas.add("Ankara");
    incorrectas.add("Andorra la Bella");
    incorrectas.add("Londres");
    incorrectas.add("Berna");
    incorrectas.add("Podgorica");
    incorrectas.add("La valeta");
    incorrectas.add("Chisinau");
    incorrectas.add("Skopje");
    incorrectas.add("Luxemburgo");
    incorrectas.add("Monaco");
    incorrectas.add("Vilna");

    //HashMap
    correctas.put("España", "Madrid");
    correctas.put("Armenia", "Erevan");
    correctas.put("Bulgaria", "Sofia");
    correctas.put("Croacia", "Zagreb");
    correctas.put("Estonia", "Tallin");
    correctas.put("Finlandia", "Helsinki");
    correctas.put("Grecia", "Atenas");
    correctas.put("Italia", "Roma");
    correctas.put("Hungria", "Budapest");
    correctas.put("Noruega", "Oslo");

    for (Map.Entry pareja: correctas.entrySet()) {
      System.out.println("¿Cual es la capital de "+pareja.getKey()+"?");
      posicionPregunta[0] = (String)pareja.getValue();
      posicionPregunta[1] = incorrectas.get(contadorArraylist);
      contadorArraylist++;
      posicionPregunta[2] = incorrectas.get(contadorArraylist);
      contadorArraylist++;

      for (int i = 1; i <= posicionPregunta.length; i++) {
        respuestaAux1 = respuestaAux;
        respuesta = posicionPregunta[(int)(Math.random()*3)];

        while (respuesta == respuestaAux1) {
          respuesta = posicionPregunta[(int)(Math.random()*3)];
        }
       
        respuestaAux = respuesta;

        while (respuesta != respuestaAux) {
          respuesta = posicionPregunta[(int)(Math.random()*3)];
        }
        
        System.out.println(i+". "+respuesta);
      }
    }
  }
}
/*
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso.
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T04_Ejercicio12 {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  int acumulador = 0;

  String respuesta;

  System.out.println("1. ¿El tipo fuego de pokemon, a qué tipo es débil?");
  System.out.println("a.fuego  b.agua   c.planta");
  respuesta = sc.nextLine();

  if (respuesta.equals("b")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }
  
  System.out.println("2. ¿Cuál fue el primer pokemon de Ash?");
  System.out.println("a.Pikachu  b.Lugia   c.Pidgey");
  respuesta = sc.nextLine();

  if (respuesta.equals("a")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }
  
  System.out.println("3. ¿Donde nació Ash?");
  System.out.println("a.Pueblo pirita  b.Kanto   c.Pueblo Paleta");
  respuesta = sc.nextLine();

  if (respuesta.equals("c")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }

  System.out.println("4. ¿Quién es Brock?");
  System.out.println("a.Un flipao  b.Un sibarita    c.Un policía");
  respuesta = sc.nextLine();

  if (respuesta.equals("b")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }

  System.out.println("5. ¿Cómo se llama la enfermera?");
  System.out.println("a.Joy  b.Jey    c.María");
  respuesta = sc.nextLine();

  if (respuesta.equals("a")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }

  System.out.println("6. ¿Cómo se llama el enemigo de Ash?");
  System.out.println("a.Paco   b.Poco    c.Polo");
  respuesta = sc.nextLine();

  if (respuesta.equals("c")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }

  System.out.println("7. ¿De qué tipo es Pikachu?");
  System.out.println("a.Electrico  b.Volador    c.Fuego");
  respuesta = sc.nextLine();

  if (respuesta.equals("a")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }

  System.out.println("8. ¿Quién es el dios de los pokemones?");
  System.out.println("a.Groudon  b.Oh ho    c.Arceus");
  respuesta = sc.nextLine();

  if (respuesta.equals("c")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }

  System.out.println("9. ¿Cuál es el trabajo de Oak?");
  System.out.println("a.Niñero  b.Profesor    c.Enfermero");
  respuesta = sc.nextLine();

  if (respuesta.equals("b")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }

  System.out.println("10. ¿De qué tipo es Reshiram?");
  System.out.println("a.Agua  b.Fuego    c.Eléctrico");
  respuesta = sc.nextLine();

  if (respuesta.equals("b")){
    acumulador++;
    System.out.println("Respuesta correcta, tienes "+acumulador+" puntos");
  } else {
    System.out.println("Respuesta incorrecta");
  }

  if (acumulador == 10){
    System.out.println("Has obtenido la puntuación máxima, enhorabuena!");
  }else{
    System.out.println("Tu puntiación es: " + acumulador +" puntos");
  }
  

  sc.close();
 } 
}

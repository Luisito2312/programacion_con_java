/*
 Hacer un código que sea un test de infidelidad y que según la puntuación te salte un resultado u otro
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T04_Ejercicio16 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String respuesta;
    int acumulador = 0;

    System.out.println("Responde con verdadero o falso");
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("2. Ha aumentado sus gastos de vestuario");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("9. Has notado que últimamente se perfuma más");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }

    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuesta = sc.nextLine();

    if ((respuesta == "verdadero") || (respuesta == "Verdadero")){
      acumulador+=3;

    }


    switch (acumulador) {
      case 0,1,2,3,4,5,6,7,8,9,10:
        System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        break;
      
      case 11,12,13,14,15,16,17,18,19,20,21,22: 
        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        break;
       
      case 23,24,25,26,27,28,29,30:
        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");  
      default:
        break;
    }
    sc.close();
  }
}

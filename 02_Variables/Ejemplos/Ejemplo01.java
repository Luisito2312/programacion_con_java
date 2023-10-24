/*
 Explica tu código aquí
 * 
 * @author Luis Godino
 */
public class Ejemplo01  {
  public static void main(String[] args) {
    
    //Tipo byte
    byte miNumByte = 100;
    System.out.println(miNumByte);

    //TIpo short
    short miNumShort = 5000;
    System.out.println(miNumShort);

    //Tipo long
    long miNumLong = 20000L;
    System.out.println(miNumLong);

    //tipo float
    float niNumFloat = 1.2f;
    System.out.println(niNumFloat);

    //tipo boolean
    boolean esjavaDivertidio = true;
    boolean esElProfeDivertido = false;
    System.out.println("Es Java divertido? "  + esjavaDivertidio );
    System.out.println("Es el profe divertido? " + esElProfeDivertido);


    int numero = 5;

    System.out.println("El valor de la variable es " + numero);

    double x;
    double y;

    x = 7;
    y = 25.75;

    System.out.println("x vale: " + x);
    System.out.println("y vale: " + y); 

    int num1 = 9;
    int num2 = 2;

    //Utilizando el % para el módulo o resto de la división mientras se concatenan varias variables intercaladas
    System.out.println("El resto de dividir " + num1 +" entre "+num2+" es: " + num1 % num2);

    int a = 9;
    int b = 2;

    double division;

    //Lo que hace el double, es castear la variable y lo que hace es básicamente cambiar de tipo de variable
    System.out.println("el casting de la variable a es " + (double) a);
  }
}
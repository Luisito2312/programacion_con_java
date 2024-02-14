public class AppAlumnos {
  public static void main(String[] args) {
    //Creacion del array que va a contener a los objetos alumno
    Alumno[] alumnos = new Alumno[5];
    String nombre;
    double notaMedia;

    //Creacion alumnos
    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno();
      System.out.print("Introduce el nombre del alumno "+i+" : ");
      nombre = System.console().readLine();
      alumnos[i].setNombre(nombre);

      System.out.print("Introduce la nota media del alumno "+i+" : ");
      notaMedia = Double.parseDouble(System.console().readLine());
      alumnos[i].setNotaMedia(notaMedia);
    }

    // //Lectura toString
    // for (Alumno a : alumnos) {
    //  System.out.println( a.toString());
    // }

    //Lectura con getters
    for (Alumno alu : alumnos) {
      System.out.println("Nombre del alumno: "+alu.getNombre());
      System.out.println("Nota media del alumno: "+alu.getNotaMedia());
    }
  }
}

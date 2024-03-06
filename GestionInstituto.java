import clases.Instituto;
import clases.Alumno;
import clases.Persona;
import clases.Profesor;

/**
 * IES Boquerón
 * Examen 06/03/2024
 * 
 * @author Sergio Sánchez
 */

public class GestionInstituto {

    // Constantes del menú
    private static final int SALIR = 0 ;
    private static final int AGREGAR_PERSONA = 1 ;
    private static final int LISTAR_PERSONAS = 2 ;
    private static final int BUSCAR_PERSONA = 3 ;
    private static final int ASIGNARGRUPO_PERSONA = 4 ;
    private static final int MATRICULAR_PERSONA = 5 ;
    private static final int ESTADISTICAS = 6 ;
    
    // Constantes de personas
    private static final int ES_PROFESOR = 0 ;
    private static final int ES_ALUMNO = 1 ;

    private static Instituto instituto ;

    public static void main(String[] args) {

        // Creamos e inicializamos por defecto la opción
        int opcion = SALIR;
        // Inicializamos la agenda
        instituto = new Instituto() ;

        do {

            try {
                // Mostramos el menú de la aplicación
                menu() ;
                // Leemos la opción
                opcion = Integer.parseInt(System.console().readLine()) ;
                // Comprobamos la opción introducida
                switch(opcion) {
                    case SALIR: 
                        break ;
                    case AGREGAR_PERSONA:
                        agregarPersona() ; 
                        break ;
                    case LISTAR_PERSONAS:
                        listarPersonas() ;
                        break ;
                    case BUSCAR_PERSONA:
                        buscarPersonaDni() ;
                        break ;
                    case ASIGNARGRUPO_PERSONA:
                        asignarGrupoPersona() ;
                        break ;
                    case MATRICULAR_PERSONA:
                        matricularPersona() ;
                        break ;
                    case ESTADISTICAS:
                        estadisticas();
                        break ;
                    default:
                        System.out.println("La opción elegida no existe.\n") ;
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un valor numérico.\n");
            }
        } while (opcion != SALIR) ; 
        
        // Fin de la aplicación
        System.out.println("\n¡Hasta pronto!");
    }

    /**
     * Menú de la aplicación
     */
    private static void menu() {

        System.out.println("\nIES BOQUERÓN\n==========================") ;
        System.out.println("0. Salir.") ;
        System.out.println("1. Agregar persona.") ;
        System.out.println("2. Listar persona.") ;
        System.out.println("3. Buscar persona por DNI.") ;
        System.out.println("4. Asignar grupo a persona.") ;
        System.out.println("5. Matricular persona.") ;
        System.out.println("6. Estadística de personas.") ;

        System.out.print("Opción? ");
    }

    /**
     * Añade una personas nueva a la clínica.
     */
    private static void agregarPersona() {

        int tipo ;
        int edad ;

        String dni ;
        String nombre ;
        double sueldo ;
        double notaMedia ;

        Profesor profesor ;
        Alumno alumno ;

        if (instituto.esLlena()) {
            System.out.println("Imposible agregar una nueva persona. No quedan plazas libres.") ;
        } else {
        
            // Preguntamos qué tipo de persona se va a añadir
            System.out.print("¿Qué tipo de persona vas a añadir? (0 - profesor, 1 - alumno): ") ;
            tipo = Integer.parseInt(System.console().readLine()) ;

            if ((tipo != ES_PROFESOR) && (tipo != ES_ALUMNO)) {
                System.out.println("No es un tipo de persona válido.\n") ; 
            } else {

                // solicitamos datos comunes
                System.out.print("Nº de DNI: ") ;
                dni = System.console().readLine() ;

                System.out.print("Nombre: ") ;
                nombre = System.console().readLine() ;

                System.out.print("Edad: ") ;
                edad = Integer.parseInt(System.console().readLine()) ;

                // Solicitamos datos específicos para cada mascota
                switch(tipo) {

                    case ES_PROFESOR: 
                        System.out.print("Sueldo: ") ;
                        sueldo = Double.parseDouble(System.console().readLine()) ;

                        // Creamos la persona
                        profesor = new Profesor(dni, nombre, edad) ;
                        profesor.setSueldo(sueldo) ;

                        // Guardamos la persona
                        instituto.agregar(profesor) ;

                        break ;

                    case ES_ALUMNO:

                        System.out.print("Nota Media: ") ;
                        notaMedia = Double.parseDouble(System.console().readLine()) ;

                        // Creamos la persona
                        alumno = new Alumno(dni, nombre, edad) ;
                        alumno.setNotaMedia(notaMedia) ;

                        // Guardamos la persona
                        instituto.agregar(alumno) ;

                        break ;
                }
            }
        }
    }

    /**
     * Solicita el número de dni, busca y devuelve la persona.
     * @return
     */
    private static Persona buscar() {

        String dni ;

        System.out.print("Nº de DNI a buscar: ") ;
        dni = System.console().readLine() ;

        return instituto.buscarDni(dni) ;
    }

    /**
     * Busca la persona por número de dni.
     */
    private static void buscarPersonaDni() {

        Persona persona ;

        // Solicitamos dni y buscamos persona
        persona = buscar() ;

        // Mostramos información sobre la mascota
        if (persona == null) {
            System.out.println("La persona no pertenece al instituto.");
        } else {
            
            System.out.printf("Nº de DNI: %s\n", persona.getDni());
            System.out.printf("Nombre: %s\n", persona.getNombre());
            System.out.printf("Edad: %d\n", persona.getEdad());
            
            if(persona instanceof Alumno) {
                System.out.printf("Nota Media: %.2f\n", ((Alumno) persona).getNotaMedia()) ;    
            } else {
                System.out.printf("Sueldo: %.2f\n", ((Profesor) persona).getSueldo()) ;
            }
        }
    }

    /**
     * Busca la persona por número de dni y, si se encuentra en el listado 
     * del instituto, se asigna a grupo. Cuando una persona se asigna a grupo, pasa lista o levanta mano.
     */
    private static void asignarGrupoPersona() {

        Persona persona ;
        String grupo ;

        // Solicitamos dni y buscamos persona
        persona = buscar() ;

        // Mostramos información sobre la persona
        if (persona == null) {
            System.out.println("La persona no pertenece al instituto.");
        } else {
            System.out.print("Grupo a asignar: ") ;
            grupo = System.console().readLine() ;
            persona.asignarGrupo(grupo) ;
        }
    }

    /**
     * Busca la persona por número de dni y, si se encuentra en el 
     * listado del instituto, se matricula. Cuando una persona se matricula, 
     * se presenta o se alegrará.
     */
    private static void matricularPersona() {

        Persona persona ;

        // Solicitamos dni y buscamos persona
        persona = buscar() ;

        // Matriculamos a la persona
        if (persona == null) {
            System.out.println("La persona no pertenece al instituto.");
        } else {
            persona.matricular() ;
        }
    }

    /**
     * Muestra un listado de personas.
     */
    private static void listarPersonas() {
        if (instituto.esVacia()) { 
            System.out.println("Aún no se ha registrado ninguna persona en el instituto.") ; 
        } else { 
            instituto.listar() ;
        }
    }

     /**
     * Muestra las estadísticas de las mascotas.
     */
    private static void estadisticas() {
        System.out.printf("\n=======================\n");
        System.out.printf("Estadística de personas\n");
        System.out.printf("\n=======================\n");
        System.out.printf("Total de profesores: %6d\n", instituto.totalProfesors());
        System.out.printf("Total de alumnos : %6d\n", instituto.totalAlumnos());
        System.out.printf("Total personas : %6d\n", instituto.totalPersonas());
        System.out.printf("=======================\n\n");
    }
    
}

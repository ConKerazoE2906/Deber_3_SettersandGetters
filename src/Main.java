import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Estudiantes> estudiantes = new ArrayList<>();
        System.out.println("\nBienvenidos al sistema de calificaciones");

        for (int i = 0; i < 10; i++) {
            System.out.println("\n\t\t\t\tESTUDIANTE "+(i+1));
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del estudiante: ");
            String apellido = entrada.nextLine();

            System.out.print("Ingrese la carrera del estudiante: ");
            String carrera = entrada.nextLine();

            System.out.print("Ingrese las calificaciones del estudiante: ");
            double calificaciones = entrada.nextDouble();

            entrada.nextLine();

            Estudiantes estudiante = new Estudiantes(nombre, apellido, carrera, calificaciones);
            estudiantes.add(estudiante);
        }

        System.out.println("\n\tDatos de los estudiantes");
        for (Estudiantes estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Carrera: " + estudiante.getCarrera());
            System.out.println("Calificaciones: " + estudiante.getCalificaciones());
            System.out.println();
        }


        System.out.println("Ingrese el número del estudiante que desea modificar la calificacion: ");
        int numero_estudiante = entrada.nextInt();

        System.out.println("Ingrese las nuevas calificaciones del estudiante " + numero_estudiante + ": ");
        double nuevas_calificaciones = entrada.nextDouble();

        estudiantes.get(numero_estudiante-1).setCalificaciones(nuevas_calificaciones);

        System.out.println("\nDatos de los estudiantes actualizados:");
        for (Estudiantes estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Carrera: " + estudiante.getCarrera());
            System.out.println("Calificaciones: " + estudiante.getCalificaciones());
            System.out.println();
        }


    }
}
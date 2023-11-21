import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\tBienvenidos al sistema de calificaciones");
        ArrayList<Estudiantes> estudiantes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i+1) + ": ");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese el apellido del estudiante " + (i+1) + ": ");
            String apellido = entrada.nextLine();

            System.out.println("Ingrese la carrera del estudiante " + (i+1) + ": ");
            String carrera = entrada.nextLine();

            System.out.println("Ingrese el código único del estudiante " + (i+1) + ": ");
            int codigo_unico = entrada.nextInt();

            System.out.println("Ingrese las calificaciones del estudiante " + (i+1) + ": ");
            double calificaciones = entrada.nextDouble();

            entrada.nextLine();

            Estudiantes estudiante = new Estudiantes(nombre, apellido, carrera, codigo_unico, calificaciones);
            estudiantes.add(estudiante);
        }

        System.out.println("\nDatos de los estudiantes:");
        for (Estudiantes estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Carrera: " + estudiante.getCarrera());
            System.out.println("Código único: " + estudiante.getCodigo_unico());
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
            System.out.println("Código único: " + estudiante.getCodigo_unico());
            System.out.println("Calificaciones: " + estudiante.getCalificaciones());
            System.out.println();
        }
    }
}
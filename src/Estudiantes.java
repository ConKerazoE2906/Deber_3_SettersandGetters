public class Estudiantes {
        String nombre;
        String apellido;
        String carrera;
        double calificaciones;

    public Estudiantes(String nombre, String apellido, String carrera, double calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }
}

public class Estudiantes {

        String nombre;
        String apellido;
        String carrera;
        int codigo_unico;
        double calificaciones;

    public Estudiantes(String nombre, String apellido, String carrera, int codigo_unico, double calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.codigo_unico = codigo_unico;
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

    public int getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(int codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }
}

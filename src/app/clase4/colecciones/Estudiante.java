package app.clase4.colecciones;

public class Estudiante implements Comparable<Estudiante> {

    private String nombres;
    private String apellidos;
    private String direccion;
    private int codMatricula;

    public Estudiante(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    @Override
    public int compareTo(Estudiante o) {
        String apellidoExterno = o.getApellidos().toLowerCase();
        String apellidosLocal = this.getApellidos().toLowerCase();
        return apellidosLocal.compareTo(apellidos);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public void printEstudiante() {
        System.out.println(this.apellidos + " " + this.nombres);
    }

}


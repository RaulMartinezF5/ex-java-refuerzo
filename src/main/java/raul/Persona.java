package raul;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int año;

public Persona(String nombre, String apellido, String dni, int año);

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
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    } 
}

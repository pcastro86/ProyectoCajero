package modelos;

public class Usuario {
    private String nombre;
    private String alias;
    private String apellido;

    public Usuario(String nombre, String alias, String apellido) {
        this.nombre = nombre;
        this.alias = alias;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

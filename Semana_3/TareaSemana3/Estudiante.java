
public class Estudiante {
    // Atributos 
    private int id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String[] telefonos;
    
    // Constructor

    public Estudiante(int id, String nombre, String apellidos, String direccion, String[] telefonos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Direccion: " + direccion);
        for (int i = 0; i < 3; i++) {
            System.out.println("Telefono " + (i + 1) + ": " + telefonos[i]);
        }
    }
}

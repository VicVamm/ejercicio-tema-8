public class Main {
    public static void main(String[] args) {
        persona usuario = new persona();

        //usuario1
        usuario.setEdad(28);
        usuario.setNombre("victor");
        usuario.setTelefono(+584140442345L);
        System.out.println("edad: " + usuario.getEdad() + " con nombre: " + usuario.getNombre() + " y número de teléfono: " + usuario.getTelefono());


    }
}
class persona {
    //propiedades
    //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public long getTelefono() {
        return telefono;
    }

}
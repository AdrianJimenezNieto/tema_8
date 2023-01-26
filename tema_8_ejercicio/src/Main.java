
public class Main {
    public static class Persona {

        // Atributos de clase
        private int edad;
        private int telefono;
        private String nombre;
        public String getNombre(){
            return nombre;
        }
        public int getEdad(){
            return edad;
        }
        public int getTelefono(){
            return telefono;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
    }

    public static void main(String args[]){

        Persona persona1 = new Persona();
        // Meto los datos en los paramemtros
        persona1.setEdad(43);
        persona1.setTelefono(624879123);
        persona1.setNombre("Felipe");

        // Utilizo los getter para mostrarlos por pantalla
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Telefono: " + persona1.getTelefono());
        System.out.println("Nombre: " + persona1.getNombre());
    }
}
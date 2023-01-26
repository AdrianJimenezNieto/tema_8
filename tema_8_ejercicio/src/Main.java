
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

}
public class Main {
    public static void main(String[] args) {
        // Creamos los objetos usando nuestro molde
        Mascota perfil1 = new Mascota("Fino", "Gato", "Control de vacunas y alimentación");
        Mascota perfil2 = new Mascota("Perrito", "Perro", "Caniche mediano color apricot. Revisión de pelaje");

        // Imprimimos por consola para verificar
        System.out.println("--- Mi Diario de Mascotas ---");
        System.out.println(perfil1.toString());
        System.out.println(perfil2.toString());
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
        javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch (Exception e) {
        e.printStackTrace();
    }

        Scanner scanner = new Scanner(System.in);
        GestorMascotas miGestor = new GestorMascotas();

        boolean bucleActivo = true;


        VentanaPrincipal ventana = new VentanaPrincipal(miGestor);
        ventana.setVisible(true);

        while (bucleActivo == true) {

            System.out.println("--- MENÚ ---");
            System.out.println("¿Qué deseas hacer hoy?");
            System.out.println("1. Registrar nueva mascota");
            System.out.println("2. Listar mascotas registradas");
            System.out.println("3. Buscar Mascota");
            System.out.println("4. Salir");

            int respuestaUsuarioInicial = scanner.nextInt();
            scanner.nextLine();

            switch (respuestaUsuarioInicial) {
                case 1:
                    System.out.println("--- REGISTRO DE MASCOTA ---");

                    System.out.print("Introduce el ID: ");
                    int id = Integer.parseInt(scanner.nextLine()); 

                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Introduce la especie: ");
                    String especie = scanner.nextLine();

                    System.out.print("Introduce las notas médicas: ");
                    String medicas = scanner.nextLine();

                    Mascota nuevaMascota = new Mascota(id, nombre, especie, medicas);
                    miGestor.registrarMascota(nuevaMascota);
                             
                    break;

                case 2:
                    System.out.println("\n--- Mi Diario de Mascotas ---");
                    miGestor.listarMascotas();
                    
                    break;

                case 3:

                    System.out.print("Escribe el nombre de la mascota que deseas encontrar:");
                    String nombreBuscado = scanner.nextLine();
                    miGestor.buscarMascota(nombreBuscado);

                    break;
                    

                case 4:
                    bucleActivo = false;
                    break;
            }
        }

        scanner.close(); 
    }
}
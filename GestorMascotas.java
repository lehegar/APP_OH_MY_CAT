import java.util.ArrayList;

public class GestorMascotas {

    private ArrayList<Mascota> listaMascotas = new ArrayList<>();

    
    public void registrarMascota(Mascota m) {
        listaMascotas.add(m);
    }

    public void listarMascotas() {
        for (Mascota m : listaMascotas) {
            System.out.println(m.toString()); 
        }
    }

    public void buscarMascota(String nombreBuscado) {
    for (Mascota m : listaMascotas) {

        if (m.getNombre().equalsIgnoreCase(nombreBuscado)) {

            System.out.println("ID: " + m.getId()
                    + " | " + m.getNombre()
                    + " | Especie: " + m.getEspecie()
                    + " | Detalles: " + m.getNotasMedicas());

            return;
        }
    }

    System.out.println("Nombre no encontrado");
}
}

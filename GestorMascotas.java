import java.util.ArrayList;

public class GestorMascotas {

    private ArrayList<Mascota> listaMascotas = new ArrayList<>();

    
    public void registrarMascota(Mascota m) {
        listaMascotas.add(m);
    }

    public String listarMascotas() {
    
    if (listaMascotas.isEmpty()) {
        return "No hay mascotas registradas todavía.";
    }

    String resultado = "--- LISTA DE MASCOTAS ---\n";
    for (Mascota m : listaMascotas) {
        resultado += m.toString() + "\n";
    }
    
    return resultado; 
    }


    public String buscarMascota(String nombreBuscado) {
    for (Mascota m : listaMascotas) {
        if (m.getNombre().equalsIgnoreCase(nombreBuscado)) {
            
            return "¡Encontrada!\n" + m.toString();
        }
    }
    
    return "Mascota no encontrada.";
    }



    public boolean eliminarMascota(int idBuscado) {
    return listaMascotas.removeIf(m -> m.getId() == idBuscado);
}}

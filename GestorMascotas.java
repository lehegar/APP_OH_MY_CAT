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


    public String buscarMascota(String nombreBuscado) {
    for (Mascota m : listaMascotas) {
        if (m.getNombre().equalsIgnoreCase(nombreBuscado)) {
            
            return "¡Encontrada!\n" + m.toString();
        }
    }
    
    return "Mascota no encontrada.";
}

    

}

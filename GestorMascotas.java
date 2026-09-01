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
}
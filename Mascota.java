public class Mascota {
    
    private int id;
    private String nombre;
    private String especie;
    private String notasMedicas;

    // Constructor completo
    public Mascota(int id, String nombre, String especie, String notasMedicas) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.notasMedicas = notasMedicas;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNotasMedicas() {
        return notasMedicas;
    }

    public void setNotasMedicas(String notasMedicas) {
        this.notasMedicas = notasMedicas;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + nombre + " | Especie: " + especie + " | Detalles: " + notasMedicas;
    }
}

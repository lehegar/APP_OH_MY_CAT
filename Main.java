public class Main {
    public static void main(String[] args) {

        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        GestorMascotas miGestor = new GestorMascotas();
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal(miGestor);
            ventana.setVisible(true);
        });
    }
}
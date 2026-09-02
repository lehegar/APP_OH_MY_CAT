import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {

    private GestorMascotas miGestor;

    public VentanaPrincipal(GestorMascotas miGestor) {

        this.miGestor = miGestor;

        setTitle("Mi Diario de Mascotas");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        JLabel etiquetaTitulo = new JLabel("¡Bienvenido a Mi Diario de Mascotas!");
        JTextField campoNombre = new JTextField(15);
        JButton botonBuscar = new JButton("Buscar");


        botonBuscar.addActionListener(e -> {
            String nombre = campoNombre.getText();
            String resultado = miGestor.buscarMascota(nombre);
            JOptionPane.showMessageDialog(this, resultado, "Resultado de la Búsqueda", JOptionPane.INFORMATION_MESSAGE);
        });



        panelPrincipal.add(etiquetaTitulo);
        panelPrincipal.add(campoNombre);
        panelPrincipal.add(botonBuscar);

        this.add(panelPrincipal);
    }
}
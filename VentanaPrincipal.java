import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {

    private GestorMascotas miGestor;
    private JTextField campoId;
    private JTextField campoNombreMascota;
    private JTextField campoEspecie;
    private JTextField campoNotas;

    public VentanaPrincipal(GestorMascotas miGestor) {

        this.miGestor = miGestor;

        setTitle("Mi Diario de Mascotas");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new javax.swing.BoxLayout(panelPrincipal, javax.swing.BoxLayout.Y_AXIS));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel etiquetaTitulo = new JLabel("¡Bienvenido a Mi Diario de Mascotas!");
        JButton botonBuscar = new JButton("Buscar");
        JButton botonGuardar = new JButton("Guardar");

        campoId = anadirCampoFormulario(panelPrincipal, "ID:");
        campoNombreMascota = anadirCampoFormulario(panelPrincipal, "Nombre:");
        campoEspecie = anadirCampoFormulario(panelPrincipal, "Especie:");
        campoNotas = anadirCampoFormulario(panelPrincipal, "Notas Médicas:");

        botonGuardar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(campoId.getText());
                String nombreMascota = campoNombreMascota.getText();
                String especie = campoEspecie.getText();
                String notas = campoNotas.getText();

                Mascota nuevaMascota = new Mascota(id, nombreMascota, especie, notas);
                miGestor.registrarMascota(nuevaMascota);

                campoId.setText("");
                campoNombreMascota.setText("");
                campoEspecie.setText("");
                campoNotas.setText(""); 
            }
            catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error: El ID tiene que ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        botonBuscar.addActionListener(e -> {
            String nombre = campoNombreMascota.getText();
            String resultado = miGestor.buscarMascota(nombre);
            JOptionPane.showMessageDialog(this, resultado, "Resultado de la Búsqueda", JOptionPane.INFORMATION_MESSAGE);
        });

        panelPrincipal.add(etiquetaTitulo);
        panelPrincipal.add(botonBuscar);
        panelPrincipal.add(botonGuardar);

        this.add(panelPrincipal);  
    }

    private JTextField anadirCampoFormulario(JPanel panel, String etiquetaTexto) {
        JPanel fila = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));
        fila.add(new JLabel(etiquetaTexto));
        JTextField campo = new JTextField(15);
        fila.add(campo);
        panel.add(fila);
        return campo;
    }
}
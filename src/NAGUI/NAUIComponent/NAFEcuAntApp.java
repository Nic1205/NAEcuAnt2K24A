package NAGUI.NAUIComponent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class NAFEcuAntApp extends JFrame {

    public NAFEcuAntApp() {
        // Configurar el título de la ventana
        super("EcuAnt 2K24A");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Configurar el layout principal
        setLayout(new BorderLayout());

        // Crear el panel superior con la imagen y el título
        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Hormiguero virtual", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Imagen (si es aplicable, asegúrate de que la ruta sea correcta)
        JLabel imageLabel = new JLabel(new ImageIcon("src\\NAUserInterface\\NAResources\\Logo.png"));

        topPanel.add(imageLabel, BorderLayout.NORTH);
        topPanel.add(titleLabel, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);

        // Crear la tabla
        String[] columnNames = {"RegNro", "TipoHormiga", "Ubicacion", "Sexo", "GenoAlimento", "IngestaNativa", "Estado"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Crear el panel inferior
        JPanel southPanel = new JPanel(new BorderLayout());

        // Panel de comboboxes y botones
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));

        // Panel de comboboxes
        JPanel comboPanel = new JPanel();
        JComboBox<String> genoAlimentoCombo = new JComboBox<>(new String[]{"X", "XX", "XY"});
        JComboBox<String> ingestaNativaCombo = new JComboBox<>(new String[]{"CARNIVORO", "HERBIVORO", "OMNIVORO", "INSECTIVORO", "NECTARIVORO"});

        comboPanel.add(new JLabel("         <GenoAlimento>      "));
        comboPanel.add(genoAlimentoCombo);
        comboPanel.add(new JLabel("         <IngestaNativa>     "));
        comboPanel.add(ingestaNativaCombo);

        // Panel de botones
        JPanel buttonPanel = new JPanel();
        JButton crearLarvaButton = new JButton("Crear Larva");
        JButton alimentarButton = new JButton("Alimentar");
        JButton eliminarButton = new JButton("Eliminar");
        JButton guardarButton = new JButton("Guardar");

        // Agregar espacios entre los botones
        buttonPanel.add(crearLarvaButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(alimentarButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(eliminarButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(guardarButton);

        // Añadir los paneles de comboboxes y botones al panel inferior
        bottomPanel.add(comboPanel);
        bottomPanel.add(buttonPanel);

        // Crear la barra de estado
        JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        statusBar.add(Box.createHorizontalGlue());
        JLabel statusLabel = new JLabel("Programacion II        |       Cedula: 0650090160      |      Nombres: Alejandro Nicolas Novillo Urgiles");
        statusBar.add(statusLabel);

        // Añadir el panel inferior y la barra de estado al layout principal
        southPanel.add(bottomPanel, BorderLayout.CENTER);
        southPanel.add(statusBar, BorderLayout.SOUTH);
        add(southPanel, BorderLayout.SOUTH);
    }

    // Método para mostrar la ventana
    public void showWindow() {
        this.setVisible(true);
    }
}

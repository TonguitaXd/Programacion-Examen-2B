package GUI;
import javax.swing.*;

import BusinessLogic.EncriptadorMD5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginUI extends JFrame {

   


    private JLabel amUsuarioLabel, amContraseñaLabel;
    private JTextField amUsuarioField;
    private JPasswordField amPasswordField;
    private JButton amButton;
    private int amLoginAttempts = 0;
    private final int AM_MAXIMO_INTENTOS = 3;

    public LoginUI() {
        // Configurar la ventana
        setTitle("Ingreso");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        // Configurar los componentes de la interfaz gráfica
        amUsuarioLabel = new JLabel("Usuario:");
        amContraseñaLabel = new JLabel("Clave:");
        amUsuarioField = new JTextField(20);
        amPasswordField = new JPasswordField(20);
        amButton = new JButton("Continuar");

       

        amButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login1();
            }
        });

        // Configurar el panel y agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(amUsuarioLabel);
        panel.add(amUsuarioField);
        panel.add(amContraseñaLabel);
        panel.add(amPasswordField);
        panel.add(new JLabel(""));
        panel.add(amButton);


        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login1() {
        String amUsuario = amUsuarioField.getText();
        String amPassword = new String(amPasswordField.getPassword());
        String amEncryptedPassword = EncriptadorMD5.amEncryptMD5(amPassword); // Encriptar la contraseña ingresada
    
        // Verificar las credenciales en una fuente de datos
        if ((amUsuario.equals("anthony.morales03@epn.edu.ec") && amEncryptedPassword.equals("4086706df943bb1226ecee27c687f995")) ||
                (amUsuario.equals("profe") && amEncryptedPassword.equals("81dc9bdb52d04dc20036dbd8313ed055"))) {
            JOptionPane.showMessageDialog(this, "Inicio exitoso");
            dispose();
            new LectorCoordenadas(); // cerrar la ventana
            
        } else {
            amLoginAttempts++;
            if (amLoginAttempts == AM_MAXIMO_INTENTOS) {
                JOptionPane.showMessageDialog(this, "Se agotaron sus intentos");
                dispose(); // cerrar la ventana
                new LectorCoordenadas();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
    }
}

    
}
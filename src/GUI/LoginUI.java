package GUI;
import javax.swing.*;

import BusinessLogic.PasswordEncrypter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginUI extends JFrame {

   


    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton emojiButton;
    private int amLoginAttempts = 0;
    private final int amMaximoIntentos = 3;

    public LoginUI() {
        // Configurar la ventana
        setTitle("Ingreso");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        // Configurar los componentes de la interfaz gráfica
        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Clave:");
        userField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emojiButton = new JButton("Continuar");

       

        emojiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login1();
            }
        });

        // Configurar el panel y agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(emojiButton);
        panel.setBackground(Color.GREEN);

        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login1() {
        String amUsuario = userField.getText();
        String amPassword = new String(passwordField.getPassword());
        String amEncryptedPassword = PasswordEncrypter.amencrypt(amPassword); // Encriptar la contraseña ingresada
    
        // Verificar las credenciales en una fuente de datos
        if ((amUsuario.equals("anthony.morales03@epn.edu.ec") && amEncryptedPassword.equals("4086706df943bb1226ecee27c687f995")) ||
                (amUsuario.equals("profe") && amEncryptedPassword.equals("81dc9bdb52d04dc20036dbd8313ed055"))) {
            JOptionPane.showMessageDialog(this, "Inicio exitoso");
            dispose(); // cerrar la ventana
        } else {
            amLoginAttempts++;
            if (amLoginAttempts == amMaximoIntentos) {
                JOptionPane.showMessageDialog(this, "Se agotaron sus intentos");
                dispose(); // cerrar la ventana
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
    }
}

    
}
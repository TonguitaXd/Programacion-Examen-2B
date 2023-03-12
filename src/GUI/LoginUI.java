package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class LoginUI extends JFrame {
    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton emojiButton;

    public LoginUI() {
        // Configurar la ventana
        setTitle("Login");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Agregar ícono a la ventana
    

        // Configurar los componentes de la interfaz gráfica
        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contraseña:");
        userField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emojiButton = new JButton();

        try {
            // Cargar la imagen del emoji
            URL url = new URL("https://em-content.zobj.net/thumbs/60/apple/124/key_1f511.png");
            ImageIcon emojiIcon = new ImageIcon(url);
            emojiButton.setIcon(emojiIcon);
        } catch (IOException e) {
            System.out.println("Error al cargar la imagen");
        }

        emojiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
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
        panel.setBackground(Color.ORANGE);

        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login() {
        String user = userField.getText();
        String password = new String(passwordField.getPassword());

        // Verificar las credenciales
        if (user.equals("usuario") && password.equals("contraseña")) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    }

    public static void main(String[] args) {
        new LoginUI();
    }
}

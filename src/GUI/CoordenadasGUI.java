package GUI;
import javax.swing.*;

//import BusinessLogic.EncriptadorMD5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoordenadasGUI extends  JFrame{
    private JLabel amUserLabel;
    private JButton amButton;

    public CoordenadasGUI() {
        // Configurar la ventana
        setTitle("Lector");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        // Configurar los componentes de la interfaz gráfica
        amUserLabel = new JLabel("[+] Leyendo coordenadas....");
        amButton = new JButton("Continuar");

       

        amButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });

        // Configurar el panel y agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(amUserLabel);
        panel.add(amButton);

         // Agregar el panel a la ventana
         getContentPane().add(panel);
         setVisible(true);
        
    }


}

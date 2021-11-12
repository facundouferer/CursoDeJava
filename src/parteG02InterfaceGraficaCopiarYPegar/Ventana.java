package parteG01InterfaceGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel Texto;
    private JTextField textoUsuario;
    private JLabel mensaje;
    private JTextField textoPegado;
    private JButton botonCopiar;
    private JPanel panelPrincipal;
    private JButton botonLimpiar;

    public Ventana() {
        setSize(400, 300); /** Definie el tamanio de la ventana**/
        setVisible(true); /** Hace visible la ventana **/
        setLocationRelativeTo(null); /**Pone la vantana en el centro relativo de la pantalla**/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /** Hace que la X cierre el programa**/

        setContentPane(panelPrincipal); /**Coloca el panel que contiene todo en centro **/

        botonCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoEscrito = textoUsuario.getText();
                System.out.println("El texto copiado es "+textoEscrito);
                textoPegado.setText(textoEscrito);
            }
        });

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoPegado.setText("");
                textoUsuario.setText("");
            }
        });
    }
}

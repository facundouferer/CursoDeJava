package parteG01InterfaceGrafica;

import javax.swing.*;
public class PrimerVentana extends JFrame{
    private JPanel PanelPrincipal;
    public PrimerVentana(){
        setSize(200, 200); /** Definie el tamanio de la ventana**/
        setVisible(true); /** Hace visible la ventana **/
        setLocationRelativeTo(null); /**Pone la vantana en el centro relativo de la pantalla**/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /** Hace que la X cierre el programa**/
        setContentPane(PanelPrincipal); /**Coloca el panel que contiene todo en centro **/
    }

}

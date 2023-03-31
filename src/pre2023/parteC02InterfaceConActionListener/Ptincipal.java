package pre2023.parteC02InterfaceConActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Ptincipal {
    public static void main(String[] args) {
        /*
         * 1) Se creo una variable del timpo Timer y también se importe import java.util.Timer para traerla
         *
         * 4) instanciamos temporizador para poder usarlo al crear la clase Timer
         */
        TemporizadorOyente oyente = new TemporizadorOyente();
        Timer myTemporizador = new Timer(500, oyente);

        // para que se produzca un evento

        JOptionPane.showMessageDialog(null, "metele click");

        /*
         * 5) para iniciar el temporizador.
         */

        myTemporizador.start();

    }
}

/*
 * 2) creamos la clase que implementa ActionListener y por lo tanto, como es interface
 * debemos implementar los metodos que nos pide. por suerte es sólo uno.
 */

class TemporizadorOyente implements ActionListener {

    /*
     * 3) Este método se ejecutar, cada vez que ocurre una acción o evento.
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Date horaActual = new Date();
        System.out.println(horaActual);

    }

}
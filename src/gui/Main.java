/*
Nombre: Luis Javier Navarrete Cruz
Matricula: 2022235
 */
package gui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author luisn
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setTitle("Cesba");
        frame.setResizable(false);
       // frame.getContentPane().setBackground(Color.blue);
        frame.getContentPane().setBackground(new Color(28, 26, 198)); 
       // frame.getContentPane().setBackground(new Color(0xB2FF33));
    }
}

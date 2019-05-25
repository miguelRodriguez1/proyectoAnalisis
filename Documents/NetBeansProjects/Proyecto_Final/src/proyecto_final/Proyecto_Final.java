/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import javax.swing.JFrame;
/**
 *
 * @author Miguel Rodriguez
 */
public class Proyecto_Final {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Lienzo l1 = new Lienzo();
        // Definir ventana
        JFrame ventana = new JFrame("Grafos");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.add(l1);
        ventana.setVisible(true);  
    }
}
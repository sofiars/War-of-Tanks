/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competenciaNave;

import javax.swing.JFrame;

/**
 *
 * @author Sofia
 */
public class CompetenciaNaves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame ("Competencia de Naves");
        ventana.setSize(1024,800);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().add(new JPanelNaves());
        ventana.setVisible(true);
    }
    
}

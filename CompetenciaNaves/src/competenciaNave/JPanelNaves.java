/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competenciaNave;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Sofia
 */
public class JPanelNaves extends JPanel implements Runnable {

    private Nave nave1 = null;
    private Nave nave2 = null;
    private Nave nave3 = null;
    private Thread hiloControl;

    String rutaNave1;
    String rutaNave2;
    String rutaNave3;

    public JPanelNaves() {
        rutaNave1 = "nave1.gif";
        rutaNave2 = "nave2.png";
        rutaNave3 = "nave3.png";

        nave1 = new Nave(rutaNave1, 0, 0);
        nave2 = new Nave(rutaNave2, 0, 0);
        nave3 = new Nave(rutaNave3, 0, 0);

        hiloControl = new Thread(this);
        hiloControl.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int anchoPanel = this.getWidth() / 3;
        int altoPanel = this.getHeight() / 3;
        int yNave1 = 0;
        int yNave2 = yNave1 + altoPanel;
        int yNave3 = yNave2 + altoPanel;

        nave1.setY(yNave1);
        nave2.setY(yNave2);
        nave3.setY(yNave3);

        g.drawImage(nave1.getImagen(), nave1.getX(), nave1.getY(), anchoPanel, altoPanel, this);
        g.drawImage(nave2.getImagen(), nave2.getX(), nave2.getY(), anchoPanel, altoPanel, this);
        g.drawImage(nave3.getImagen(), nave3.getX(), nave3.getY(), anchoPanel, altoPanel, this);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void run() {
        while (hiloControl == Thread.currentThread()) {
            try {
                repaint();
                Thread.sleep(20);
            }catch (InterruptedException e){
            }
        }
    }
}

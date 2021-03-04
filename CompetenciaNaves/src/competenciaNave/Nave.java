/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competenciaNave;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Sofia
 */
public class Nave implements Runnable {
    
    private ImageIcon ii;
    private Image imagen;
    private int x;
    private int y;
    private Thread hiloNave;
   public Nave(String ruta,int x, int y){
       ii = new ImageIcon(this.getClass().getResource(ruta));
       imagen = ii.getImage();
       this.x =x;
       this.y = y;
        hiloNave = new Thread(this);
        hiloNave.start();
       
   }   
   public Image getImagen() {
        return imagen;
    }
   public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void run() {
        while(hiloNave == Thread.currentThread()&& this.x < 800) {
           try {
               this.x += 50;
               Thread.sleep(700);
           } catch(InterruptedException ie) {
           }
       }
    }
    
    
}

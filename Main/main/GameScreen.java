package main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class GameScreen extends JPanel {
    private Game game;
    //private int[] numbers;exactly the number
    private Dimension size;

    private Render render;

    public GameScreen(Game game) {
        this.game = game;
        render = new Render(this);
        setPanelSize();


    }

    private void setPanelSize() {
        size = new Dimension(640, 640); //each pixel is 32, therefore 32x20 640
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
        //make sure when extends the screen, there is no gi do du thua
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        render.render(g);
        //g.drawImage(sprites.get(19), 0, 0 , null); // equal to g.drawImage(img.getSubimage(32 * 9, 32, 32, 32), 0, 0, null);
        //g.drawImage(img.getSubimage(32 * 9, 32, 32, 32), 0, 0, null);
        //g.drawRect(50 , 50, 100, 100);
        //g.fillRect(0,0,32,32);//at x = 0, y = 0, width = 32(ngang), 32(doc) = 1 pixel at (0,0)
        //g.fillRect(32,0,32,32);//x=32 => cach 1 pixel
    }

}
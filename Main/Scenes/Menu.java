package Scenes;

import main.Game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

public class Menu extends GameScene implements SceneMethods{
    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>();//add or remove
    private Random random;

    public Menu(Game game) {
        super(game);
        random = new Random();
        importImg();
        LoadSprite();
    }

    @Override
    public void render(Graphics g) {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                g.drawImage(sprites.get(getRndInt()), x * 32, y * 32, null);
            }
        }
    }

    public void importImg(){
        InputStream is = getClass().getResourceAsStream("/spriteatlas.png");//InputSteam: class to read image
        try {
            img = ImageIO.read(is);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private void LoadSprite() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                sprites.add(img.getSubimage(x * 32, y * 32, 32, 32));
            }
        }
    }

    private int getRndInt() {
        return random.nextInt(100);
    }
}

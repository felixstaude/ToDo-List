package de.felixstaude.gui;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private int heightFrame;
    private int widthFrame;
    private int heightScreen;
    private int widthScreen;
    private int posXFrame;
    private int posYFrame;

    public Panel(Graphics gr){
        heightFrame = new Gui().getHeightFrame();
        widthFrame = new Gui().getWidthFrame();
        heightScreen = new Gui().getHeightScreen();
        widthScreen = new Gui().getWidthScreen();
        posXFrame = new Gui().getPosXFrame();
        posYFrame = new Gui().getPosYFrame();

        paint(gr);
    }

    public void paint(Graphics gr) {

        Graphics2D g = (Graphics2D)gr;
        g.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Font font = new Font("Serif", Font.CENTER_BASELINE, 26);
        g.setFont(font);
        g.drawString("To-Do", widthFrame / 2, 50);
    }

}

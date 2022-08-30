package de.felixstaude.gui;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int heightFrame = 500;
    private int widthFrame = 200;
    private int heightScreen = screenSize.height;
    private int widthScreen = screenSize.width;
    private int posXFrame = getWidthScreen() - getWidthFrame() - 5;
    private int posYFrame = (getHeightScreen() / 2) - (getHeightFrame() / 2);

    public Gui(){
        setResizable(false);
        setTitle("ToDo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(getPosXFrame(), getPosYFrame(), getWidthFrame(), getHeightFrame());
        getContentPane().add(new Panel());
        // no header
        setUndecorated(true);

        setVisible(true);
        // set hotkeys
        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
            @Override
            public void onHotKey(int i) {
                if(i == 1){
                    if(isVisible()){
                        // open/ close window
                        setVisible(false);
                    } else {
                        setVisible(true);

                    }
                } else if (i == 2){
                    // kill process
                    System.exit(0);
                }
            }
        });
    }

    public int getHeightFrame(){
        return heightFrame;
    }

    public int getWidthFrame(){
        return widthFrame;
    }

    public int getHeightScreen(){
        return heightScreen;
    }

    public int getWidthScreen(){
        return widthScreen;
    }

    public int getPosXFrame(){
        return posXFrame;
    }

    public int getPosYFrame(){
        return posYFrame;
    }

}

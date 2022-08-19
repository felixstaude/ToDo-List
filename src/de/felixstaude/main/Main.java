package de.felixstaude.main;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;
import de.felixstaude.gui.Gui;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public static void main(String[] args){
        new Gui();
        // register hotkeys
        JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_CONTROL, (int)'L');
        JIntellitype.getInstance().registerHotKey(2, JIntellitype.MOD_CONTROL, (int)'K');

    }


}


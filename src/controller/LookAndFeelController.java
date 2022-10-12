package controller;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;

public class LookAndFeelController {
    public static void loadLookAndFeel() {
        System.setProperty( "apple.awt.application.name", "Library" );
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        UIManager.put("Button.background", new Color(255, 255, 255));
    }
}

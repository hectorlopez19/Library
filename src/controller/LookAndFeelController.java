package controller;

import com.formdev.flatlaf.FlatDarkLaf;
import themes.HectogreTheme;

import javax.swing.*;
import java.awt.*;

public class LookAndFeelController {
    public static void loadLookAndFeel() {
        System.setProperty( "apple.awt.application.name", "Library" );

        FlatDarkLaf.registerCustomDefaultsSource("themes");
        HectogreTheme.setup();
        try {
            UIManager.setLookAndFeel(new HectogreTheme());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        UIManager.put("TextComponent.arc", 10);
    }
}

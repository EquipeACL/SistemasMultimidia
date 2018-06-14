/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package background;

import Frames.TelaInicial;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author lucas
 */
public class Background {

    private static TelaInicial tela;
    private static TrayIcon trayIcon
            = new TrayIcon(createImage("../icones/logo.jpg", "tray icon"));
    private static final SystemTray tray = SystemTray.getSystemTray();

    public Background(TelaInicial t) {
        tela = t;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        //Check the SystemTray support
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        final PopupMenu popup = new PopupMenu();
        trayIcon.setImageAutoSize(true);
        // Create a popup menu components
        MenuItem maximize = new MenuItem("Maximizar");
        MenuItem exitItem = new MenuItem("Exit");

        //Add components to popup menu
        popup.add(maximize);
        popup.add(exitItem);
        trayIcon.setPopupMenu(popup);

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }

        trayIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maximizar();
            }
        });

        maximize.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maximizar();
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);
                System.exit(0);
            }
        });
    }

    //Obtain the image URL
    protected static Image createImage(String path, String description) {
        URL imageURL = Background.class.getResource(path);
        if (imageURL == null) {
            System.err.println("Resource not found: " + path);
            return null;
        } else {
            return (new ImageIcon(imageURL, description)).getImage();
        }
    }

    public static boolean maximizar() {
        tela.setVisible(true);
        return true;
    }

    public static void notifyMessage(String arquivo) {
        trayIcon.displayMessage("Conversão concluída!", "O arquivo " + arquivo + " já está pronto.", TrayIcon.MessageType.INFO);
    }
}

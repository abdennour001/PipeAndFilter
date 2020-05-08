package main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        JFrame mainFrame = new JFrame("CMPG Application");
        mainFrame.setPreferredSize(new Dimension(550, 400));
        CMPG app=new CMPG();
        mainFrame.setContentPane(app.panelMain);
        mainFrame.setResizable(false);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}

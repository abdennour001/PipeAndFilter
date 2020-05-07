package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CMPG {
    private JTextField numero1TextField;
    private JTextField numero2TextField;
    private JButton SOMMEButton;
    private JButton PRODUITButton;
    private JButton FACTORIELButton;
    private JButton QUITTERButton;
    private JButton TRACEButton;

    public CMPG() {

        // Click on somme button event
        SOMMEButton.addActionListener(e -> {
            int numero1 = Integer.parseInt(numero1TextField.getText());
            int numero2 = Integer.parseInt(numero2TextField.getText());

            // trait here...

        });

        // Click on produit button event
        PRODUITButton.addActionListener(e -> {
            int numero1 = Integer.parseInt(numero1TextField.getText());
            int numero2 = Integer.parseInt(numero2TextField.getText());

            // trait here...

        });

        // Click on factoriel button event
        FACTORIELButton.addActionListener(e -> {
            int numero1 = Integer.parseInt(numero1TextField.getText());

            // trait here...

        });

        QUITTERButton.addActionListener(e -> {
            System.exit(0);
        });

        TRACEButton.addActionListener(e -> {

        });
    }
}

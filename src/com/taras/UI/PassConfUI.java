package com.taras.UI;

import com.taras.Logic.PassConfLogic;

import javax.swing.*;
import java.awt.*;

public class PassConfUI {

    JPanel windowContent = new JPanel();
    public JTextField displayField = new JTextField(30);
    BorderLayout borderLayout = new BorderLayout();
    JFrame frame = new JFrame("Password");
    public JButton jButton = new JButton("Confirm");
    GridLayout gridLayout = new GridLayout(1,2);



    PassConfUI() {
        windowContent.setLayout(borderLayout);
        windowContent.setLayout(gridLayout);
        windowContent.add(displayField);
        windowContent.add(jButton);
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
        PassConfLogic passConfLogic = new PassConfLogic(this);
        jButton.addActionListener(passConfLogic);
    }


    public static void main(String[] args) {

        PassConfUI passConfUI=new PassConfUI();


    }
}

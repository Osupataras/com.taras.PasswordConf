package com.taras.Logic;

import com.taras.UI.PassConfUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 * Class for
 */
public class PassConfLogic implements ActionListener {
    PassConfUI passConfUI;
    ArrayList <String> pass = new ArrayList <>();
    boolean b = false;
    String password;



    public PassConfLogic(PassConfUI passConfUI) {
        this.passConfUI = passConfUI;
    }

    //Method for compare textfield and passwords in Arraylist

    public boolean Compare (){
        for (int i = 0; i<pass.size();i++){
            if(pass.get(i) == getPassword()){
                b=true;
                passConfUI.displayField.setText("Confirmed");
                continue;
            }
            else {passConfUI.displayField.setText("Error");}
        }return b;
    }

    public String getPassword() {
        return password;
    }
    //Method for add action to a button
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        password = passConfUI.displayField.getText();
        Object source = event.getSource();
        b = Compare();
    }
}

package org.example.Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reset extends JButton {

    public Reset(){

this.setText("RESET");
this.setForeground(Color.RED);


this.addActionListener(e -> {
    System.out.println("beeeeeepppp");
});
    }


}

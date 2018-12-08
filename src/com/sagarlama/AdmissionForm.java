package com.sagarlama;

import javax.swing.*;
import java.awt.*;

public class AdmissionForm extends JFrame {
    private FormPanel formPanel;


    public AdmissionForm(){
        formPanel = new FormPanel();












        add(formPanel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800,800);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);




    }

}

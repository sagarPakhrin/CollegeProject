package com.sagarlama;

import javax.swing.*;
import java.awt.*;

public class AdmissionForm extends JFrame {
    private FormPanel formPanel;


    public AdmissionForm(){
        formPanel = new FormPanel();












        add(formPanel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000,1000);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);




    }

}

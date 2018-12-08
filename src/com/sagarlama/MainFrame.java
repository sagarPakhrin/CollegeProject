package com.sagarlama;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    public MainFrame(){
        super("College Project");


//        Setting up MenuBar
        setJMenuBar(createMenuBar());





//        Adding Components


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500,600));
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

// Add Menu Bar method
    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");




//        JMenuItems for File Menu
        JMenuItem addStudent = new JMenuItem("Add Student");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(addStudent);
        fileMenu.add(exitItem);

//        Adding Mneumonics
        fileMenu.setMnemonic(KeyEvent.VK_F);
        exitItem.setMnemonic(KeyEvent.VK_X);
        editMenu.setMnemonic(KeyEvent.VK_E);


//        Adding Accelerators
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));


//        Function to exit when clicked exit in File Menu
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int action = JOptionPane.showConfirmDialog(MainFrame.this,"Do You Want To Exit?","Confirm Exit",JOptionPane.OK_CANCEL_OPTION);
                if (action==JOptionPane.OK_OPTION){
                    System.exit(0);
                }
            }
        });

//        Function to add new Details
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdmissionForm admissionForm = new AdmissionForm();
            }
        });




//        Adding Menu Items
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        return menuBar;
    }
}


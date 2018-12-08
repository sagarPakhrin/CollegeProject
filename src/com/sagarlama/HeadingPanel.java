package com.sagarlama;

import javax.swing.*;
import java.awt.*;

public class HeadingPanel extends JPanel {
    private JLabel addNewStudent;
    private JLabel subtitleLbl;
    public HeadingPanel(){
        Font font = new Font("Garamond",Font.BOLD, 40);
        setFont(font);


        addNewStudent = new JLabel("Add New Student");
        subtitleLbl = new JLabel("Fill up the Complete Information to add a new Student");

        addNewStudent.setFont(font);



//        setLayout(new BorderLayout());
        setLayout(new GridBagLayout());
        GridBagConstraints gc= new GridBagConstraints();

        gc.gridy = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        add(addNewStudent,gc);

        gc.gridy++;
        add(subtitleLbl,gc);
    }
}

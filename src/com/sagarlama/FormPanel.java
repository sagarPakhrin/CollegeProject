package com.sagarlama;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
//    New Section
    private HeadingPanel headingPanel;
    private StudentSection studentSection;


    public FormPanel(){
        headingPanel = new HeadingPanel();
        studentSection = new StudentSection();

        setLayout(new BorderLayout());

        add(headingPanel,BorderLayout.PAGE_START);
        add(studentSection,BorderLayout.CENTER);

    }
}// AdmissionForm Class Finishes

//Student's Detail Class
class StudentSection extends JPanel{
    private JLabel nameLbl;
    private JLabel firstNameLbl;
    private JLabel lastNameLbl;
    private JLabel classLbl;
    private JLabel AddressLbl;
    private JLabel streetAddressLbl;
    private JLabel streetLineLbl;
    private JLabel stateLbl;
    private JLabel cityLbl;
    private JLabel postalCodeLbl;
    private JLabel countryLbl;
    private JLabel dobLbl;
    private JLabel dobDateLbl;
    private JLabel dobMonthLbl;
    private JLabel dobYearLbl;
    private JLabel GenderLbl;


    private JTextField firstName;
    private JTextField lastName;
    private JComboBox classComboBox;
    private JTextField streetAddress;
    private JTextField streetLineAddress;
    private JTextField city;
    private JTextField state;
    private JTextField ZipCode;
    private JComboBox countryComboBox;
    private JComboBox dateBox;
    private JComboBox monthBox;
    private JComboBox yearBox;
    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JRadioButton otherRadio;
    private ButtonGroup genderGroup;


    public StudentSection(){

        nameLbl = new JLabel("Name");
        firstNameLbl = new JLabel("First Name");
        lastNameLbl = new JLabel("Last Name");
        classLbl = new JLabel("Class");
        AddressLbl = new JLabel("Address");
        streetAddressLbl = new JLabel("Street Address");
        streetLineLbl = new JLabel("Streen Address Line 2");
        stateLbl = new JLabel("State/Provience");
        cityLbl = new JLabel("City");
        postalCodeLbl = new JLabel("Postal/Zip Code");
        countryLbl = new JLabel("Country");
        dobLbl = new JLabel("Date Of Birth ");
        dobDateLbl = new JLabel("Day");
        dobMonthLbl = new JLabel("Month");
        dobYearLbl = new JLabel("Year");
        GenderLbl = new JLabel("Gender");


        firstName = new JTextField(20);
        lastName = new JTextField(20);
        classComboBox = new JComboBox();
        streetAddress = new JTextField(20);
        streetLineAddress = new JTextField(20);
        city = new JTextField(20);
        state = new JTextField(20);
        ZipCode = new JTextField(20);
        countryComboBox = new JComboBox();
        dateBox = new JComboBox();
        monthBox = new JComboBox();
        yearBox = new JComboBox();
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        otherRadio = new JRadioButton("Other");
        genderGroup = new ButtonGroup();


//        Setup Gender Radios
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);


        setLayout(new GridBagLayout());

        GridBagConstraints gc= new GridBagConstraints();
        Font font = new Font("Arial Black",Font.BOLD,16);
        nameLbl.setFont(font);
        classLbl.setFont(font);
        AddressLbl.setFont(font);
        dobLbl.setFont(font);
        GenderLbl.setFont(font);


//        Adding Items to ComboBox;
//        For Class ComboBox
        DefaultComboBoxModel classModel = new DefaultComboBoxModel();
        for (int i = 1;i<=10;i++){
            classModel.addElement(i);
        }
        classComboBox.setModel(classModel);

//        For Dateof Birth
//        for day
        DefaultComboBoxModel dobDateModel = new DefaultComboBoxModel();
        for (int i = 1;i<=31;i++){
            dobDateModel.addElement(i);
        }
        dateBox.setModel(dobDateModel);

//        for Month
        DefaultComboBoxModel dobMonthModel = new DefaultComboBoxModel();
        for (int i = 1;i<=12;i++){
            dobMonthModel.addElement(i);
        }
        monthBox.setModel(dobMonthModel);


//        For Year
        DefaultComboBoxModel dobYearModel = new DefaultComboBoxModel();
        for (int i = 1990;i<=2015;i++){
            dobYearModel.addElement(i);
        }
        yearBox.setModel(dobYearModel);



//        Forst Column
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameLbl,gc);

//        Next Column
        gc.gridx=1;
        add(firstName,gc);


        gc.gridx=3;
        add(lastName,gc);

        gc.gridx = 1;
        gc.gridy++;
        add(firstNameLbl,gc);

        //        Next Column
        gc.gridx=3;
        add(lastNameLbl,gc);


        gc.gridy++;
        gc.gridx = 0;
        add(classLbl,gc);


        gc.gridx = 1;
        add(classComboBox,gc);


//        Next Row
        gc.gridy++;
        gc.gridx = 0;
        add(AddressLbl,gc);

        gc.gridx=1;
        add(streetAddress,gc);

        gc.gridx=3;
        add(streetLineAddress,gc);

//        Next Row
        gc.gridy++;
        gc.gridx = 1;
        add(streetAddressLbl,gc);

        gc.gridx=3;
        add(streetLineLbl,gc);


//        Next Row
        gc.gridy++;
        gc.gridx = 1;
        add(city,gc);

        gc.gridx=3;
        add(state,gc);

//        Next Row
        gc.gridy++;
        gc.gridx = 1;
        add(cityLbl,gc);

        gc.gridx=3;
        add(stateLbl,gc);


        gc.gridy++;
        gc.gridx =1;
        add(ZipCode,gc);

        gc.gridx=3;
        add(countryComboBox,gc);


        gc.gridy++;
        gc.gridx = 1;
        add(postalCodeLbl,gc);

        gc.gridx = 3;
        add(countryLbl,gc);

//        Next Row
        gc.gridy++;
        gc.gridx=0;
        add(dobLbl,gc);

        gc.gridx++;
        add(dateBox,gc);

        gc.gridx++;
        add(dobDateLbl,gc);

        gc.gridx++;
        add(monthBox,gc);

        gc.gridx++;
        add(dobMonthLbl,gc);

        gc.gridx++;
        add(yearBox,gc);

        gc.gridx++;
        add(dobYearLbl,gc);

        gc.gridy++;
        gc.gridx=0;
        add(GenderLbl,gc);

        gc.gridx++;
        add(maleRadio,gc);

        gc.gridx++;
        add(femaleRadio,gc);

        gc.gridx++;
        add(otherRadio,gc);

        Border titleBorder = BorderFactory.createTitledBorder("Student's Details");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(outerBorder);
        setBorder(titleBorder);

    }
}
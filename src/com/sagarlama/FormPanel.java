package com.sagarlama;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
//    New Section
    private HeadingPanel headingPanel;
    private StudentSection studentSection;
    private ParentsSection parentsSection;


    public FormPanel(){
        headingPanel = new HeadingPanel();
        studentSection = new StudentSection();
        parentsSection = new ParentsSection();

        setLayout(new BorderLayout());

        add(headingPanel,BorderLayout.PAGE_START);
        add(studentSection,BorderLayout.CENTER);
        add(parentsSection,BorderLayout.PAGE_END);

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
        gc.anchor = GridBagConstraints.WEST;
        add(nameLbl,gc);

//        Next Column
        gc.gridx=1;
        add(firstName,gc);


        gc.gridx=4;
        add(lastName,gc);

        gc.gridx = 1;
        gc.gridy++;
        add(firstNameLbl,gc);

        //        Next Column
        gc.gridx=4;
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

        gc.gridx=4;
        add(streetLineAddress,gc);

//        Next Row
        gc.gridy++;
        gc.gridx = 1;
        add(streetAddressLbl,gc);

        gc.gridx=4;
        add(streetLineLbl,gc);


//        Next Row
        gc.gridy++;
        gc.gridx = 1;
        add(city,gc);

        gc.gridx=4;
        add(state,gc);

//        Next Row
        gc.gridy++;
        gc.gridx = 1;
        add(cityLbl,gc);

        gc.gridx=4;
        add(stateLbl,gc);


        gc.gridy++;
        gc.gridx =1;
        add(ZipCode,gc);

        gc.gridx=4;
        add(countryComboBox,gc);


        gc.gridy++;
        gc.gridx = 1;
        add(postalCodeLbl,gc);

        gc.gridx = 4;
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


class ParentsSection extends JPanel{
    private JLabel fathersNameLbl;
    private JLabel mothersNameLbl;
    private JLabel fatherFNameLbl;
    private JLabel fattherLNameLbl;
    private JLabel motherFNameLbl;
    private JLabel motherLNameLbl;
    private JLabel EmailLbl;
    private JLabel phoneNumbherLbl;
    private JLabel phonePrimaryLbl;
    private JLabel phoneSecondaryLbl;


    private JTextField fathersFName;
    private JTextField fathersLName;
    private JTextField mothersFName;
    private JTextField mothersLName;
    private JTextField emailField;
    private JTextField phoneField;

    public ParentsSection(){

        fathersNameLbl = new JLabel("Father's Name");
        mothersNameLbl = new JLabel("Mother's Name");
        fatherFNameLbl = new JLabel("First Name ");
        fattherLNameLbl = new JLabel("Last Name ");
        motherFNameLbl = new JLabel("First name ");
        motherLNameLbl = new JLabel("Last Name ");
        EmailLbl = new JLabel("E-Mail");
        phoneNumbherLbl = new JLabel("Phone Number");
        phonePrimaryLbl = new JLabel("Primary ");
        phoneSecondaryLbl = new JLabel("Secondary ");

        fathersFName = new JTextField(20);
        fathersLName = new JTextField(20);
        mothersFName = new JTextField(20);
        mothersLName = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);

        setLayout(new GridBagLayout());

        GridBagConstraints gc= new GridBagConstraints();
        Font font = new Font("Arial Black",Font.BOLD,16);

        fathersNameLbl.setFont(font);
        mothersNameLbl.setFont(font);
        EmailLbl.setFont(font);
        phoneNumbherLbl.setFont(font);

        gc.gridy = 0;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;
        add(fathersNameLbl,gc);

        gc.gridx++;
        add(fathersFName,gc);

        gc.gridx++;
        add(fathersLName,gc);

        gc.gridy++;
        gc.gridx=1;
        add(fatherFNameLbl,gc);

        gc.gridx++;
        add(fattherLNameLbl,gc);

        gc.gridy++;
        gc.gridx=0;
        add(mothersNameLbl,gc);

        gc.gridx++;
        add(mothersFName,gc);

        gc.gridx++;
        add(mothersLName,gc);

        gc.gridy++;
        gc.gridx=1;
        add(motherFNameLbl,gc);
        gc.gridx++;
        add(motherLNameLbl,gc);

        gc.gridy++;
        gc.gridx=0;
        add(EmailLbl,gc);


        gc.gridx=1;
        add(emailField,gc);

        gc.gridy++;
        gc.gridx=0;
        add(phoneNumbherLbl,gc);

        gc.gridx=1;
        add(phoneField,gc);


        Border titleBorder = BorderFactory.createTitledBorder("Parent's Details");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);

        setBorder(outerBorder);
        setBorder(titleBorder);
    }
}

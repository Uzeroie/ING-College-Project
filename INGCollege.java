import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class INGCollege implements ActionListener
{
    JFrame frame, Displayframe ;

    JPanel P1,PMenu,P2,P3;

    JLabel lblForm,lblHello,lblProcess,lblRead,lblX,lbli,lblii,lbliii,lbliv,lblv,lblCopy,lblStartingDate,lblCompletionDate,lblNumberofAssessments,lblLecturerName,lblCourseLeader,lblCoursesID,lblLevel,lblCredit,lblCourseName,lblAcaDuration,
    lblForm1,lblForm2,lblDuration,lblPrequisites,lblCourseID,lblNonCourseID,lblNonCourseName,lblNonCoursesID,lblNonCourseLeader,lblInstructorName,lblStartDate,lblNCompletionDate,lblExamDate;

    JTextField txtCourseID,txtCourseName,txtAcaDuration,txtLevel,txtCompletionDate,txtLecturerName,txtStartingDate,txtCredit,txtCourseLeader,txtCoursesID,txtNumberofAssessment,txtNonCourseID,txtNCompletionDate
    ,txtNonCourseName,txtDuration,txtPrerequisites,txtNonCoursesID,txtNonCourseLeader,txtInstructorName,txtStartDate,txtExamDate;

    JButton btnHome,btnAca,btnNonAca,btnBack,btnAcaADD,btnAcaRegister,btnAcaDisplay,btnAcaClear,btnNonAcaADD,btnNonAcaRegister,btnRemove,btnNonAcaDisplay,btnNonAcaClear;

    ArrayList<Courses>AcademicList = new ArrayList<Courses>();

    ArrayList<Courses>NonAcademicList = new ArrayList<Courses>();

    Courses obj1 ; Courses obj2;

    int x=0;
    int y=0;

    INGCollege(){
        //Frame - > Frame for the registration from 
        frame = new JFrame ("Registration Form");
        frame.setSize (800, 550);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);

        //JPanel for the registration form's opening page
        P1 = new JPanel ();
        P1.setBounds(200,0,650,550);
        P1.setBackground(Color.decode("#F6F6F3"));
        P1.setLayout(null);
        P1.setVisible(true);
        frame.add(P1);

        // Welcome paragraph for Home page or pannel no 1

        lblForm = new JLabel ("Registration Form");
        lblForm.setBounds (150, 20, 500, 25);
        Font f1 = new Font ("Monotype Corsiva", Font.BOLD, 30);
        lblForm.setForeground(Color.BLUE);
        lblForm.setFont(f1);
        P1.add(lblForm);

        lblHello = new JLabel ("Hello and Welcome To The Registration Process For The ING Group");
        lblHello.setBounds (10, 70, 5000, 30);
        Font Hell = new Font ("Arial", Font.PLAIN, 15);
        lblHello.setFont(Hell);
        P1.add(lblHello);

        lblProcess = new JLabel ("Here you'll find all the procedures required to fill the form. Please read all of these ");
        lblProcess.setBounds (10, 100, 5000, 30);
        lblProcess.setFont(Hell);
        P1.add(lblProcess);

        lblRead = new JLabel (" properly before filling up the form!!!");
        lblRead.setBounds (10, 120, 5000, 30);
        lblRead.setFont(Hell);
        P1.add(lblRead);

        lblX = new JLabel ("The procedure goes like:  ");
        lblX.setBounds (10, 160, 5000, 30);
        lblX.setFont(Hell);
        P1.add(lblX);

        lbli = new JLabel ("i. Read all the labels correctly before filling up the information.");
        lbli.setBounds (10, 185, 5000, 30);
        lbli.setFont(Hell);
        P1.add(lbli);

        lblii = new JLabel ("ii. The information provided is voluntary will be kept confidential.");
        lblii.setBounds (10, 205, 5000, 30);
        lblii.setFont(Hell);
        P1.add(lblii);

        lbliii = new JLabel ("iii. Please include all the required details.");
        lbliii.setBounds (10, 225, 5000, 30);
        lbliii.setFont(Hell);
        P1.add(lbliii);

        lbliv = new JLabel ("iv. Press Clear if you want to remove what you filled in the form.");
        lbliv.setBounds (10, 245, 5000, 30);
        lbliv.setFont(Hell);
        P1.add(lbliv);

        lblv = new JLabel ("v. Press Register after you fill all the required details on the form.");
        lblv.setBounds (10, 265, 5000, 30);
        lblv.setFont(Hell);
        P1.add(lblv);

        lblCopy = new JLabel ("Copyright 2021 by Ira Lamichhane ");
        lblCopy.setBounds (240, 450, 5000, 30);
        lblCopy.setFont(Hell);
        lblCopy.setForeground(Color.RED);
        P1.add(lblCopy);
        

        //JPanel for the menu bar
        PMenu = new JPanel ();
        PMenu.setBounds(0, 0, 200, 550);
        PMenu.setBackground(Color.decode("#7eab87"));
        PMenu.setLayout(null);
        PMenu.setVisible(true);
        frame.add(PMenu);

        //BUttons for JPanel number 1

        btnHome = new JButton ("Home");
        btnHome.setFont (new Font ("Arial", Font.PLAIN, 20));
        btnHome.setBackground(Color.decode("#F6F6F6"));
        btnHome.setBounds (7, 40, 100, 30);
        btnHome.setVisible(true);
        btnHome.setFocusable (false);
        PMenu.add(btnHome);

        btnAca = new JButton ("Academic Course");
        btnAca.setFont (new Font ("Arial", Font.PLAIN, 15));
        btnAca.setBackground(Color.decode("#F6F6F6"));
        btnAca.setBounds (7, 90, 170, 30);
        btnAca.setFocusable (false);
        btnAca.setVisible(true);
        PMenu.add(btnAca);

        btnNonAca = new JButton ("Non-Academic Course");
        btnNonAca.setFont(new Font ("Arial",Font.BOLD,12));
        btnNonAca.setBackground(Color.decode("#F6F6F6"));
        btnNonAca.setBounds (7, 130, 170, 40);
        btnNonAca.setFocusable (false);
        btnNonAca.setVisible(true);
        PMenu.add(btnNonAca);

        btnBack = new JButton ("Back");
        btnBack.setFont (new Font ("Arail", Font.PLAIN, 20));
        btnBack.setBackground(Color.decode("#F6F6F6"));
        btnBack.setBounds(80, 450, 80, 30 );
        btnBack.setVisible(true);
        btnBack.setFocusable (false);
        PMenu.add(btnBack);

        // JPannel for Academic course 

        P2 = new JPanel ();
        P2.setBounds(200,0,650,550);
        P2.setBackground(Color.decode("#e6fdff"));
        P2.setLayout(null);
        P2.setVisible(true);
        frame.add(P2);
        
        //JLabel for heading of ACA course
        lblForm1 = new JLabel ("Academic Course Registration Form");
        lblForm1.setBounds (20, 20, 500, 25);
        Font ff = new Font ("Arial", Font.BOLD, 26);
        lblForm1.setFont(ff);
        P2.add(lblForm1);

        // JPannel for Non Academic Course
        P3 = new JPanel ();
        P3.setBounds(200,0,650,550);
        P3.setBackground(Color.decode("#e6fdff"));
        P3.setLayout(null);
        P3.setVisible(true);
        frame.add(P3);
        
        //JLabel for heading of NON ACA Course
        lblForm2 = new JLabel ("Non-Academic Course Registration Form");
        lblForm2.setBounds (20, 20, 550, 25);
        Font fff = new Font ("Arial", Font.BOLD, 26);
        lblForm2.setFont(fff);
        P3.add(lblForm2);

        // using JLabel component of swing package for Academic Course
        
        //JLabel and TextField for CourseID
        lblCourseID = new JLabel ("CourseID: ");
        lblCourseID.setBounds (5, 70, 120, 30);
        P2.add(lblCourseID);

        txtCourseID = new JTextField();
        txtCourseID.setBounds(110, 75, 120, 20);
        P2.add(txtCourseID);

        //JLabel and TextField for Course Name
        lblCourseName = new JLabel ("Course Name:");
        lblCourseName.setBounds (350, 70, 120, 30);
        P2.add(lblCourseName);

        txtCourseName = new JTextField();
        txtCourseName.setBounds (450, 75, 120, 20);
        P2.add(txtCourseName);

        //JLabel and TextField for Duration

        lblAcaDuration = new JLabel ("Duration: ");
        lblAcaDuration.setBounds (5, 105, 120, 30 );
        P2.add(lblAcaDuration);

        txtAcaDuration = new JTextField ();
        txtAcaDuration.setBounds (110, 110, 120, 20);
        P2.add(txtAcaDuration);

        //JLabel and TextField for Level
        lblLevel = new JLabel ("Level: ");
        lblLevel.setBounds (350, 105, 120, 30);
        P2.add(lblLevel);

        txtLevel = new JTextField ();
        txtLevel.setBounds (450, 110, 120, 20);
        P2.add(txtLevel);

        //JLabel and TextField for Credit
        lblCredit = new JLabel ("Credit: ");
        lblCredit.setBounds (5, 140, 120, 30);
        P2.add(lblCredit);

        txtCredit = new JTextField ();
        txtCredit.setBounds (110, 145, 120, 20);
        P2.add(txtCredit);

        //JLabel and TextField for Number of Assessments

        lblNumberofAssessments = new JLabel ("Number Of Assessments: ");
        lblNumberofAssessments.setBounds (290, 140, 150, 30);
        P2.add(lblNumberofAssessments);

        txtNumberofAssessment = new JTextField ();
        txtNumberofAssessment.setBounds (450, 145, 120, 20);
        P2.add(txtNumberofAssessment);

        //ADD button for ACA form
        btnAcaADD = new JButton ("Add");
        btnAcaADD.setFont (new Font ("Arail", Font.PLAIN, 20));
        btnAcaADD.setBackground(Color.decode("#edc591"));
        btnAcaADD.setBounds(460, 170, 100, 30 );
        btnAcaADD.setFocusable (false);
        btnAcaADD.setVisible(true);
        P2.add(btnAcaADD);

        //JLabel and TextField for CourseID
        lblCoursesID = new JLabel ("CourseID: ");
        lblCoursesID.setBounds (5, 220, 120, 30);
        P2.add(lblCoursesID);

        txtCoursesID = new JTextField ();
        txtCoursesID.setBounds (110, 225, 120, 20);
        P2.add(txtCoursesID);

        //JLabel and TextField for Course Leader
        lblCourseLeader = new JLabel ("Course Leader: ");
        lblCourseLeader.setBounds (320, 220, 120, 30);
        P2.add(lblCourseLeader);

        txtCourseLeader = new JTextField();
        txtCourseLeader.setBounds (450, 225, 120, 20);
        P2.add(txtCourseLeader);

        //JLabel and TextField for Lecturer Name
        lblLecturerName = new JLabel ("Lecturer Name: ");
        lblLecturerName.setBounds (5, 260, 120, 30);
        P2.add(lblLecturerName);

        txtLecturerName = new JTextField ();
        txtLecturerName.setBounds (110, 265, 120, 20);
        P2.add(txtLecturerName);

        //JLabel and TextField for Starting Date
        lblStartingDate = new JLabel ("Starting Date: ");
        lblStartingDate.setBounds (320, 260, 120, 30);
        P2.add(lblStartingDate);

        txtStartingDate = new JTextField ();
        txtStartingDate.setBounds (450, 265, 120, 20);
        P2.add(txtStartingDate);
        
        //JLabel and TextField for Completion Date
        lblCompletionDate = new JLabel ("Completion Date: ");
        lblCompletionDate.setBounds (5, 300, 120, 30);
        P2.add(lblCompletionDate);

        txtCompletionDate = new JTextField ();
        txtCompletionDate.setBounds (110, 305, 120, 20);
        P2.add(txtCompletionDate);
        
        // Register button for ACA Course
        btnAcaRegister = new JButton ("Register");
        btnAcaRegister.setFont (new Font ("Arail", Font.PLAIN, 17));
        btnAcaRegister.setBackground(Color.decode("#edc591"));
        btnAcaRegister.setBounds (460, 305, 100, 30);
        btnAcaRegister.setVisible (true);
        btnAcaRegister.setFocusable (false);
        P2.add(btnAcaRegister);

        //Display Button for ACA Course
        btnAcaDisplay = new JButton ("Display");
        btnAcaDisplay.setFont (new Font ("Arail", Font.PLAIN, 17));
        btnAcaDisplay.setBackground(Color.decode("#edc591"));
        btnAcaDisplay.setBounds (100, 400, 100, 30);
        btnAcaDisplay.setFocusable (false);
        btnAcaDisplay.setVisible (true);
        P2.add(btnAcaDisplay);
        
        //Clear buttoon for ACA Course
        btnAcaClear = new JButton ("Clear");
        btnAcaClear.setFont (new Font ("Arail", Font.PLAIN, 20));
        btnAcaClear.setBackground(Color.decode("#edc591"));
        btnAcaClear.setBounds (300, 400, 100, 30);
        btnAcaClear.setFocusable (false);
        btnAcaClear.setVisible (true);
        P2.add(btnAcaClear);

        // using JLabel component of swing package for Non-Academic Course 
        
        //JLabel and TextField for CourseID
        lblNonCourseID = new JLabel ("CourseID: ");
        lblNonCourseID.setBounds (5, 70, 120, 30);
        P3.add(lblNonCourseID);

        txtNonCourseID = new JTextField();
        txtNonCourseID.setBounds(110, 75, 120, 20);
        P3.add(txtNonCourseID);

        //JLabel and TextField for Course Name
        lblNonCourseName = new JLabel ("Course Name:");
        lblNonCourseName.setBounds (350, 70, 120, 30);
        P3.add(lblNonCourseName);

        txtNonCourseName = new JTextField();
        txtNonCourseName.setBounds (450, 75, 120, 20);
        P3.add(txtNonCourseName);
        
        //JLabel and TextField for Duration 
        lblDuration = new JLabel ("Duration: ");
        lblDuration.setBounds (5, 105, 120, 30 );
        P3.add(lblDuration);

        txtDuration = new JTextField ();
        txtDuration.setBounds (110, 110, 120, 20);
        P3.add(txtDuration);

        //JLabel and TextField for Prerequiste
        lblPrequisites = new JLabel ("Prerequisites: ");
        lblPrequisites.setBounds (350, 105, 120, 30);
        P3.add(lblPrequisites);

        txtPrerequisites = new JTextField ();
        txtPrerequisites.setBounds (450, 110, 120, 20);
        P3.add(txtPrerequisites);

        // ADD button for NON ACA Course
        btnNonAcaADD = new JButton ("Add");
        btnNonAcaADD.setFont (new Font ("Arail", Font.PLAIN, 20));
        btnNonAcaADD.setBackground(Color.decode("#edc591"));
        btnNonAcaADD.setBounds(460, 145, 100, 30 );
        btnNonAcaADD.setVisible(true);
        btnNonAcaADD.setFocusable (false);
        P3.add(btnNonAcaADD);

        //JLabel and TextField for CorseID
        lblNonCoursesID = new JLabel ("CourseID: ");
        lblNonCoursesID.setBounds (5, 220, 120, 30);
        P3.add(lblNonCoursesID);

        txtNonCoursesID = new JTextField ();
        txtNonCoursesID.setBounds (110, 225, 120, 20);
        P3.add(txtNonCoursesID);
        
        //JLabel and TextField for Course Leader
        lblNonCourseLeader = new JLabel ("Course Leader: ");
        lblNonCourseLeader.setBounds (350, 220, 120, 30);
        P3.add(lblNonCourseLeader);

        txtNonCourseLeader = new JTextField();
        txtNonCourseLeader.setBounds (450, 225, 120, 20);
        P3.add(txtNonCourseLeader);

        //JLabel and TextField for Instructor Name
        lblInstructorName = new JLabel ("Instructor Name: ");
        lblInstructorName.setBounds (5, 255, 120, 30);
        P3.add(lblInstructorName);

        txtInstructorName = new JTextField ();
        txtInstructorName.setBounds (110, 260, 120, 20);
        P3.add(txtInstructorName);
        
        //JLabel and TextField for Start Date
        lblStartDate = new JLabel ("Start Date: ");
        lblStartDate.setBounds (350, 255, 120, 30);
        P3.add(lblStartDate);

        txtStartDate = new JTextField ();
        txtStartDate.setBounds (450, 260, 120, 20);
        P3.add(txtStartDate);

        //JLabel and TextField for Completion Date
        lblNCompletionDate = new JLabel ("Completion Date: ");
        lblNCompletionDate.setBounds (5, 290, 120, 30);
        P3.add(lblNCompletionDate);

        txtNCompletionDate = new JTextField ();
        txtNCompletionDate.setBounds (110, 295, 120, 20);
        P3.add(txtNCompletionDate);

        //JLabel and TextField for Exam Date
        lblExamDate = new JLabel ("Exam Date: ");
        lblExamDate.setBounds (350, 290, 120, 30);
        P3.add(lblExamDate);

        txtExamDate = new JTextField ();
        txtExamDate.setBounds (450, 295, 120, 20);
        P3.add(txtExamDate);
        
        //Buttons for NON-Academic Courses

        // Register button for NON ACA Course
        btnNonAcaRegister = new JButton ("Register");
        btnNonAcaRegister.setFont (new Font ("Arail", Font.PLAIN, 17));
        btnNonAcaRegister.setBackground(Color.decode("#edc591"));
        btnNonAcaRegister.setBounds (460, 330, 100, 30);
        btnNonAcaRegister.setVisible (true);
        btnNonAcaRegister.setFocusable (false);
        P3.add(btnNonAcaRegister);

        //Remove button for NON ACA Course
        btnRemove = new JButton ("Remove");
        btnRemove.setFont (new Font ("Arail", Font.PLAIN, 17));
        btnRemove.setBackground(Color.decode("#edc591"));
        btnRemove.setBounds (100, 400, 100, 30);
        btnRemove.setVisible (true);
        btnRemove.setFocusable (false);
        P3.add(btnRemove);

        //Display button for NON ACA COurse
        btnNonAcaDisplay = new JButton ("Display");
        btnNonAcaDisplay.setFont (new Font ("Arail", Font.PLAIN, 17));
        btnNonAcaDisplay.setBackground(Color.decode("#edc591"));
        btnNonAcaDisplay.setBounds (250, 400, 100, 30);
        btnNonAcaDisplay.setVisible (true);
        btnNonAcaDisplay.setFocusable (false);
        P3.add(btnNonAcaDisplay);

        //CLear Button for NON ACA Course
        btnNonAcaClear = new JButton ("Clear");
        btnNonAcaClear.setFont (new Font ("Arail", Font.PLAIN, 20));
        btnNonAcaClear.setBackground(Color.decode("#edc591"));
        btnNonAcaClear.setBounds (400, 400, 100, 30);
        btnNonAcaClear.setVisible (true);
        btnNonAcaClear.setFocusable (false);
        P3.add(btnNonAcaClear);

        // Adding buttons to action Listner
        
        btnAca.addActionListener(this);
        btnHome.addActionListener(this);
        btnNonAca.addActionListener(this);
        btnBack.addActionListener(this);

        btnAcaADD.addActionListener(this);
        btnAcaRegister.addActionListener(this);
        btnAcaDisplay.addActionListener(this);
        btnAcaClear.addActionListener(this);
        btnNonAcaADD.addActionListener(this);
        btnNonAcaRegister.addActionListener(this);
        btnRemove.addActionListener(this);
        btnNonAcaDisplay.addActionListener(this);
        btnNonAcaClear.addActionListener(this);

    }
    
    
    // Making the buttons work by switching panels
    public void actionPerformed (ActionEvent e ) {
        if (e.getSource ()== btnAca)
        {
            P1.setVisible(false);
            P2.setVisible(true);
            P3.setVisible(false); 
        }

        if(e.getSource()==btnHome)
        {
            P1.setVisible(true);
            P2.setVisible(false);
            P3.setVisible(false);            
        }

        if(e.getSource()==btnNonAca)
        {
            P1.setVisible(false);
            P2.setVisible(false);
            P3.setVisible(true);
        }

        if(e.getSource()==btnBack)
        {
            P1.setVisible(true);
            P2.setVisible(false);
            P3.setVisible(false);
        }
    
        
        // Making the Add button work
        if(e.getSource()==btnAcaADD){
            //if button is pressed and fields are empty
            if
            (txtCourseID.getText().isEmpty()||
            txtCourseName.getText().isEmpty()||
            txtAcaDuration.getText().isEmpty()||
            txtLevel.getText().isEmpty()||
            txtCredit.getText().isEmpty()||
            txtNumberofAssessment.getText().isEmpty()
            )

            {                                                             
                JOptionPane.showMessageDialog(frame,"Empty Field Founds","Alert!!",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                //If fields are not empty
                String AC_ID =txtCourseID.getText();
                String AC_CN = txtCourseName.getText();
                String AC_L = txtLevel.getText();
                String AC_C = txtCredit.getText();

                int AC_D;
                int AC_NOA;

                for(Courses c:AcademicList)
                {
                    if (c.getcourseID().equals(AC_ID))
                    {

                        JOptionPane.showMessageDialog(frame,"CourseID exists Please enter another ID","Alert!!",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                try{
                    AC_D =Integer.parseInt(txtAcaDuration.getText());
                    AC_NOA= Integer.parseInt(txtNumberofAssessment.getText());
                }
                catch(Exception a){
                    JOptionPane.showMessageDialog(frame,"Please input Integer Value in duration and numberofAsessment.");
                    return;
                }
                obj1 = new AcademicCourse(AC_ID, AC_CN, AC_D, AC_L, AC_C, AC_NOA);
                AcademicList.add(obj1);
                JOptionPane.showMessageDialog(frame,"Course Successfully added");
            }
        }

        // Making the Register button work
        if(e.getSource()==btnAcaRegister){
            //if button is pressed ansd fields are empty
            if
            (txtCoursesID.getText().isEmpty()||
            txtCourseLeader.getText().isEmpty()||
            txtLecturerName.getText().isEmpty()||
            txtStartingDate.getText().isEmpty()||
            txtCompletionDate.getText().isEmpty()
            )

            {                                                             
                JOptionPane.showMessageDialog(frame,"Empty Field Founds","Alert!!",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                //If fields are not empty
                String AC_IDs =txtCoursesID.getText();
                String AC_CL = txtCourseLeader.getText();
                String AC_LN = txtLecturerName.getText();
                String AC_SD = txtStartingDate.getText();
                String AC_CD = txtCompletionDate.getText();

                for (int i = 0; i<AcademicList.size(); i++){
                    if (AcademicList.get(i).getcourseID().equals(txtCoursesID.getText()))
                    {
                        AcademicCourse AC = (AcademicCourse)(AcademicList.get(i));
                        x = x+1;

                        if (!AC.getIsRegistered()){
                            AC.Register(AC_CL, AC_LN, AC_SD, AC_CD);
                            JOptionPane.showMessageDialog(frame,"Course Successfully Registered.");
                            return;
                        }

                        if (AC.getIsRegistered()){

                            JOptionPane.showMessageDialog(frame,"Course is already registered!");
                            return;
                        }
                    }

                }

                if(x==0){
                    JOptionPane.showMessageDialog(frame,"CourseID doesn't exist");
                    return;
                }

            }
        }

        //Making the clear button work
        if (e.getSource()==btnAcaClear){
            txtCourseID.setText("");
            txtCourseName.setText("");
            txtAcaDuration.setText("");
            txtLevel.setText("");
            txtCredit.setText("");
            txtNumberofAssessment.setText("");
            txtCoursesID.setText("");
            txtCourseLeader.setText("");
            txtLecturerName.setText("");
            txtStartingDate.setText("");
            txtCompletionDate.setText("");

        }
        
        
        //For Non Academic Course
        
        // Making the Add button work
        if(e.getSource()==btnNonAcaADD){
            //if button is pressed and fields are empty
            if
            (txtNonCourseID.getText().isEmpty()||
            txtNonCourseName.getText().isEmpty()||
            txtDuration.getText().isEmpty()||
            txtPrerequisites.getText().isEmpty()
            )

            {                                                             
                JOptionPane.showMessageDialog(frame,"Empty Field Founds","Alert!!",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                //If fields are not empty
                String NAC_ID =txtNonCourseID.getText();
                String NAC_CN = txtNonCourseName.getText();
                String NAC_P = txtPrerequisites.getText();
                int NAC_D;
                

                for(Courses c:NonAcademicList)
                {
                    if (c.getcourseID().equals(NAC_ID))
                    {

                        JOptionPane.showMessageDialog(frame,"CourseID exists Please enter another ID","Alert!!",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                try{
                    NAC_D =Integer.parseInt(txtDuration.getText());
                }
                catch(Exception b){
                    JOptionPane.showMessageDialog(frame,"Please Input Integer Value in Duration! ");
                    return;
                }
                obj2 = new NonAcademicCourse(NAC_ID, NAC_CN, NAC_D, NAC_P );
                NonAcademicList.add(obj2);
                JOptionPane.showMessageDialog(frame,"Course is successfully added");
            }
        }
        
        //Making the Display button work
        
        if(e.getSource()==btnAcaDisplay){
            {
                DefaultTableModel tableModelACA = new DefaultTableModel();
                JTable table = new JTable(tableModelACA);

                //adding columns
                String column[]={"CourseID","CourseName","Duration","Level","Credit","NumberOfAssessment","CourseLeader","LecturerName","StartingDate","CompletionDate"};
                for(int i=0;i<10;i++)
                    tableModelACA.addColumn(column[i]);
                for(int i=0; i<AcademicList.size();i++)
                {
                    AcademicCourse AC = (AcademicCourse)(AcademicList.get(i));
                    String S1 =String.valueOf(AC.getcourseduration());
                    String S2 =String.valueOf(AC.getNumberofAssessments());

                    String S3[]={AC.getcourseID(),AC.getcoursename(),S1,AC.getLevel(),AC.getCredit(),S2,AC.getcourseleader(),AC.getLecturername(),AC.getStartingDate(),AC.getCompletionDate()};
                    tableModelACA.insertRow(tableModelACA.getRowCount(), S3);
                }

                Displayframe = new JFrame();
                Displayframe.setSize(800, 800);
                Displayframe.add(new JScrollPane(table));
                Displayframe.setVisible(true);
            }
        }
        
        
        // Making the Register Button work
        
        if(e.getSource()==btnNonAcaRegister){
            //if button is pressed ansd fields are empty
            if
            (txtNonCoursesID.getText().isEmpty()||
            txtNonCourseLeader.getText().isEmpty()||
            txtInstructorName.getText().isEmpty()||
            txtStartDate.getText().isEmpty()||
            txtNCompletionDate.getText().isEmpty()||
            txtExamDate.getText().isEmpty()
            )

            {                                                             
                JOptionPane.showMessageDialog(frame,"Empty Field Founds","Alert!!",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                //If fields are not empty
                String NAC_IDs =txtNonCoursesID.getText();
                String NAC_CL = txtNonCourseLeader.getText();
                String NAC_IN = txtInstructorName.getText();
                String NAC_SD = txtStartDate.getText();
                String NAC_CD = txtCompletionDate.getText();
                String NAC_ED = txtExamDate.getText();

                for (int i = 0; i<NonAcademicList.size(); i++){
                    if (NonAcademicList.get(i).getcourseID().equals(txtNonCourseID.getText()))
                    {
                        NonAcademicCourse NAC = (NonAcademicCourse)(NonAcademicList.get(i));
                        y = y+1;

                        if (!NAC.getisRegistered()){
                            NAC.register(NAC_CL, NAC_IN, NAC_SD, NAC_CD, NAC_ED);
                            JOptionPane.showMessageDialog(frame,"Course Successfully Registered.");
                            return;
                        }

                        if (NAC.getisRegistered()){

                            JOptionPane.showMessageDialog(frame,"Course is already Registered!");                            
                            return;
                        }
                    }

                }

                if(y==0){
                    JOptionPane.showMessageDialog(frame,"CourseID doesn't exist");
                    return;
                }

            }
        }
        
        // Making the Remove button work
        
        if(e.getSource()==btnRemove){
            String R=JOptionPane.showInputDialog(frame,"Enter CourseID","Remove",JOptionPane.QUESTION_MESSAGE);
            for(int i=0; i<NonAcademicList.size();i++){
                if(NonAcademicList.get(i).getcourseID().equals(R))
                {
                    NonAcademicCourse NAC = (NonAcademicCourse)(NonAcademicList.get(i));
                    if(!NAC.getisRemoved())
                    {
                        NAC.remove();
                        JOptionPane.showMessageDialog(frame,"Course is Removed");
                        return;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"CourseID doesn't Exists","!!!",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        
        //Making the Display button work
        if(e.getSource()==btnNonAcaDisplay){
            {
                DefaultTableModel tableModelNAC = new DefaultTableModel();
                JTable table = new JTable(tableModelNAC);

                //adding columns
                String column[]={"CourseID","CourseName","Duration","Prerequisite","CourseLeader","InstructorName","StartingDate","CompletionDate","ExamDate"};
                for(int i=0;i<9;i++)
                    tableModelNAC.addColumn(column[i]);
                for(int i=0; i<NonAcademicList.size();i++)
                {
                    NonAcademicCourse NAC = (NonAcademicCourse)(NonAcademicList.get(i));
                    String S4 =String.valueOf(NAC.getcourseduration());

                    String S5[]={NAC.getcourseID(),NAC.getcoursename(),S4,NAC.getprerequisite(),NAC.getcourseleader(),NAC.getInstructorname(),NAC.getStartdate(),NAC.getCompletiondate(), NAC.getExamdate()};
                    tableModelNAC.insertRow(tableModelNAC.getRowCount(), S5);
                }

                Displayframe = new JFrame();
                Displayframe.setSize(800, 800);
                Displayframe.add(new JScrollPane(table));
                Displayframe.setVisible(true);
            }
        }
        
        
        // Making the Clear buttons work
        if(e.getSource()==btnNonAcaClear){
            txtNonCourseID.setText("");
            txtNonCourseName.setText("");
            txtDuration.setText("");
            txtPrerequisites.setText("");
            txtNonCoursesID.setText("");
            txtNonCourseLeader.setText("");
            txtInstructorName.setText("");
            txtStartDate.setText("");
            txtNCompletionDate.setText("");
            txtExamDate.setText("");
        }
        
        
        
        
    }

    public static void main (String []args )
    {
        new INGCollege();

    }

}
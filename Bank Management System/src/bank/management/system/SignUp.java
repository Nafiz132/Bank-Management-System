package bank.management.system;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame{
    SignUp(){
       setLayout(null);
       Random rand=new Random();
       long random=Math.abs((rand.nextLong() % 9000L)+1000L);
        
       
     JLabel form=new JLabel("Application No : "+random);
     form.setFont(new Font("Arial",Font.BOLD,25));
     form.setBounds(300,20,610,40);
     add(form);
     
     JLabel personalInfo=new JLabel("Personal Information: Page-01");
     personalInfo.setBounds(290,80,400,30);
     personalInfo.setFont(new Font("Arial",Font.BOLD,20));
     add(personalInfo);
     
     JLabel name= new JLabel("Name : ");
     name.setBounds(100,150,250,30);
     name.setFont(new Font("Arial",Font.BOLD,20));
     add(name);
     
     JTextField nameField= new JTextField();
     nameField.setBounds(250,150,400,30);
     nameField.setFont(new Font("Arial",Font.BOLD,20));
     add(nameField);
     
     JLabel fathername= new JLabel(" Father's Name: ");
     fathername.setBounds(100,200,300,30);
     fathername.setFont(new Font("Arial",Font.BOLD,20));
     add(fathername);
     
     JTextField fatherNameField= new JTextField();
     fatherNameField.setBounds(250,200,400,30);
     fatherNameField.setFont(new Font("Arial",Font.BOLD,15));
     add(fatherNameField);
     
     JLabel dob= new JLabel("Date Of Birth : ");
     dob.setBounds(100,250,200,30);
     dob.setFont(new Font("Arial",Font.BOLD,20));
     add(dob);
     
     JDateChooser dateChooser= new JDateChooser();
     dateChooser.setBounds(250,250,400,30);
     dateChooser.setFont(new Font("Arial",Font.BOLD,20));
     add(dateChooser);
     
     JLabel gender= new JLabel("Gender : ");
     gender.setBounds(100,300,100,30);
     gender.setFont(new Font("Arial",Font.BOLD,20));
     add(gender);
     
     JRadioButton male=new JRadioButton("Male");
     male.setBounds(250,300,100,30);
     add(male);
     
     JRadioButton female=new JRadioButton("Female");
     female.setBounds(400,300,100,30);
     add(female);
     
     ButtonGroup gendergrp=new ButtonGroup();
     gendergrp.add(male);
     gendergrp.add(female);
     
     JLabel email= new JLabel("Email : ");
     email.setBounds(100,350,100,30);
     email.setFont(new Font("Arial",Font.BOLD,20));
     add(email);
     
     JTextField emailField= new JTextField();
     emailField.setBounds(250,350,400,30);
     emailField.setFont(new Font("Arial",Font.BOLD,20));
     add(emailField);
     
     JLabel maritalStatus= new JLabel("Marital Status : ");
     maritalStatus.setBounds(100,400,100,30);
     maritalStatus.setFont(new Font("Arial",Font.BOLD,15));
     add(maritalStatus);
     
     JTextField statusField= new JTextField();
     statusField.setBounds(250,400,400,30);
     statusField.setFont(new Font("Arial",Font.BOLD,20));
     add(statusField);
     
     JLabel address= new JLabel("Address : ");
     address.setBounds(100,450,100,30);
     address.setFont(new Font("Arial",Font.BOLD,20));
     add(address);
     
     JTextField addressField= new JTextField();
     addressField.setBounds(250,450,400,30);
     addressField.setFont(new Font("Arial",Font.BOLD,20));
     add(addressField);
     
     JLabel city= new JLabel("City : ");
     city.setBounds(100,500,100,30);
     city.setFont(new Font("Arial",Font.BOLD,20));
     add(city);
     
     JTextField cityField= new JTextField();
     cityField.setBounds(250,500,400,30);
     cityField.setFont(new Font("Arial",Font.BOLD,20));
     add(cityField);
     
     JLabel status= new JLabel("Status : ");
     status.setBounds(100,550,100,30);
     status.setFont(new Font("Arial",Font.BOLD,20));
     add(status);
     
     JTextField statusField1= new JTextField();
     statusField1.setBounds(250,550,400,30);
     statusField1.setFont(new Font("Arial",Font.BOLD,20));
     add(statusField1);
     
     JLabel pin= new JLabel("Pin : ");
     pin.setBounds(100,600,100,30);
     pin.setFont(new Font("Arial",Font.BOLD,20));
     add(pin);
     
     JTextField pinField= new JTextField();
     pinField.setBounds(250,600,400,30);
     pinField.setFont(new Font("Arial",Font.BOLD,20));
     add(pinField);
     
     JButton next=new JButton("Next");
     next.setBackground(Color.BLACK);
     next.setForeground(Color.WHITE);
     next.setBounds(550,650,100,30);
     add(next);
     
    setSize(800,850);
    setVisible(true);
    setLocation(200,150);
    getContentPane().setBackground(Color.WHITE);
    }
    public static void main(String[] args) {
        new SignUp();
    }

   
}


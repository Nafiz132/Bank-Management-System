package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton signup,clear,login;
    JTextField cardField;
    JPasswordField pinField;
    
    
    Login(){
    setTitle("Login Page");
     
    setLayout(null);
    
    ImageIcon iIcon=new ImageIcon(ClassLoader.getSystemResource("icons/logo1.png"));
    Image image=iIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon iIcon1=new ImageIcon(image);
    JLabel label=new JLabel(iIcon1);
    label.setBounds(40, 10,100, 100);
    add(label);
    
    JLabel text=new JLabel("Welcome TO The ATM System");
    text.setFont(new Font("Arial", Font.BOLD,30));
    text.setBounds(200,40,450,40);
    add(text);
    
    JLabel cardnum=new JLabel("Card Number :");
    cardnum.setFont(new Font("Raleway", Font.BOLD,20));
    cardnum.setBounds(120,145,150,30);
    add(cardnum);
    
    cardField=new JTextField();
    cardField.setBounds(300,145,250,30);
    cardField.setFont(new Font("Arial",Font.BOLD,15));
    add(cardField);
    
    JLabel pin=new JLabel("Enter PIN:");
    pin.setFont(new Font("Raleway", Font.BOLD,20));
    pin.setBounds(120,200,450,40);
    add(pin);
    
    pinField=new JPasswordField();
    pinField.setBounds(300,200,250,30);
    pinField.setFont(new Font("Arial",Font.BOLD,15));
    add(pinField);
    
    login= new JButton("SIGN IN");
    login.setBounds(300,250,100,25);
    login.setBackground(Color.DARK_GRAY);
    login.setForeground(Color.WHITE);
    login.addActionListener(this);
    add(login);
    
    clear= new JButton("CLEAR");
    clear.setBounds(450,250,100,25);
    clear.setBackground(Color.DARK_GRAY);
    clear.setForeground(Color.WHITE);
    clear.addActionListener(this);
    add(clear);
    
    signup= new JButton("SIGN UP");
    signup.setBounds(300,300,250,25);
    signup.setBackground(Color.DARK_GRAY);
    signup.setForeground(Color.WHITE);
    signup.addActionListener(this);
    add(signup);
    
    
    setSize(800,500);
    setVisible(true);
    setLocation(300,200);
    getContentPane().setBackground(Color.WHITE);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardField.setText("");
            pinField.setText("");
        }
        else if(ae.getSource()==login){
            
        }
        else if (ae.getSource()==signup){
            
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}

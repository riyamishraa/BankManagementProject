package bank.management.system;
import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;
    JTextField textField1;
    JPasswordField passwordField;

    JButton b1,b2,b3;
    login(){
        super("BANK MANAGEMENT SYSTEM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon i11= new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image i21= i11.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i31= new ImageIcon(i21);
        JLabel image1 = new JLabel(i31);
        image1.setBounds(630,350,100,100);
        add(image1);



        label1 = new JLabel("WELCOME TO THE BANK");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font(Font.SERIF,Font.BOLD,35));
        label1.setBounds(210,125,450,35);
        add(label1);


        label2 = new JLabel("CARD NUMBER");
        label2.setFont(new Font(Font.SERIF,Font.BOLD,20));
        label2.setForeground(Color.BLACK);
        label2.setBounds(150,200,375,30);
        add(label2);


        textField1 = new JTextField(15);
        textField1.setBounds(325,200,230,25);
        textField1.setFont(new Font(Font.SERIF,Font.BOLD,14));
        add(textField1);

        label3= new JLabel("PIN");
        label3.setFont(new Font(Font.SERIF,Font.BOLD,20));
        label3.setForeground(Color.BLACK);
        label3.setBounds(150,265,375,30);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325,265,230,25);
        passwordField.setFont(new Font(Font.SERIF,Font.BOLD,14));
        add(passwordField);

        b1= new JButton("SIGN IN");
        b1.setFont(new Font(Font.SERIF,Font.BOLD,14));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(300,320,100,30);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("CLEAR");
        b2.setFont(new Font(Font.SERIF,Font.BOLD,14));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(430,320,100,30);
        b2.addActionListener(this);
        add(b2);

        b3= new JButton("SIGN UP");
        b3.setFont(new Font(Font.SERIF,Font.BOLD,14));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(300,370,230,30);
        b3.addActionListener(this);
        add(b3);

        ImageIcon ii1= new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image ii2= ii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0,0,850,480);
        add(iimage);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
                conn c= new conn();
                String cardno =  textField1.getText();
                String pin = passwordField.getText();
                String q = "SELECT * FROM login WHERE CARD_NUMBER ='"+cardno+"' and PIN ='"+pin+"'";
                ResultSet resultSet =c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }
                else{
                    JOptionPane.showMessageDialog(null,"INVALID CARD NUMBER OR PIN ");
                }
            }
            else if(e.getSource()==b2){
                textField1.setText("");
                passwordField.setText("");

            }
            else if(e.getSource()==b3){
                new signup();
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
      new login();
    }
}

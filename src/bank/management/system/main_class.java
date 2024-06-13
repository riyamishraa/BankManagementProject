package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_class(String pin){
        this.pin=pin;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("PLEASE SELECT YOUR TRANSACTION");
        label.setBounds(450,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font(Font.SERIF,Font.BOLD,18));
        l3.add(label);

        b1= new JButton("DEPOSIT");
        b1.setForeground(Color.BLACK);
        b1.setBackground(new Color(162,208,217));
        b1.addActionListener(this);
        b1.setBounds(406,274,150,25);
        l3.add(b1);

        b2= new JButton("CASH WITHDRAW");
        b2.setForeground(Color.BLACK);
        b2.setBackground(new Color(162,208,217));
        b2.addActionListener(this);
        b2.setBounds(700,274,150,25);
        l3.add(b2);

        b3= new JButton("FAST CASH");
        b3.setForeground(Color.BLACK);
        b3.setBackground(new Color(162,208,217));
        b3.addActionListener(this);
        b3.setBounds(406,318,150,25);
        l3.add(b3);

        b4= new JButton("MINI STATEMENT");
        b4.setForeground(Color.BLACK);
        b4.setBackground(new Color(162,208,217));
        b4.addActionListener(this);
        b4.setBounds(700,318,150,25);
        l3.add(b4);

        b5= new JButton("PIN CHANGE");
        b5.setForeground(Color.BLACK);
        b5.setBackground(new Color(162,208,217));
        b5.addActionListener(this);
        b5.setBounds(406,365,150,25);
        l3.add(b5);

        b6= new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.BLACK);
        b6.setBackground(new Color(162,208,217));
        b6.addActionListener(this);
        b6.setBounds(700,365,150,25);
        l3.add(b6);

        b7= new JButton("EXIT");
        b7.setForeground(Color.BLACK);
        b7.setBackground(new Color(162,208,217));
        b7.addActionListener(this);
        b7.setBounds(700,410,150,25);
        l3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new deposit(pin);
            setVisible(false);
        }
        else if(e.getSource()==b2){
            new cash_withdraw(pin);
            setVisible(false);
        }
        else if(e.getSource()==b3){
            new fast_cash(pin);
            setVisible(false);
        }
        else if(e.getSource()==b4){
            new mini_statement(pin);
            setVisible(false);
        }
        else if(e.getSource()==b5){
            new pin_change(pin);
            setVisible(false);
        }
        else if(e.getSource()==b6){
            new balance_enquiry(pin);
            setVisible(false);
        }
        else if(e.getSource()==b7){
            System.exit(0);
        }



        try{

        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new main_class("");

    }
}

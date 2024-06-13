package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {
    TextField textField;
    JButton b1,b2;
    String pin;
    deposit(String pin){
        this.pin=pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT TO BE DEPOSITED");
        label1.setFont(new Font(Font.SERIF,Font.BOLD,18));
        label1.setBounds(470,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);


        textField = new TextField();
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font(Font.SERIF,Font.BOLD,18));
        textField.setBackground(new Color(162, 208, 217));
        textField.setForeground(Color.BLACK);
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(162,208,217));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(162,208,217));
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        String amount = textField.getText();
        Date date = new Date();
        if(e.getSource()==b1){
            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE AMOUNT YOU WANT TO DEPOSIT");
            }
            else{
                conn c= new conn();
                c.statement.executeUpdate("INSERT INTO bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs."+ amount + " DEPOSITED SUCCSSFULLY");
                new main_class(pin);
                setVisible(false);
            }
        }else if(e.getSource()==b2){
            setVisible(false);
            new main_class(pin);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new deposit("");
    }
}

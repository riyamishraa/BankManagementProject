package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class cash_withdraw extends JFrame implements ActionListener {
    TextField textField;
    JButton b1,b2;
    String pin;
    cash_withdraw(String pin){
        this.pin = pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS Rs. 10,000");
        label1.setFont(new Font(Font.SERIF,Font.BOLD,18));
        label1.setBounds(465,180,700,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setFont(new Font(Font.SERIF,Font.BOLD,18));
        label2.setBounds(470,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);


        textField = new TextField();
        textField.setBounds(460,260,330,25);
        textField.setFont(new Font(Font.SERIF,Font.BOLD,18));
        textField.setBackground(new Color(162, 208, 217));
        textField.setForeground(Color.BLACK);
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
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
        if(e.getSource()==b1){
        try{
            String amount = textField.getText();
            Date date = new Date();
            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE AMOUNT");
            }
            else{
                conn c= new conn();
                ResultSet resultSet = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '"+pin+"'");
                int balance = 0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if(balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"INSUFFICIENT BALANCE");
                    return;
                }

                c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','cash_withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" DEBITED SUCCESSFULLY");
                setVisible(false);
                new main_class(pin);
            }
        }catch(Exception E){
            E.printStackTrace();
        }}
        else if(e.getSource()==b2){
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new cash_withdraw("");
    }
}

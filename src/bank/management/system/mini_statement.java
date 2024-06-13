package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini_statement extends JFrame implements ActionListener {
    String pin;
    JButton button;
    mini_statement(String pin) {
        this.pin= pin;
        setLayout(null);
        setSize(400,600);
        setVisible(true);
        setLocation(20,20);
        getContentPane().setBackground(new Color(255,204,204));


        JLabel label1= new JLabel();
        label1.setBounds(20,140,400,400);
        add(label1);

        JLabel label2 = new JLabel("TRANSACTION STATEMENT");
        label2.setFont(new Font(Font.SERIF,Font.BOLD,15));
        label2.setBounds(100,20,400,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,520,300,20);
        label4.setFont(new Font(Font.SERIF,Font.BOLD,15));
        add(label4);

        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number:  "+ resultSet.getString("CARD_NUMBER").substring(0,4) + "XXXXXXXX"+ resultSet.getString("CARD_NUMBER").substring(12));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

        try{
            int balance =0;
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){

                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("YOUR  TOTAL  BALANCE  IS  Rs. "+ balance);



        }catch(Exception e){
            e.printStackTrace();
        }

        button= new JButton("EXIT");
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        button.setBounds(300,520,70,25);
        button.addActionListener(this);
        add(button);

//   setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new mini_statement("");
    }
}

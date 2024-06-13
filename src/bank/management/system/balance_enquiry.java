package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balance_enquiry extends JFrame implements ActionListener {
    JLabel label2;
    JButton b1;
    String pin;

    balance_enquiry(String pin){
        this.pin = pin;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("YOUR CURRENT IS Rs. ");
        label1.setFont(new Font(Font.SERIF,Font.BOLD,18));
        label1.setBounds(430,180,700,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font(Font.SERIF,Font.BOLD,18));
        label2.setBounds(430,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        b1 = new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(162,208,217));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        int balance =0;
        try{
            conn c = new conn();
            ResultSet resultSet= c.statement.executeQuery("SELECT * FROM bank WHERE pin ='"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }
        }catch(Exception E ){
            E.printStackTrace();
        }
        label2.setText(""+balance);





        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);

    }

    public static void main(String[] args) {
        new balance_enquiry("");

    }
}

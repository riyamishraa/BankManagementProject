package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    signup3(String formno){

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,30,100,100);
        add(image);

        this.formno= formno;


        JLabel label4= new JLabel("Page 3");
        label4.setBounds(300,60,600,22);
        label4.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(label4);

        JLabel label5= new JLabel("ACCOUNT DETAILS");
        label5.setBounds(300,80,600,40);
        label5.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(label5);

        JLabel l1= new JLabel("ACCOUNT TYPE :");
        l1.setBounds(100,200,200,30);
        l1.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(l1);
        r1 = new JRadioButton("SAVING");
        r1.setBounds(350,200,100,25);
        r1.setFont(new Font(Font.SERIF,Font.BOLD,16));
        r1.setBackground(new Color(150, 218, 209));
        add(r1);

        r2 = new JRadioButton("FIXED DEPOSIT");
        r2.setBounds(450,200,200,25);
        r2.setFont(new Font(Font.SERIF,Font.BOLD,16));
        r2.setBackground(new Color(150, 218, 209));
        add(r2);

        r3 = new JRadioButton("CURRENT");
        r3.setBounds(350,240,120,25);
        r3.setFont(new Font(Font.SERIF,Font.BOLD,16));
        r3.setBackground(new Color(150, 218, 209));
        add(r3);

        r4 = new JRadioButton("RECURRING DEPOSIT");
        r4.setBounds(450,240,200,25);
        r4.setFont(new Font(Font.SERIF,Font.BOLD,16));
        r4.setBackground(new Color(150, 218, 209));
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l2= new JLabel("CARD NUMBER :");
        l2.setBounds(100,290,200,30);
        l2.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(l2);

        JLabel l3= new JLabel("(YOUR 16-DIGIT CARD NUMBER)");
        l3.setBounds(100,315,200,30);
        l3.setFont(new Font(Font.SERIF,Font.BOLD,10));
        add(l3);

        JLabel l4= new JLabel("XXXX-XXXX-XXXX-4841");
        l4.setBounds(350,290,250,30);
        l4.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(l4);

        JLabel l5= new JLabel("(IT WOULD APPEAR ON ATM CARD/CHEQUE BOOK AND STATEMENT)");
        l5.setBounds(350,315,300,30);
        l5.setFont(new Font(Font.SERIF,Font.BOLD,10));
        add(l5);


        JLabel l6= new JLabel("PIN :");
        l6.setBounds(100,365,200,30);
        l6.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(l6);

        JLabel l7= new JLabel("XXXX");
        l7.setBounds(350,365,200,30);
        l7.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(l7);

        JLabel l8= new JLabel("(4-DIGIT PASSWORD)");
        l8.setBounds(100,390,300,30);
        l8.setFont(new Font(Font.SERIF,Font.BOLD,10));
        add(l8);


        JLabel l9= new JLabel("SERVICE REQUIRED :");
        l9.setBounds(100,440,250,30);
        l9.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(l9);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(150,218,209));
        c1.setFont(new Font(Font.SERIF,Font.BOLD,16));
        c1.setBounds(350,440,200,30);
        add(c1);
        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(new Color(150,218,209));
        c2.setFont(new Font(Font.SERIF,Font.BOLD,16));
        c2.setBounds(550,440,200,30);
        add(c2);
        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(new Color(150,218,209));
        c3.setFont(new Font(Font.SERIF,Font.BOLD,16));
        c3.setBounds(350,480,200,30);
        add(c3);
        c4 = new JCheckBox("EMAIL ALERTS");
        c4.setBackground(new Color(150,218,209));
        c4.setFont(new Font(Font.SERIF,Font.BOLD,16));
        c4.setBounds(550,480,200,30);
        add(c4);
        c5 = new JCheckBox("E-STATEMENT");
        c5.setBackground(new Color(150,218,209));
        c5.setFont(new Font(Font.SERIF,Font.BOLD,16));
        c5.setBounds(350,520,200,30);
        add(c5);
        c6 = new JCheckBox("CHEQUE BOOK");
        c6.setBackground(new Color(150,218,209));
        c6.setFont(new Font(Font.SERIF,Font.BOLD,16));
        c6.setBounds(550,520,200,30);
        add(c6);

        JCheckBox c7= new JCheckBox("I HEREBY DECLARE THAT THE ABOVE ENTERED DETAILS ARE CORRECT TO MY KNOWLEDGE.",true);
        c7.setBackground(new Color(150,218,209));
        c7.setFont(new Font(Font.SERIF,Font.BOLD,12));
        c7.setBounds(100,580,700,25);
        add(c7);

        JLabel l10 = new JLabel("FORM NO :");
        l10.setFont(new Font(Font.SERIF,Font.BOLD,16));
        l10.setBounds(600,10,100,30);
        add(l10);

        JLabel l11 = new JLabel(formno);
        l11.setFont(new Font(Font.SERIF,Font.BOLD,16));
        l11.setBounds(700,10,60,30);
        add(l11);

        s = new JButton("SUBMIT");
        s.setFont(new Font(Font.SERIF,Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(270,640,100,25);
        s.addActionListener(this);
        add(s);

        c = new JButton("CANCEL");
        c.setFont(new Font(Font.SERIF,Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(470,640,100,25);
        c.addActionListener(this);
        add(c);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(150, 218, 209));
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actype = null;
        if(r1.isSelected()){
            actype="SAVING";
        }
        else if (r2.isSelected()){
            actype="FIXED DEPOSIT";
        }
        else if (r3.isSelected()){
            actype="CURRENT";
        }
        else if(r4.isSelected()){
            actype="RECURRING DEPOSIT";
        }
        Random ran =new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac="ATM CARD";
        }
        else if(c2.isSelected()){
            fac="INTERNET BANKING";
        }
        else if(c3.isSelected()){
            fac="MOBILE BANKING";
        }
        else if(c4.isSelected()){
            fac="EMAIL ALERTS";
        }
        else if(c5.isSelected()){
            fac="E-STATEMENT";
        }
        else if(c6.isSelected()){
            fac="CHEQUE BOOK";
        }
        try{
            if(e.getSource()==s){
                if(actype==null || actype.isEmpty()){
                    JOptionPane.showMessageDialog(null,"FILL ALL THE DETAILS");
                }
                else{
                    conn c1= new conn();
                    String q1 ="INSERT INTO signup3 values ('"+formno+"','"+actype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 ="INSERT INTO login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"CARD NUMBER : "+cardno+"\n PIN : "+pin);
                    new deposit(pin);
                    setVisible(false);
                }
            } else if(e.getSource()==c){
                System.exit(0);

            }
        }catch(Exception E){
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new signup3("");


    }
}


package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textpan,textadhaar;
    JRadioButton r1,r2,e1,e2;

    JButton next;

    signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,30,100,100);
        add(image);
        this.formno = formno;

        JLabel label4= new JLabel("Page 2");
        label4.setBounds(300,60,600,22);
        label4.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(label4);

        JLabel label5= new JLabel("ADDITIONAL DETAILS");
        label5.setBounds(300,80,600,40);
        label5.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(label5);

        JLabel l3 = new JLabel("RELIGION :");
        l3.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l3.setBounds(100,200,150,30);
        add(l3);

        String religion[]={"HINDU","SIKH","MUSLIM","CHRISTIAN","OTHER"};
        comboBox= new JComboBox(religion);
        comboBox.setBackground(Color.WHITE);
        comboBox.setFont(new Font(Font.SERIF,Font.BOLD,14));
        comboBox.setBounds(350,200,320,25);
        add(comboBox);


        JLabel l4 = new JLabel("CATEGORY :");
        l4.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l4.setBounds(100,250,150,30);
        add(l4);


        String category[]={"GENERAL","OBC","SC","ST","OTHER"};
        comboBox2= new JComboBox(category);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setFont(new Font(Font.SERIF,Font.BOLD,14));
        comboBox2.setBounds(350,250,320,25);
        add(comboBox2);


        JLabel l5 = new JLabel("INCOME :");
        l5.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l5.setBounds(100,300,150,30);
        add(l5);

        String income[]={"0","1,50,000","<2,50,000","5,00,000","UPTO 10,00,000","ABOVE 10,00,000"};
        comboBox3= new JComboBox(income);
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setFont(new Font(Font.SERIF,Font.BOLD,14));
        comboBox3.setBounds(350,300,320,25);
        add(comboBox3);

        JLabel l6 = new JLabel("EDUCATION :");
        l6.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l6.setBounds(100,350,150,30);
        add(l6);

        String education[]={"NON-GRADUATE","GRADUATE","POST-GRADUATE","MASTERS","OTHER"};
        comboBox4= new JComboBox(education);
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setFont(new Font(Font.SERIF,Font.BOLD,14));
        comboBox4.setBounds(350,350,320,25);
        add(comboBox4);

        JLabel l7 = new JLabel("OCCUPATION :");
        l7.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l7.setBounds(100,400,150,30);
        add(l7);

        String ocupation[]={"SALARIED","SELF-EMPLOYED","BUSSINESS","STUDENT","RETIRED","OTHER"};
        comboBox5= new JComboBox(ocupation);
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setFont(new Font(Font.SERIF,Font.BOLD,14));
        comboBox5.setBounds(350,400,320,25);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN NUMBER :");
        l8.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l8.setBounds(100,450,150,30);
        add(l8);

        textpan= new JTextField();
        textpan.setBackground(Color.WHITE);
        textpan.setFont(new Font(Font.SERIF,Font.BOLD,14));
        textpan.setBounds(350,450,320,25);
        add(textpan);


        JLabel l9 = new JLabel("ADHAAR NUMBER :");
        l9.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l9.setBounds(100,500,200,30);
        add(l9);

        textadhaar= new JTextField();
        textadhaar.setBackground(Color.WHITE);
        textadhaar.setFont(new Font(Font.SERIF,Font.BOLD,14));
        textadhaar.setBounds(350,500,320,25);
        add(textadhaar);

        JLabel l10 = new JLabel("SENIOR CITIZEN :");
        l10.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l10.setBounds(100,550,200,30);
        add(l10);

        r1= new JRadioButton("YES");
        r1.setBackground(new Color(150, 218, 209));
        r1.setFont(new Font(Font.SERIF,Font.BOLD,14));
        r1.setBounds(350,550,85,25);
        add(r1);


        r2= new JRadioButton("NO");
        r2.setBackground(new Color(150, 218, 209));
        r2.setFont(new Font(Font.SERIF,Font.BOLD,14));
        r2.setBounds(450,550,85,25);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel l11 = new JLabel("EXISTING ACCOUNT :");
        l11.setFont(new Font(Font.SERIF,Font.BOLD,20));
        l11.setBounds(100,600,250,30);
        add(l11);

        e1= new JRadioButton("YES");
        e1.setBackground(new Color(150, 218, 209));
        e1.setFont(new Font(Font.SERIF,Font.BOLD,14));
        e1.setBounds(350,600,85,25);
        add(e1);


        e2= new JRadioButton("NO");
        e2.setBackground(new Color(150, 218, 209));
        e2.setFont(new Font(Font.SERIF,Font.BOLD,14));
        e2.setBounds(450,600,85,25);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel l12 = new JLabel("FORM NO :");
        l12.setFont(new Font(Font.SERIF,Font.BOLD,16));
        l12.setBounds(670,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font(Font.SERIF,Font.BOLD,16));
        l13.setBounds(770,10,60,30);
        add(l13);


        next = new JButton("NEXT");
        next.setFont(new Font(Font.SERIF,Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(670,630,80,30);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(150, 218, 209));
        setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = textpan.getText();
        String adhaar = textadhaar.getText();
        String scitizen = " ";
        if(r1.isSelected()){
            scitizen="YES";
        }
        else if (r2.isSelected()){
            scitizen="NO";
        }
        String eaccount = " ";
        if(r1.isSelected()){
            eaccount="YES";
        }
        else if (r2.isSelected()){
            eaccount="NO";
        }
        try{
            if(textpan.getText().equals("") || textadhaar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"FILL ALL THE DETAILS");
            }
            else{
                conn c1= new conn();
                String q = "INSERT INTO signup2 values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhaar+"','"+scitizen+"','"+eaccount+"')";
                c1.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"DETAILS ADDED SUCCESSFULLY");
                new signup3(formno);
                setVisible(false);
            }
        }catch(Exception E){

        }


    }

    public static void main(String[] args){
        new signup2("");
    }

}

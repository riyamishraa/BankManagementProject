package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;

    JTextField name,fname, email,phone,add,city,pin,state;
    JDateChooser dateChooser;
    JButton next;


    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000l;
    String first = " " +Math.abs(first4);


    signup(){
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1= new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font(Font.SERIF,Font.BOLD,38));
        add(label1);

        JLabel label2= new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(label2);

        JLabel label3= new JLabel("PERSONAL DETAILS");
        label3.setBounds(260,100,600,30);
        label3.setFont(new Font(Font.SERIF,Font.BOLD,20));
        add(label3);

        JLabel labelname= new JLabel("NAME :");
        labelname.setBounds(100,190,100,30);
        labelname.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(labelname);

        name = new JTextField();
        name.setFont(new Font(Font.SERIF,Font.BOLD,14));
        name.setBounds(300,190,300,25);
        add(name);

        JLabel fathername = new JLabel("FATHER'S NAME :");
        fathername.setBounds(100,240,200,30);
        fathername.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(fathername);

        fname = new JTextField();
        fname.setFont(new Font(Font.SERIF,Font.BOLD,14));
        fname.setBounds(300,240,300,25);
        add(fname);

        JLabel dob = new JLabel("DATE OF BIRTH :");
        dob.setBounds(100,290,200,30);
        dob.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,300,25);
        add(dateChooser);


        JLabel gender= new JLabel("GENDER :");
        gender.setBounds(100,340,100,30);
        gender.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(gender);

        r1 = new JRadioButton("MALE");
        r1.setBounds(300,340,85,25);
        r1.setFont(new Font(Font.SERIF,Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setBounds(450,340,90,25);
        r2.setFont(new Font(Font.SERIF,Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelemail= new JLabel("EMAIL :");
        labelemail.setBounds(100,390,100,30);
        labelemail.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(labelemail);


        email = new JTextField();
        email.setFont(new Font(Font.SERIF,Font.BOLD,14));
        email.setBounds(300,390,300,25);
        add( email);

        JLabel labelphone= new JLabel("PHONE :");
        labelphone.setBounds(100,440,100,30);
        labelphone.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(labelphone);


        phone = new JTextField();
        phone.setFont(new Font(Font.SERIF,Font.BOLD,14));
        phone.setBounds(300,440,300,25);
        add( phone);

        JLabel ms= new JLabel("MARITAL STATUS :");
        ms.setBounds(100,490,200,30);
        ms.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(ms);


        m1 = new JRadioButton("MARRIED");
        m1.setBounds(300,490,100,25);
        m1.setFont(new Font(Font.SERIF,Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2 = new JRadioButton("UNMARRIED");
        m2.setBounds(410,490,120,25);
        m2.setFont(new Font(Font.SERIF,Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        add(m2);


        m3 = new JRadioButton("OTHER");
        m3.setBounds(540,490,100,25);
        m3.setFont(new Font(Font.SERIF,Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        add(m3);




        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labeladd= new JLabel("ADDRESS :");
        labeladd.setBounds(100,540,100,30);
        labeladd.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(labeladd);


        add = new JTextField();
        add.setFont(new Font(Font.SERIF,Font.BOLD,14));
        add.setBounds(300,540,300,25);
        add(add);


        JLabel labelcity= new JLabel("CITY :");
        labelcity.setBounds(100,590,100,30);
        labelcity.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add( labelcity);


        city = new JTextField();
        city.setFont(new Font(Font.SERIF,Font.BOLD,14));
        city.setBounds(300,590,300,25);
        add(city);

        JLabel labelpin= new JLabel("PINCODE :");
        labelpin.setBounds(100,640,100,30);
        labelpin.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add( labelpin);

        pin  = new JTextField();
        pin.setFont(new Font(Font.SERIF,Font.BOLD,14));
        pin.setBounds(300,640,300,25);
        add(pin);

        JLabel labelstate= new JLabel("STATE :");
        labelstate.setBounds(100,690,100,30);
        labelstate.setFont(new Font(Font.SERIF,Font.BOLD,18));
        add(labelstate);

        state  = new JTextField();
        state.setFont(new Font(Font.SERIF,Font.BOLD,14));
        state.setBounds(300,690,300,25);
        add(state);

        next = new JButton("NEXT");
        next.setFont(new Font(Font.SERIF,Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String myname = name.getText();
        String fathername =fname.getText();
        String mydob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String mygender = null;
        if(r1.isSelected()){
            mygender="MALE";
        }
        else if (r2.isSelected()){
            mygender="FEMALE";
        }
        String myemail= email.getText();
        String myphone = phone.getText();
        String marital= null;
        if(m1.isSelected()){
            marital="MARRIED";
        }
        else if(m2.isSelected()){
            marital="UNMARRIED";

        }
        else{
            marital="OTHER";
        }

        String address = add.getText();
        String mycity= city.getText();
        String pincode = pin.getText();
        String mystate = state.getText();

        try{
            if(name.getText().equals("")||fname.getText().equals("")||email.getText().equals("")||mydob.equals("")||email.getText().equals("")||phone.getText().equals("")||marital==null||mygender==null||add.getText().equals("")||city.getText().equals("")||pin.getText().equals("")||state.getText().equals("")){

                JOptionPane.showMessageDialog(null,"FILL ALL THE FIELDS");
            }
            else{
                conn con1 = new conn();
                String q = "insert into signup values('"+formno+"','"+myname+"','"+fathername+"','"+mydob+"','"+mygender+"','"+myemail+"','"+myphone+"','"+marital+"','"+address+"','"+mycity+"','"+pincode+"','"+mystate+"')";
                con1.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"DEATLS ADDED SUCCESSFULLY");
                new signup2(first);
                setVisible(false);

            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new signup();
    }
}

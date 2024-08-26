package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {
    JButton b1, b2, b3,b4,b5,b6,b7;

    String pin_password;
    Main_Class(String password){
        this.pin_password  = password;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);


        JLabel label = new JLabel("PLease Select Your Transcation");
        label.setForeground(Color.WHITE);
        label.setBounds(430,180,700,35);
        label.setFont(new Font("System" , Font.BOLD , 28));
        l3.add(label);


        b1 = new JButton("Deposit");
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("System",Font.BOLD, 14));
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        l3.add(b1);



        b2 = new JButton("Cash Withdraw");
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("System",Font.BOLD, 14));
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,155,35);
        b2.addActionListener(this);
        l3.add(b2);



        b3 = new JButton("Fast Cash");
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("System",Font.BOLD, 14));
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        l3.add(b3);



        b4 = new JButton("Mini Statement");
        b4.setFont(new Font("System",Font.BOLD, 14));
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,318,155,35);
        b4.addActionListener(this);
        l3.add(b4);


        b5 = new JButton("PIN Change");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,362,150,35);
        b5.setFont(new Font("System",Font.BOLD, 14));
        b5.addActionListener(this);
        l3.add(b5);


        b6 = new JButton("Balance Enquiry");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setFont(new Font("System",Font.BOLD, 14));
        b6.setBounds(700,362,155,35);
        b6.addActionListener(this);
        l3.add(b6);


        b7 = new JButton("Exit");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,406,155,35);
        b7.setFont(new Font("System",Font.BOLD, 14));
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            new Deposit(pin_password);
            setVisible(false);
        }else if (e.getSource() == b7){
            System.exit(0);
        } else if(e.getSource() == b2) {
            new Withdrawal(pin_password);
            setVisible(false);
        } else if (e.getSource() == b6) {
            new Balance_Enquiry(pin_password);
            setVisible(false);
        } else if(e.getSource() == b3) {
            new FastCash(pin_password);
            setVisible(false);
        } else if (e.getSource() == b5) {
            new ChangePin(pin_password);
            setVisible(false);
        } else if (e.getSource() == b4 ) {
            new Mini_Statement(pin_password);
            setVisible(false);
            
        }

    }

    public static void main(String[] args) {
        new   Main_Class("");
    }
}



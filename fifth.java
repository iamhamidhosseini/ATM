import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fifth implements ActionListener {
    JFrame frame = new JFrame();
    JTextField f1 = new JTextField();
    JTextField f2 = new JTextField();
    JLabel t1 = new JLabel("مبلغ مورد نظر را وارد کنید:");
    JLabel t2 = new JLabel("شماره کارت مقصد را وراد کنید:");
    JLabel t3 = new JLabel("Enter The Desired Amount:");
    JLabel t4 = new JLabel("Enter The Destination Card Number:");
    JButton sabt = new JButton("ثبت");
    JButton confirm = new JButton("Confirm");
    Font font = new Font("Fixedsys Regular",Font.BOLD,20);


    fifth(){
        //set frame
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);

        //set keys
        sabt.setBounds(350,600,300,80);sabt.setFocusable(false);sabt.addActionListener(this);
        confirm.setBounds(350,600,300,80);confirm.setFocusable(false);confirm.addActionListener(this);
        sabt.setFont(font);confirm.setFont(font);

        //set textfield
        f1.setBounds(320,200,350,50);f1.setFont(font);frame.add(f1);
        f2.setBounds(320,350,350,50);f2.setFont(font);frame.add(f2);

        // set text
        t1.setBounds(410,130,300,50);t1.setFont(font);
        t2.setBounds(390,280,300,50);t2.setFont(font);
        t3.setBounds(370,120,300,50);t3.setFont(font);
        t4.setBounds(322,280,400,50);t4.setFont(font);

        // Set (if) for frame for each language that user want
        if (number.counter==1){
            frame.add(t1);
            frame.add(t2);
            frame.add(sabt);
        }
        if (number.counter==0){
            frame.add(t3);
            frame.add(t4);
            frame.add(confirm);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        seventh x = new seventh();
    }
}

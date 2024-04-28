import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sixth implements ActionListener {
    JFrame frame = new JFrame();
    JLabel t1 = new JLabel("موجودی شما : 56350000");
    JLabel t2 = new JLabel("Your bank account balance is : 56350000");
    JButton b1 = new JButton("تایید");
    JButton b2 = new JButton("Confirm");
    Font font = new Font("Fixedsys Regular", Font.BOLD, 20);

    sixth(){
        //set frame
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);

        //set keys
        b1.setBounds(340,400,300,80);b1.setFocusable(false);b1.addActionListener(this);
        b2.setBounds(340,400,300,80);b2.setFocusable(false);b2.addActionListener(this);
        b1.setFont(font);b2.setFont(font);

        //set texts
        t1.setBounds(400,220,300,50);t1.setFont(font);
        t2.setBounds(300,220,400,50);t2.setFont(font);

        // Set (if) for frame for each language that user want
        if (number.counter==1){
            frame.add(t1);
            frame.add(b1);
        }
        if (number.counter==0){
            frame.add(t2);
            frame.add(b2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        seventh x = new seventh();
    }
}

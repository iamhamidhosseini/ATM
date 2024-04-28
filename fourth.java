import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fourth implements ActionListener {
    JFrame frame = new JFrame();
    JLabel text1 = new JLabel("رمز جدید را وارد کنید :");
    JLabel text2 = new JLabel("Please Enter New Password :");
    JTextField textField = new JTextField();
    JButton tayeed = new JButton("تایید");
    JButton confirm = new JButton("Confirm");
    Font font = new Font("Fixedsys Regular", Font.BOLD, 20);

    fourth() {
        // set frame
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);

        //set button
        tayeed.setBounds(400, 400, 200, 80);tayeed.setFocusable(false);tayeed.addActionListener(this);
        confirm.setBounds(400, 400, 200, 80);confirm.setFocusable(false);confirm.addActionListener(this);
        tayeed.setFont(font);confirm.setFont(font);

        //set textfield
        textField.setBounds(350,300,300,50);textField.setFont(font);frame.add(textField);

        //set text
        text1.setBounds(420,220,300,50);text1.setFont(font);
        text2.setBounds(365,220,300,50);text2.setFont(font);

        // Set (if) for frame for each language that user want
        if (number.counter==1){
            frame.add(text1);
            frame.add(tayeed);
        }
        if (number.counter==0){
            frame.add(text2);
            frame.add(confirm);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        seventh x = new seventh();
    }
}

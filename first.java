import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first implements ActionListener {
    JFrame frame = new JFrame();
    JButton sabt = new JButton("ثبت");
    JButton sabt2 = new JButton("Submit");
    JTextField textField = new JTextField();
    Font font = new Font("Fixedsys Regular", Font.BOLD, 20);
    first() {
        //set button
        sabt.setBounds(375, 650, 200, 80);
        sabt.setFont(font);
        sabt.setFocusable(false);
        sabt.addActionListener(this);
        sabt2.setBounds(375, 650, 200, 80);
        sabt2.setFont(font);
        sabt2.setFocusable(false);
        sabt2.addActionListener(this);

        // set frame
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);

        // set textfield
            textField = new JTextField();textField.setBounds(250,150,480,60);textField.setFont(font);
            frame.add(textField);

        // Set (if) for frame for each language that user want
        if(number.counter==1) {
            frame.add(sabt);
            JLabel text = new JLabel("رمز خود را وارد کنید");text.setBounds(421,0,200,200);
            text.setFont(font);
            frame.add(text);
        }
        if(number.counter==0) {
            frame.add(sabt2);
            JLabel text = new JLabel("Please enter password");text.setBounds(390,0,300,200);
            text.setFont(font);
            frame.add(text);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        seconde x = new seconde();
    }
}

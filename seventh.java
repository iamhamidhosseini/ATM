import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class seventh implements ActionListener {

    JFrame frame = new JFrame();
    JLabel text1 , text2 ;
    Font font = new Font("Fixedsys Regular",Font.BOLD,20);
    JButton x1 = new JButton("خدانگهدار");
    JButton x2 = new JButton("عملیات جدید");
    JButton y1 = new JButton("Good Bye");
    JButton y2 = new JButton("New Mission");



    seventh(){
        //set frame
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);

        //set text
        text1 = new JLabel("عملیات با موفقیت انجام شد!");
        text1.setFont(font);text1.setBounds(400,250,400,100);
        text2 = new JLabel("Mission Accomplished Successfully!");text2.setFont(font);
        text2.setBounds(300,250,400,100);

        // set keys
        x1.setBounds(5,400,300,80);x1.setFocusable(false);x1.addActionListener(this);
        x2.setBounds(680,400,300,80);x2.setFocusable(false);x2.addActionListener(this);
        y1.setBounds(5,400,300,80);y1.setFocusable(false);y1.addActionListener(this);
        y2.setBounds(680,400,300,80);y2.setFocusable(false);y2.addActionListener(this);
        x1.setFont(font);x2.setFont(font);y1.setFont(font);y2.setFont(font);

        // Set (if) for frame for each language that user want
        if (number.counter==1){
            frame.add(text1);frame.add(x1);frame.add(x2);
        }
        if (number.counter==0){
            frame.add(text2);frame.add(y1);frame.add(y2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==x1 || e.getSource()==y1){
            frame.dispose();
        }
        if (e.getSource()==x2 || e.getSource()==y2){
            frame.dispose();
            seconde x = new seconde();
        }
    }
}

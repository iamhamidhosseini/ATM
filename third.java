import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class third implements ActionListener {
    JFrame frame = new JFrame();
    JButton m1 = new JButton("500/000");
    JButton m2 = new JButton("1/000/000");
    JButton m3 = new JButton("1/500/000");
    JButton m4 = new JButton("2/000/000");
    Font font = new Font("Fixedsys Regular",Font.BOLD,20);

    third(){
        //set keys
        m1.setBounds(5,200,200,80);m1.setFocusable(false);m1.addActionListener(this);
        m2.setBounds(5,400,200,80);m2.setFocusable(false);m2.addActionListener(this);
        m3.setBounds(778,200,200,80);m3.setFocusable(false);m3.addActionListener(this);
        m4.setBounds(778,400,200,80);m4.setFocusable(false);m4.addActionListener(this);
        m1.setFont(font);m2.setFont(font);m3.setFont(font);m4.setFont(font);

        //set frame
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);

        // I don't need to set (if) here again ,so I just need adding keys to frame
        frame.add(m1);
        frame.add(m2);
        frame.add(m3);
        frame.add(m4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        seventh x = new seventh();
    }
}

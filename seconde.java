import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class seconde implements ActionListener {
    JFrame frame = new JFrame();

    // I used two keys for each content because we have 2 types of languages

    JButton money1 = new JButton("برداشت وجه");
    JButton money2 = new JButton("Get Cash");
    JButton pass1 = new JButton("تغییر رمز");
    JButton pass2 = new JButton("Change password");
    JButton inv1 = new JButton("اعلام موجودی");
    JButton inv2 = new JButton("Inventory Announcement");
    JButton card1 = new JButton("کارت به کارت");
    JButton card2 = new JButton("Money Transfer");

    Font font = new Font("Fixedsys Regular",Font.BOLD,20);

    seconde(){
        //set keys
        money1.setBounds(5,200,300,80);money1.setFocusable(false);money1.addActionListener(this);
        money2.setBounds(5,200,300,80);money2.setFocusable(false);money2.addActionListener(this);
        pass1.setBounds(675,200,300,80);pass1.setFocusable(false);pass1.addActionListener(this);
        pass2.setBounds(675,200,300,80);pass2.setFocusable(false);pass2.addActionListener(this);
        card1.setBounds(5,400,300,80);card1.setFocusable(false);card1.addActionListener(this);
        card2.setBounds(5,400,300,80);card2.setFocusable(false);card2.addActionListener(this);
        inv1.setBounds(675,400,300,80);inv1.setFocusable(false);inv1.addActionListener(this);
        inv2.setBounds(675,400,300,80);inv2.setFocusable(false);inv2.addActionListener(this);
        money1.setFont(font);money2.setFont(font);pass1.setFont(font);pass2.setFont(font);card1.setFont(font);
        card2.setFont(font);inv1.setFont(font);inv2.setFont(font);

        //set frame
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.CYAN);


        // Set (if) for frame for each language that user want
        if (number.counter==1){
            frame.add(money1);frame.add(pass1);frame.add(card1);frame.add(inv1);
        }
        if (number.counter==0){
            frame.add(money2);frame.add(pass2);frame.add(card2);frame.add(inv2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==money1 || e.getSource()==money2){
            frame.dispose();
            third x = new third();
        }
        if (e.getSource()==pass1 || e.getSource()==pass2){
            frame.dispose();
            fourth x = new fourth();
        }
        if (e.getSource()==card1 || e.getSource()==card2){
            frame.dispose();
            fifth x = new fifth();
        }
        if (e.getSource()==inv1 || e.getSource()==inv2){
            frame.dispose();
            sixth x = new sixth();
        }
    }
}

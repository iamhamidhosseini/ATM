import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM implements ActionListener{

    JFrame frame = new JFrame("Hamid's ATM");
    JButton farsi = new JButton("فارسی");
    JButton english = new JButton("English");
    Font font = new Font("Fixedsys Regular",Font.BOLD,20);



    ATM(){
        // set buttons
            farsi.setBounds(778,300,200,40);
            farsi.setFont(font);
            farsi.setFocusable(false);
            farsi.addActionListener(this);
            english.setBounds(5,300,200,40);
            english.setFont(font);
            english.setFocusable(false);
            english.addActionListener(this);

        // set frame
            frame.add(farsi);frame.add(english);
            frame.setDefaultCloseOperation(3);
            frame.setSize(1000,800);
            frame.setLayout(null);
            frame.getContentPane().setBackground(Color.CYAN);
            frame.setVisible(true);

            JLabel text1 = new JLabel("Choose language");
            JLabel text2 = new JLabel("زبان خود را انتخاب کنید");
            text1.setBounds(220,295,200,50);text1.setFont(font);
            text2.setBounds(600,295,200,50);text2.setFont(font);

            frame.add(text1);frame.add(text2);



    }
    public static void main(String[] args) {
        ATM atm = new ATM();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==farsi) {
            frame.dispose();
            number.counter = 1 ;
            first x = new first();
        }
        if(e.getSource()==english){
            frame.dispose();
            number.counter = 0 ;
            first x = new first();
        }
    }
}
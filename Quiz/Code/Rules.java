import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{

    String Name;
    JButton back,start;

    Rules(String Name)
    {
        this.Name = Name;

        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        JLabel rule1 = new JLabel("Welcome  " + Name + "  to  Mind  Hacks !");
        rule1.setBounds(50,20,700,40);
        rule1.setForeground(Color.WHITE);
        rule1.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        add(rule1);

        //Creating Rules Tab
        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setForeground(Color.WHITE);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Answer only once per question and wait for the next question to appear before responding again." + "<br><br>" +
                "3. Choose the best-fitting option as your final answer; changes after selection won't be allowed." + "<br><br>" +
                "4. Select your answer before the timer runs out to ensure your response is counted." + "<br><br>" +
                "5. Avoid external help or resources during the quiz to maintain fair play and accuracy." + "<br><br>" +
                "6. Double-check your answer before confirming, as there will be no corrections once submitted." + "<br><br>" +
                "7. Enjoy the quiz and have fun while testing your knowledge!" + "<br><br>" +
            "<html>"
        );
            
        add(rules);


        //Creating Start And Back Buttons
        back = new JButton("BACK");
        back.setBounds(250,500,100,30);
        back.setFont(new Font("Roman Time",Font.BOLD,15));
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);//Adding action to take after clicking
        add(back);

        start = new JButton("START");
        start.setBounds(400,500,100,30);
        start.setFont(new Font("Roman Time",Font.BOLD,15));
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);//Adding action to take after clicking
        add(start);


        setLocation(350,100);
        setSize(800,650);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == start)
        {
            new Quiz(Name);

        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
            new Login();
        }
    }


    public static void main(String args[])
    {
        new Rules("USER");

    }
}
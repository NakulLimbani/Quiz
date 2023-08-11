import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener
{
    Score(String Name , int score)
    {
        getContentPane().setBackground(Color.WHITE);

        //Setting Size of frame
        setBounds(400,150,700,550);
        setLayout(null);

        
        //Adding Quiz Image Icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBackground(Color.DARK_GRAY);
        image.setBounds(0,200,300,250);
        add(image);

        setVisible(true);


        //Creating Lable For Thanking quote
        JLabel heading = new JLabel("Thank You " + Name + " For Playing Mind Hacks !");
        heading.setBounds(27,50,700,50);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("ALGERIAN", Font.BOLD , 26));
        add(heading);


        JLabel heading1 = new JLabel("Hope You Enjoyed Playing !");
        heading1.setBounds(126,100,650,50);
        heading1.setForeground(Color.BLACK);
        heading1.setFont(new Font("ALGERIAN", Font.BOLD , 27));
        add(heading1);



        //Creating Label for Displaying Score
        JLabel disScore = new JLabel("Your Score Is : " + score + " Marks !");
        disScore.setBounds(315,250,350,30);
        disScore.setForeground(Color.BLACK);
        disScore.setFont(new Font("DIALOG", Font.BOLD , 27));
        add(disScore);

        //Creating PLAY AGAIN Button
        JButton submit = new JButton("PLAY AGAIN");
        submit.setBounds(342,330,280,30);
        submit.setFont(new Font("Tahoma",Font.BOLD ,24));
        submit.setBackground((Color.BLUE));
        submit.setForeground((Color.WHITE));
        submit.addActionListener(this);
        add(submit);    
        setVisible(true);

                

    }

    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();

    }

    
    public static void main(String args[])
    {
        new Score("USER" , 0);
    }

}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Creating Public class Login
public class Login extends JFrame implements ActionListener{

    //Declaring Global Variable
    JButton rules;
    JButton back;
    JTextField Tname;

    //Constructor Of Login Class
    Login()
    {
        //Changing Color Of Background Panel
        getContentPane().setBackground(Color.DARK_GRAY);


        //Changing Default layout location to NULL for customizing 
        setLayout(null);


        //Importing Image For Home Page
        ImageIcon I = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));
        JLabel image = new JLabel(I);
        add(image);
        image.setBounds(0,0,600,500);


        //Creating Title For Quiz
        JLabel heading = new JLabel("Mind Hacks!");
        heading.setBounds(775,60,300,50);
        heading.setForeground(Color.cyan);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,45));
        add(heading);

        //Creating Name Label  
        JLabel name = new JLabel("Enter Your Name:");
        name.setBounds(810,150,300,30);
        name.setForeground(Color.cyan);
        name.setFont(new Font("Algerian",Font.BOLD,20));
        add(name);

        //Creating TextField To Enter Name.
        Tname = new JTextField();
        Tname.setBounds(785,200,250,18);
        Tname.setFont(new Font("Time Zone",Font.BOLD,15));
        add(Tname);

        //Creating Button For "RULES".
        rules = new JButton("RULES");
        rules.setBounds(785,250, 90,20);
        rules.setFont(new Font("Roman Time",Font.BOLD,15));
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);//Adding action after clicking 
        add(rules);

        //Creating Button For "BACK".
        back = new JButton("BACK");
        back.setBounds(955,250, 80,20);
        back.setFont(new Font("Roman Time",Font.BOLD,15));
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);//Adding action to take after clicking
        add(back);


        //Setting JFrame Layout 
        setSize(1200, 500);
        setLocation(200,150);
        setVisible(true);
        

    }
    // Creating A void function for ActionListener
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == rules)
        {
            String Name = Tname.getText();
            setVisible(false);
            new Rules(Name);
            

        }
        else if(ae.getSource() == back)
        {
            setVisible(false);

        }

    }
    public static void main(String args[])
    {
        //Object For Login Class
        new Login();

    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener
{

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswer[][] = new String[10][1];

    JLabel qno , question;
    JRadioButton option1 , option2 , option3 , option4;
    ButtonGroup groupoptions;
    JButton next , LifeLine , submit;

    //Time Limit Per Question
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String Name;


    Quiz(String Name)
        {
            this.Name = Name;   
            //Changing Frame Background Colour
            getContentPane().setBackground(Color.DARK_GRAY);

            //Setting Size of frame
            setBounds(50,0,1440,825);
            
            setLayout(null);

            
            //Adding Quiz Image Icon
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz.jpg"));
            JLabel image = new JLabel(i1);
            image.setBounds(0,0,1440,382);
            add(image);


            //Creating Lable For question numbers
            qno = new JLabel();
            qno.setBounds(100, 450, 50, 30);
            qno.setForeground(Color.WHITE);
            qno.setFont(new Font("TAHOMA", Font.BOLD , 23));
            add(qno);

            //Creating Label for displaying Question Text
            question = new JLabel();
            question.setBounds(150,450,900,30);
            question.setForeground((Color.WHITE));
            question.setFont(new Font("TAHOMA" , Font.PLAIN , 24));
            add(question);

            //Creating RadioButton For 4 Options
            option1 = new JRadioButton();
            option1.setBounds(170,520,700,30);
            option1.setBackground(Color.DARK_GRAY);
            option1.setForeground((Color.WHITE));
            option1.setFont(new Font("Dialog" , Font.PLAIN , 20));
            add(option1);

            option2 = new JRadioButton();
            option2.setBounds(170,560,700,30);
            option2.setBackground(Color.DARK_GRAY);
            option2.setForeground((Color.WHITE));
            option2.setFont(new Font("Dialog" , Font.PLAIN , 20));
            add(option2);

            option3 = new JRadioButton();
            option3.setBounds(170,600,700,30);
            option3.setBackground(Color.DARK_GRAY);
            option3.setForeground((Color.WHITE));
            option3.setFont(new Font("Dialog" , Font.PLAIN , 20));
            add(option3);

            option4 = new JRadioButton();
            option4.setBounds(170,640,700,30);
            option4.setBackground(Color.DARK_GRAY);
            option4.setForeground((Color.WHITE));
            option4.setFont(new Font("Dialog" , Font.PLAIN , 20));
            add(option4);


            //Creating Group Of RadioButtons of all options
            groupoptions = new ButtonGroup();
            groupoptions.add(option1);
            groupoptions.add(option2);
            groupoptions.add(option3);
            groupoptions.add(option4);

            //Creating Buttons For NEXT , SUBMIT
            next = new JButton("NEXT");
            next.setBounds(1100,550,200,40);
            next.setFont(new Font("Tahoma",Font.BOLD ,24));
            next.setBackground((Color.BLUE));
            next.setForeground((Color.WHITE));
            next.addActionListener(this);
            add(next);

            LifeLine = new JButton("LIFELINE");
            LifeLine.setBounds(1100,630,200,40);
            LifeLine.setFont(new Font("Tahoma",Font.BOLD ,24));
            LifeLine.setBackground((Color.BLUE));
            LifeLine.setForeground((Color.WHITE));
            LifeLine.addActionListener(this);
            add(LifeLine);

            submit = new JButton("SUBMIT");
            submit.setBounds(1100,710,200,40);
            submit.setFont(new Font("Tahoma",Font.BOLD ,24));
            submit.setBackground((Color.BLUE));
            submit.setForeground((Color.WHITE));
            submit.addActionListener(this);
            submit.setEnabled(false);
            add(submit);
    


            //Questions For The Quiz
            questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
            questions[0][1] = "JVM";
            questions[0][2] = "JDB";
            questions[0][3] = "JDK";
            questions[0][4] = "JRE";

            questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
            questions[1][1] = "int";
            questions[1][2] = "Object";
            questions[1][3] = "long";
            questions[1][4] = "void";

            questions[2][0] = "Which package contains the Random class?";
            questions[2][1] = "java.util package";
            questions[2][2] = "java.lang package";
            questions[2][3] = "java.awt package";
            questions[2][4] = "java.io package";

            questions[3][0] = "An interface with no fields or methods is known as?";
            questions[3][1] = "Runnable Interface";
            questions[3][2] = "Abstract Interface";
            questions[3][3] = "Marker Interface";
            questions[3][4] = "CharSequence Interface";

            questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
            questions[4][1] = "Stack";
            questions[4][2] = "String memory";
            questions[4][3] = "Random storage space";
            questions[4][4] = "Heap memory";

            questions[5][0] = "Which of the following is a marker interface?";
            questions[5][1] = "Runnable interface";
            questions[5][2] = "Remote interface";
            questions[5][3] = "Readable interface";
            questions[5][4] = "Result interface";

            questions[6][0] = "Which keyword is used for accessing the features of a package?";
            questions[6][1] = "import";
            questions[6][2] = "package";
            questions[6][3] = "extends";
            questions[6][4] = "export";

            questions[7][0] = "In java, jar stands for?";
            questions[7][1] = "Java Archive Runner";
            questions[7][2] = "Java Archive";
            questions[7][3] = "Java Application Resource";
            questions[7][4] = "Java Application Runner";

            questions[8][0] = "Which of the following is a mutable class in java?";
            questions[8][1] = "java.lang.StringBuilder";
            questions[8][2] = "java.lang.Short";
            questions[8][3] = "java.lang.Byte";
            questions[8][4] = "java.lang.String";

            questions[9][0] = "Which of the following option leads to the portability and security of Java?";
            questions[9][1] = "Bytecode is executed by JVM";
            questions[9][2] = "The applet makes the Java code secure and portable";
            questions[9][3] = "Use of exception handling";
            questions[9][4] = "Dynamic binding between objects";	
            

            //Answers To The Above Questions
            answers[0][1] = "JDB";
            answers[1][1] = "int";
            answers[2][1] = "java.util package";
            answers[3][1] = "Marker Interface";
            answers[4][1] = "Heap memory";
            answers[5][1] = "Remote interface";
            answers[6][1] = "import";
            answers[7][1] = "Java Archive";
            answers[8][1] = "java.lang.StringBuilder";
            answers[9][1] = "Bytecode is executed by JVM";


            //creating START Function
            start(count);

            //Setting Components as visible in frame
            setVisible(true);

            


        }




        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource() == next)
            {
                repaint();

                //Enable all options in next question
                option1.setEnabled(true);
                option2.setEnabled(true);
                option3.setEnabled(true);
                option4.setEnabled(true);

                ans_given = 1;
                //Taking Value of Option Selected
                if(groupoptions.getSelection() == null)
                {
                    useranswer[count][0] = "";
                }
                else
                {
                    useranswer[count][0] = groupoptions.getSelection().getActionCommand();
                }
                

                if(count == 8)
                {
                    next.setEnabled(false);
                    submit.setEnabled(true);
                
                }

                count++;
                start(count);

            }
            else if(ae.getSource() == LifeLine)
            {
                if(count == 2 || count == 4 || count == 6 ||count == 8 ||count == 9)
                {
                    option2.setEnabled(false);
                    option3.setEnabled(false);
                }
                else
                {
                    option1.setEnabled(false);
                    option4.setEnabled(false);
                }

                //Disable LifeLine After One use
                LifeLine.setEnabled(false);

            }
            else if(ae.getSource() == submit)   
            {
                ans_given = 1;

                //Taking Value of Option Selected
                if(groupoptions.getSelection() == null)
                {
                    useranswer[count][0] = "";
                }
                else
                {
                    useranswer[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for(int i=0; i <useranswer.length; i++)
                {
                    if(useranswer[i][0].equals(answers[i][1]))
                    {
                        score += 10;
                    }
                    else
                    {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(Name,score);
                
                       
            
            }

        }       




        //Defining Paint(inbuilt) function
        public void paint(Graphics g)
        {
            //Creating Main Graphic base for timer
            super.paint(g);

            //Setting timer attributes
            String time = "Time Left : " + timer + " seconds";
            g.setColor(Color.RED);
            g.setFont(new Font("TIMER" , Font.BOLD , 25));
            

            //Setting working of timer
            if(timer > 0)
            {
                g.drawString(time, 1100, 500);
            }
            else
            {
                g.drawString("TIMES UP !", 1100, 500);
            }
            timer--; //Decreasing Times in seconds

            //Using try___catch creating interval of 1 second in Timer
            try
            {
                Thread.sleep(1000);
                repaint();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }


            //Checking Whether User Selected any opt or not
            if(ans_given == 1)//If User select any option
            {
                ans_given = 0;//Reset Flag For Next question
                timer = 15; //Reset Timer For next question

            }
            else if(timer < 0) // If User not gives any answer
            {
                timer = 15; //Reset Timer

                //enable all options for next question
                option1.setEnabled(true);
                option2.setEnabled(true);
                option3.setEnabled(true);
                option4.setEnabled(true);

                if(count == 8)
                {
                    next.setEnabled(false);
                    submit.setEnabled(true);
                
                }

                //Clicking SUBMIT Button
                if(count == 9)
                {
                    //Taking Value of Option Selected
                    if(groupoptions.getSelection() == null)
                    {
                        useranswer[count][0] = "";
                    }
                    else
                    {
                        useranswer[count][0] = groupoptions.getSelection().getActionCommand();
                    }

                    for(int i = 0; i < useranswer.length;  i++)
                    {
                        if(useranswer[i][0].equals(answers[i][1]))
                        {
                            score += 10;
                        }
                        else
                        {
                            score += 0;
                        }

                    }
                    setVisible(false);
                    new Score(Name,score);
                    
                }
                //Clicking NEXT Button
                else
                {
                    //Taking Value of Option Selected
                    if(groupoptions.getSelection() == null)
                    {
                        useranswer[count][0] = "";
                    }
                    else
                    {
                        useranswer[count][0] = groupoptions.getSelection().getActionCommand();
                    }
                    count++;
                    start(count);
                }
            }
           
        }




        public void start(int count)
        {
            //Writing Question number and text
            qno.setText("" + (count + 1) + ")");
            question.setText(questions[count][0]);

            //displaying options and setting values of ActionCommand when option is selected
            option1.setText(questions[count][1]);
            option1.setActionCommand(questions[count][1]);

            option2.setText(questions[count][2]);
            option2.setActionCommand(questions[count][2]);

            option3.setText(questions[count][3]);
            option3.setActionCommand(questions[count][3]);

            option4.setText(questions[count][4]);
            option4.setActionCommand(questions[count][4]);

            //Clearing Selected option for next question    
            groupoptions.clearSelection();

        }
    

    public static void main(String args[])
    {
        new Quiz("USER");
        
        
    }

}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class CalculatorGUI extends JFrame{

    private JButton button1 = new JButton("+");
    private JButton button2 = new JButton("-");
    private JButton button3 = new JButton("*");
    private JButton button4 = new JButton("/");
    private JButton button5 = new JButton(""); // later for =
    private JButton button6 = new JButton("reset");

    private JTextField input1 = new JTextField("",5);
    private JTextField input2 = new JTextField("",5);

    private JLabel label1 = new JLabel("Input:");
    private JLabel label2 = new JLabel("Output:");
    private JLabel label3 = new JLabel("");
    private JLabel label4 = new JLabel("");


    
    //Konstruktor for SimleGUI
    public CalculatorGUI(){
        super("Simple Example"); // for the super class of JFrame
        this.setBounds(150,150,600,500); //Position and size of the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close everything

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6,2,2,2));
        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(label4);

        container.add(input1);
        container.add(input2);

        button1.addActionListener(new ButtonEventListener());
        button2.addActionListener(new ButtonEventListener());
        button3.addActionListener(new ButtonEventListener());
        button4.addActionListener(new ButtonEventListener());
        button5.addActionListener(new ButtonEventListener());
        button6.addActionListener(new ButtonEventListener());

        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        container.add(button5);
        container.add(button6);

    }

    class ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
           try{
            
            float res;
            
            float i1 = Float.parseFloat(input1.getText()); //convert the input1 from string to integer
            float i2 = Float.parseFloat(input2.getText()); //convert the input2 from string to integer
            // label3.setText(input1.getText()); //show the output in label 3, that is what you entered
           // mathematical calculation
            if(e.getSource()==button1 ){                
                res = i1+i2;
                String a = "The Result is " + res; //convert back integer to string 
                label4.setText(a); //show the output of a in label 4
            }

            if(e.getSource()==button2){                
                
                res = i1-i2;
                String a = "The Result is " + res; //convert back integer to string 
                label4.setText(a); //show the output of a in label 4
            }
        
            if(e.getSource()==button3){                

                res = i1*i2;
                String a = "The Result is " + res; //convert back integer to string 
                label4.setText(a); //show the output of a in label 4
            }

            if(e.getSource()==button4){                

                res = i1/i2;
                String a = "The Result is " + res; //convert back integer to string 
                label4.setText(a); //show the output of a in label 4
            }

           /* 
           if(e.getSource()==button5)
            {
                
          
            }
           */ 

            if(e.getSource()==button6)
            {
                label3.setText(null);
                label4.setText(null);
                input1.setText(null);
                input2.setText(null);
            }

  
           } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Something is wrong");
           }

        }
        
    }
}

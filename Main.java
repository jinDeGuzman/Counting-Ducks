import javax.swing.*;
import java.awt.event.*;//this enables events
import java.awt.*;
public class Main
{
  public static void main(String args[])
  {
    JFrame frame1 = new JFrame("This is a JFrame");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Must have this line
    frame1.setSize(500,500);
    frame1.setVisible(true);

    //PAnel to HOLD THE BUTTONS
    JPanel panel1 = new JPanel(new GridLayout(2,2, 20, 20));

    //Button
    JButton button1 = new JButton("Click me");
    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Yay You Called ME :^D");
      }//end the block of what button will do
    });//end the action listener

    //Button 2
    JButton button2 = new JButton("NO CLICK ME");
    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Thanks Pal");
      }//end what button does
    });//end the action listener

    panel1.add(button1);
    panel1.add(button2);
    frame1.getContentPane().add(panel1);
  }//end main method
}//end class Main
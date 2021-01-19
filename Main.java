import javax.swing.*;
import java.awt.event.*;//this enables events

public class Main
{
  public static void main(String args[])
  {
    JFrame frame1 = new JFrame("This is a JFrame");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Must have this line
    frame1.setSize(500,500);
    frame1.setVisible(true);

    //Button
    JButton button1 = new JButton("Click me");
    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Yay You Called ME :^D");
      }//end the block of what button will do
    });//end the action listener

    frame1.add(button1);
    frame1.setVisible(true);
  }//end main method
}//end class Main
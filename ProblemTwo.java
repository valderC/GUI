import javax.swing.*;
import java.awt.*;


//not thath SplatPanel and Circle are both part of same program
public class ProblemTwo
{
   //-----------------------------------------------------------------
   //  program to dipslay a circle filled with black color initally 
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
	   
      JFrame frame = new JFrame("Filled Circle Program!");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      
      
      frame.getContentPane().add(new CircleCreator());
      frame.pack();
      frame.setVisible(true);
   }
}





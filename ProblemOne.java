import java.util.Random;

import javax.swing.JOptionPane;

public class ProblemOne
{
   //-----------------------------------------------------------------
   //  Determines if the value input by the user is even or odd.
   //  Uses multiple dialog boxes for user interaction.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
	    
      String numStr, result;
      int num, again;
      
      do 
      {
    	  
       Random rand = new Random();
   	   int one = rand.nextInt(6);
   	   int two = rand.nextInt(6);
    	  //this will prompt to ask the user to enter the product of two randomly generated integers 0 to 5 
         numStr = JOptionPane.showInputDialog("What is the result this mutliplication?\n\t " + one + " * " + two);
         
         //value that is entered by the user
         num = Integer.parseInt(numStr);
         
         if(num == (one*two)) {
         result = "The answer is right";
         }
         else
        	 result  ="That is incorrect, the acutal product is  " + (one*two);
        	 
         JOptionPane.showMessageDialog(null, result);
         
         //will prompt user to go again
         
         again = JOptionPane.showConfirmDialog(null, "Do you want to try again?");
      }
      while (again == JOptionPane.YES_OPTION);
   }
}
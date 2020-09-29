
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


//not that this is still part of problem 2 
public class CircleCreator extends JPanel
{
   private Circle circle1, circle2, circle3, circle4;
   private JRadioButton redB, yellowB, greenB;

   //-----------------------------------------------------------------
   //  Constructor: Creates five Circle objects.
   //-----------------------------------------------------------------
   public CircleCreator()
   {
	   //the four potential circles that can be displayed along with the starting black circle
      circle1 = new Circle(100, Color.black, 150, 50);
      circle2 = new Circle(100, Color.red, 150, 50);
      circle3 = new Circle(100, Color.yellow, 150, 50);
      circle4 = new Circle(100, Color.green, 150, 50);
      
      //the three radio buttons that will be displayed, displays buttons by setting visibility to true
      redB = new JRadioButton("red", true);
      yellowB = new JRadioButton("yellow", true);
      greenB = new JRadioButton("green", true);
      
      ButtonGroup group = new ButtonGroup();
      group.add(redB);
      group.add(yellowB);
      group.add(greenB);

      //will be used to dictate what will happen when each of the buttons get clicked on
      //unable to get logic to work so commented it out along with class
      
      //CircleListener listener = new CircleListener();
      //redB.addActionListener(listener);
      //yellowB.addActionListener(listener);
      //greenB.addActionListener(listener);

      add(redB);
      add(yellowB);
      add(greenB);

      
     //sets the size of the panel and the background color to white to start off
      setPreferredSize(new Dimension(400, 200));
      setBackground(Color.white);
   }
 //-----------------------------------------------------------------
   //  Draws this panel by requesting that each circle draw itself.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);

      circle1.draw(page);
      //circle2.draw(page);
      //circle3.draw(page);
      //circle4.draw(page);
   }
   
   //should paint second circle only when called
   public void paintComponent2(Graphics page)
   {
  
      circle2.draw(page);
      
   }
   
   //should paint third circle only when called
   public void paintComponent3(Graphics page)
   {
     
      circle3.draw(page);
      
   }
   
   //should paint fourth circle only when called 
   public void paintComponent4(Graphics page)
   {
     
      circle4.draw(page);
   }
   
   /* This is where I was unable to get the logic right
    
    import java.awt.event.ActionListener;
   
   private class CircleListener implements ActionListener
      {
         //--------------------------------------------------------------
         This should change the color of the filled circle depending on which radio button gets chosen
         //--------------------------------------------------------------
          
         public void actionPerformed(ActionEvent event)
         
         {
            Object source = event.getSource();

            if (source == redB)
               circle2 = paintComponent2();
               
            else
               if (source == yellowB)
                  circle3 = paintComponent3();
                  
               else
               	if (source == greenB)
                  circle4 = paintComponent4();
                  
                  else
                  	Circle1 = paintComponent();
         }
      }
      */

}




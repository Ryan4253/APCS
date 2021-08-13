/**
 * This is a lab to show recursion with fun fractals ;)
 * Hope you enjoy it. If you do not. Shoot me an email
 * delgadomatac@tas.tw
 *
 * @author Dr. Carlos Delgado
 *         Taipei American School
 *         
 * @version March 2019
 *  
 *  updated April 2021
 */
import java.awt.Color;
public class TestCrossRecursion
{
    

   // This is the recursive method 
   public static void drawCross (int x, int y, int size, int n) {
       
     // this is where you solve the problem :)
     // Happy coding.
     // Glory, Glory Man United tm

   	if(n == 0){
   		return;
   	}

   	StdDraw.line(x-size/2, y, x+size/2, y);
   	StdDraw.line(x, y+size/2, x, y-size/2);

   	drawCross(x+size/2, y, size/2, n-1);
   	drawCross(x-size/2, y, size/2, n-1);
   	drawCross(x, y+size/2, size/2, n-1);
   	drawCross(x, y-size/2, size/2, n-1);

   



   }

      
   // entry point for you drawing method.
   
   public static void drawCross () {

       int x=0;
       int y=0;
       int size=512;
       String s=javax.swing.JOptionPane.showInputDialog("This is gone be amazing!\n(c) Dr DM 2019\nGlory Glory Man United.\nWhich depth ?"); 
       int depth = Integer.parseInt(s);

      // call the recursive method with starting values.
       drawCross(x,y,size,depth);

       javax.swing.JOptionPane.showMessageDialog(null,"That's all folks!");
       
   }
   
   
   // method to initialize StdDraw
   // Change 
   public static void initializeStdDraw() {
       StdDraw.setCanvasSize (1024,1024);
       StdDraw.setXscale(-850,850);
       StdDraw.setYscale(-850,850);  
       //StdDraw.enableDoubleBuffering();  
       // uncomment previous line if you want a smooth animation.
       // you would also need to have these two calls after you draw the lines
       // StdDraw.show()
       // StdDraw.pause(ms);   /// Where ms are milliseconds (it can be zero)
       // how thick you want the line to be
       StdDraw.setPenRadius(0.001);
       // choose the color
       StdDraw.setPenColor (StdDraw.RED);

    }
    
   public static void main (String [] args) {

        
       initializeStdDraw();
       drawCross();
       
    }
}

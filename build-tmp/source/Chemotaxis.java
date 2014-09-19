import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] Philip; 
 public void setup()   
 {     
    size(500,500);
    Philip = new Bacteria[150];
    for(int b = 0; b < Philip.length; b++)
    {
      Philip[b] = new Bacteria();
    }
 }

 public void draw()   
 { 
   background(0);
   for(int b = 0; b < Philip.length; b++)
   {
      Philip[b].move();
      Philip[b].show();
   }
   
 } 

 public void mouseClicked()
 {
 	int myX = mouseX;
 	int myY = mouseY;
 	fill(255);
  	ellipse(myX, myY, 20, 20);
  	println("Hi");
 }

 class Bacteria    
 {     
 	int bacX, bacY;
 	int [] colour; 
 	Bacteria()
 	{
 	 	bacX = (int)(Math.random()*500);
 	 	bacY = (int)(Math.random()*500);
 	 	colour = new int [3];
 	 	for (int b = 0; b < colour.length; b++) 
 	 	{
 	 		colour[b] = (int)(Math.random()*256);
 	 	}

 	}

 	public void move()
 	{
            if(bacY > 480)
            {
              bacX = bacX + (int)(Math.random()*10-5);
              bacY = bacY + (int)(Math.random()*19-19);
            }
            else if (bacX > 480)
            {
              bacX = bacX + (int)(Math.random()*19-19);
              bacY = bacY + (int)(Math.random()*10-5);
            }
            else if (bacX < 20)
            {
              bacX = bacX + (int)(Math.random()*19+1);
              bacY = bacY + (int)(Math.random()*10-5);
            }
            else if (bacY < 20)
            {
              bacX = bacX + (int)(Math.random()*10-5);
              bacY = bacY + (int)(Math.random()*19+1);
            }
            else
            {
              bacX = bacX + (int)(Math.random()*10-5);
              bacY = bacY + (int)(Math.random()*10-5);
            }
 		
 	}

 	public void show()
 	{
 		fill(colour[0], colour[1], colour[2]);
  	 	ellipse(bacX, bacY, 20, 20);
 	} 

 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

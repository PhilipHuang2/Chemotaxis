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
Lysol Peter;
public void setup()   
 {     
    size(500,500);
    Philip = new Bacteria[150];
    for(int b = 0; b < Philip.length; b++)
    {
      Philip[b] = new Bacteria();
    }
    Peter = new Lysol(); 
}

 public void draw()   
 { 
   background(0);
   for(int b = 0; b < Philip.length; b++)
   {
      Philip[b].move();
      Philip[b].show();
   }
   Peter.show();
   Peter.dissapear();
   
   
 } 

 public void mouseClicked()
 {
 	Peter.appear();
 	Peter.grow();

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
 		strokeWeight(1);
 		fill(colour[0], colour[1], colour[2]);
  	 	ellipse(bacX, bacY, 20, 20);
 	} 

 } 
 class Lysol
 {
  	int myX, myY, size;

 	Lysol()
 	{
 		myX = -100;
 		myY = -100;
 		size = 0;
 	}

 	public void show()
 	{
 	 	fill(255);
 	 	noStroke();
  	 	ellipse(myX, myY, size, size);
  	 	if(size >= 1)
  	 	{
 	 	  	size=size+3;
  	 	}
 	}

 	public void appear()
 	{
 		myX = mouseX;
 		myY = mouseY;
 	}

 	public void grow()
 	{
 		size = 1;
 	}

 	public void dissapear()
 	{
 		if(size >= 120 )
 		{
 	  	 	myX = -100;
 		 	myY = -100;
 		 	size = 0;
 		}
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

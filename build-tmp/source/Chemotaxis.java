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

 //declare bacteria variables here   
 public void setup()   
 {     
 	size(500,500);
 	//initialize bacteria variables here   
 }

 public void draw()   
 {    
 	//move and show the bacteria   
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
 		bacX = bacX + (int)(Math.random()*2-1);
 		bacY = bacY + (int)(Math.random()*2-1);
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

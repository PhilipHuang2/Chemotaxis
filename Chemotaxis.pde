 //declare bacteria variables here   
 void setup()   
 {     
 	size(500,500);
 	//initialize bacteria variables here   
 }

 void draw()   
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

 	void move()
 	{
 		bacX = bacX + (int)(Math.random()*2-1);
 		bacY = bacY + (int)(Math.random()*2-1);
 	}

 	void show()
 	{
 		fill(colour[0], colour[1], colour[2]);
  	 	ellipse(bacX, bacY, 20, 20);
 	} 

 }    
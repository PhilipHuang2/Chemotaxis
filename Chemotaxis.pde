Bacteria [] Philip; 
 void setup()   
 {     
    size(500,500);
    Philip = new Bacteria[150];
    for(int b = 0; b < Philip.length; b++)
    {
      Philip[b] = new Bacteria();
    }
 }

 void draw()   
 { 
   background(0);
   for(int b = 0; b < Philip.length; b++)
   {
      Philip[b].move();
      Philip[b].show();
   }
   
 } 

 void mouseClicked()
 {

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

 	void show()
 	{
 		fill(colour[0], colour[1], colour[2]);
  	 	ellipse(bacX, bacY, 20, 20);
 	} 

 } 
 class Lysol
 {
  	int myX, myY;

 	Lysol()
 	{
 		myX = -100;
 		myY = -100;
 	}

 	void show()
 	{
 	myX = mouseX;
 	myY = mouseY;
 	fill(255);
  	ellipse(myX, myY, 20, 20);
  	println("Hi");
 	}
 }

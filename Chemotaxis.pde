Lysol Peter;
Bacteria [] Philip; 

void setup()   
 {     
    size(500,500);
    Peter = new Lysol(); 
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
   Peter.show();
   Peter.dissapear();
   
   
 } 

 void mouseClicked()
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

 	void move()
 	{
            //Trying to add movement away from lysol DO I really need to add 20 lines of code to do so
            
            if(
            	dist(bacX, bacY, Peter.myX, Peter.myY) <= Peter.size + 20)
            {
              System.out.println("I'm Hit");
            }
            else
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
 		
 	}

 	void show()
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

 	void show()
 	{
 	 	fill(255);
 	 	noStroke();
  	 	ellipse(myX, myY, size, size);
  	 	if(size >= 1)
  	 	{
 	 	  	size=size+3;
  	 	}
 	}

 	void appear()
 	{
 		myX = mouseX;
 		myY = mouseY;
 	}

 	void grow()
 	{
 		size = 1;
 	}

 	void dissapear()
 	{
 		if(size >= 120 )
 		{
 	  	 	myX = -100;
 		 	myY = -100;
 		 	size = 0;
 		}
 	}
 	
 }

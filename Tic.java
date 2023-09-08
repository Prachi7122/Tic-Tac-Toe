
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
	 Button b[] = new Button[9];
	 //Button b[] = new Button[5];
	 int t=0;
	 boolean m=false;
	 boolean n=false;
	
	FDemo()
	{
		setTitle("Tic Tac Toe");
		
		Font f = new Font("Elephant",Font.BOLD,50);
		setFont(f);
		
		 
		setLayout(null);
		b[0] = new Button("");
		b[0].setSize(100,100);
		b[0].setLocation(100,100);
		add(b[0]);
		
	    b[1] = new Button("");
		b[1].setSize(100,100);
		b[1].setLocation(300,100);
		add(b[1]);
		
		b[2] = new Button("");
		b[2].setSize(100,100);
		b[2].setLocation(500,100);
		add(b[2]);
		
		b[3] = new Button("");
		b[3].setSize(100,100);
		b[3].setLocation(100,300);
		add(b[3]);
		
		b[4] = new Button("");
		b[4].setSize(100,100);
		b[4].setLocation(300,300);
		add(b[4]);
		
		b[5] = new Button("");
		b[5].setSize(100,100);
		b[5].setLocation(500,300);
		add(b[5]);
		
		b[6] = new Button("");
		b[6].setSize(100,100);
		b[6].setLocation(100,500);
		add(b[6]);
		
		b[7] = new Button("");
		b[7].setSize(100,100);
		b[7].setLocation(300,500);
		add(b[7]);
		
		b[8] = new Button("");
		b[8].setSize(100,100);
		b[8].setLocation(500,500);
		add(b[8]);
		
		
		
		
		b[0].addActionListener(this);
		b[1].addActionListener(this);
		b[2].addActionListener(this);
		b[3].addActionListener(this);
			b[4].addActionListener(this);
			b[5].addActionListener(this);
			b[6].addActionListener(this);
			b[7].addActionListener(this);
			b[8].addActionListener(this);
			
			
	}
	public void paint(Graphics g)
	{
		g.drawString("PRACHI",800,100);
		
		if(m)
		g.drawString("WINNER IS 0",800,300);
		
		if(n)
		g.drawString("WINNER IS x",800,300);	
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		for(int i=0; i<10; i++)
		{
      if(e.getSource()==b[i] )
	  {
		  if(t%2==0)
		  {			  
		  t++;
		b[i].setLabel("0");
		  //System.out.println(b[i]);
		  }
		  else{
			  t++;
			  b[i].setLabel("x");
		  }
		  
		  //first row
		  if(b[0].getLabel()==b[2].getLabel() && b[0].getLabel()=="0" && b[0].getLabel()==b[1].getLabel())
		  {   
			m=true;
			repaint();
			
		  }
		 
		  if(b[0].getLabel()==b[2].getLabel() && b[0].getLabel()=="x" && b[0].getLabel()==b[1].getLabel())
		  {
			n=true;
			repaint();
			
		  }
		  //row 2
		  if(b[3].getLabel()==b[4].getLabel() && b[3].getLabel()=="x" && b[3].getLabel()==b[5].getLabel())
		  {
			n=true;
			repaint();
			
		  }
		  if(b[3].getLabel()==b[4].getLabel() && b[3].getLabel()=="0" && b[3].getLabel()==b[5].getLabel())
		  {
			m=true;
			repaint();
			
		  }
		  //row 3
		   if(b[6].getLabel()==b[7].getLabel() && b[6].getLabel()=="x" && b[6].getLabel()==b[8].getLabel())
		  {
			n=true;
			repaint();
			
		  }
		  if(b[6].getLabel()==b[7].getLabel() && b[6].getLabel()=="0" && b[6].getLabel()==b[8].getLabel())
		  {
			m=true;
			repaint();
			
		  }
		  //diagonal 1
		    if(b[0].getLabel()==b[4].getLabel() && b[0].getLabel()=="x" && b[0].getLabel()==b[8].getLabel())
		  {
			n=true;
			repaint();
			
		  }
		  if(b[0].getLabel()==b[4].getLabel() && b[0].getLabel()=="0" && b[0].getLabel()==b[8].getLabel())
		  {
			m=true;
			repaint();
			
		  }
		  //diagonal 2
		    if(b[2].getLabel()==b[4].getLabel() && b[2].getLabel()=="x" && b[2].getLabel()==b[6].getLabel())
		  {
			n=true;
			repaint();
			
		  }
		  if(b[2].getLabel()==b[4].getLabel() && b[2].getLabel()=="0" && b[2].getLabel()==b[6].getLabel())
		  {
			m=true;
			repaint();
			
		  }
		  // column 1 
		   if(b[0].getLabel()==b[3].getLabel() && b[0].getLabel()=="x" && b[0].getLabel()==b[6].getLabel())
		  {
			n=true;
			repaint();
			
		  }
		  if(b[0].getLabel()==b[3].getLabel() && b[0].getLabel()=="0" && b[0].getLabel()==b[6].getLabel())
		  {
			m=true;
			repaint();
			
		  }
		  
		  //column 2
		   if(b[1].getLabel()==b[4].getLabel() && b[1].getLabel()=="x" && b[1].getLabel()==b[7].getLabel())
		  {
			n=true;
			repaint();
			
		  }
		  if(b[1].getLabel()==b[4].getLabel() && b[1].getLabel()=="0" && b[1].getLabel()==b[7].getLabel())
		  {
			m=true;
			repaint();
			
		  }
		  //column 3 
		   if(b[2].getLabel()==b[5].getLabel() && b[2].getLabel()=="x" && b[2].getLabel()==b[8].getLabel())
		  {
			n=true;
			m=false;
			repaint();
			
		  }
		  if(b[2].getLabel()==b[5].getLabel() && b[2].getLabel()=="0" && b[2].getLabel()==b[8].getLabel())
		  {
			m=true;
			n=false;
			repaint();
			
		  }
		  
		  b[i].removeActionListener(this); 
		  
	  }
	
	
		}
	}
	
}
class Tic
{
	public static void main(String a[])
	{
		FDemo f = new FDemo();
		
		f.setSize(800,800);
		f.setLocation(100,100);
		f.setVisible(true);
		
	}
 }



package com.exapmle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class MyAnimation2 extends JPanel{
	int x=100;
	int y=400;
	int width=50;
	int height=50;
	int stepx=10;
	int stepy=10;
	int max_x,max_y;
	
	
	MyAnimation2(int w,int h){
		this.max_x=w-width;
		this.max_y=h-height;
		 
	}
		public void paint(Graphics g) {
			super.paint(g);
			
			
			g.setColor(Color.WHITE);
			g.fillOval(x,y,width,height);
			
			if(y>max_y || y<0) {
				stepy=-stepy;
			}if(x>max_x || x<0) {
				stepx=-stepx;
			}
			
			x=x+stepx;
			y=y+stepy;
			
			try {
				Thread.sleep(40);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
			
			repaint();
			
		}

}

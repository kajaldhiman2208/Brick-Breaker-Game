package com.exapmle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class MyAnimation extends JPanel{
	int x=0;
	int y=100;
	int width=100;
	int height=50;
	int stepsize=10;
	int max_x,max_y;
	
	MyAnimation(int w,int h){
		this.max_x=w;
		this.max_y=h;
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		
		g.setColor(Color.WHITE);
		g.fillRect(x,y,width,height);
		
		if(x+width>max_x || x<0)
			stepsize=-stepsize;
		
		x=x+stepsize;
		
		try {
			Thread.sleep(40);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		repaint();
		
	}

}

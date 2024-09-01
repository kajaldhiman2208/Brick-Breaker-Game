package com.exapmle;
import java.awt.Color;
import javax.swing.JFrame;

public class Example extends JFrame{
	
	Example(){
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		MyAnimation panel=new MyAnimation(780,560);
		panel.setBackground(Color.black);
		add(panel);
	}
	
	public static void main(String args[]) {
		new Example().setVisible(true);
		
	}

}

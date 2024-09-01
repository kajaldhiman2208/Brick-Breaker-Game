package com.exapmle;
import java.awt.Color;
import javax.swing.JFrame;

public class Example2 extends JFrame{
	
	Example2(){
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		MyAnimation2 panel=new MyAnimation2(780,560);
		panel.setBackground(Color.black);
		add(panel);
	}
	
	public static void main(String args[]) {
		new Example2().setVisible(true);
		
	}

}

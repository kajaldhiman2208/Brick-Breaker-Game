package com.exapmle;

import java.awt.Color;

import javax.swing.JFrame;

public class Example1 extends JFrame{

	Example1(){
		
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		practice panel1=new practice(380,380);
		panel1.setBackground(Color.black);
		add(panel1);
	}
	public static void main(String args[]) {
		new Example1().setVisible(true);
	}
	
}

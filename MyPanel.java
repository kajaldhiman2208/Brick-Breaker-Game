package com.exapmle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class MyPanel extends JPanel{
	public void paint(Graphics g) {
		super.paint(g);
		
		
		g.setColor(Color.white);
		g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
		g.drawString("Hello",50,50);
		
		
		g.drawLine(100,100,200,150);
		
		//g.drawRect(100, 200, 100, 50);
//		g.fillRect(100, 200, 100, 150);
//		
//		g.drawOval(300, 200, 100, 100);
//		//g.drawArc(400, 200, 100, 100, 0, 90);
//		g.fillArc(400, 200, 100, 100, 0, 90);
//		
//		int x[]= {100,200,300};
//		int y[]= {400,300,400};
//		int n=3;
//		g.drawPolygon(x,y,n);
		int xPoints[]= {100,200,300};
		int yPoints[]= {400,300,400};
		int nPoints=3;
		g.drawPolyline(xPoints,yPoints,nPoints);
		
		String url="C:\\Users\\Dell\\Desktop\\plantswebsite\\bigleafimage.jpg";
		Image image=new ImageIcon(url).getImage();
		g.drawImage(image,300,50,200,100,null);
		
		//g.clearRect(0, 0, 800, 600);
		
	}

}

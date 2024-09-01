package demogame;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics2D;


public class gameplay extends JPanel implements ActionListener, KeyListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean play=false;
	private int totalBrick=21;
	private Timer timer;
	private int delay=8;
	private int ballposX=120;
	private int ballposY=350;
	private int ballXdir=-1;
	private int ballYdir=-2;
	private int playerX=350;
	private MapGenerator map;
	
	public gameplay() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(true);
		
		timer=new Timer(delay,this);
		timer.start();
		
		map=new MapGenerator(3,7);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(play) {
			
			if(ballposX<=0) {
				ballXdir=-ballXdir;
			}
			if(ballposX>=670) {
				ballXdir=-ballXdir;
			}
			if(ballposY<=0) {
				ballYdir=-ballYdir;
			}
			
			Rectangle ballRect=new Rectangle(ballposX,ballposY,30,30);
			Rectangle paddleRect=new Rectangle(playerX,550,100,8);
			
			if(ballRect.intersects(paddleRect))
			{
				ballYdir=-ballYdir;
			}
			
			
			
			A:for(int i=0;i<map.map.length;i++) {
				for(int j=0;j<map.map[0].length;j++) {
					if(map.map[i][j]>0) {
						int width=map.brickWidth;
						int height=map.brickHeight;
						int brickXpos=80+j*width;
						int brickYpos=80+i*height;
						
						Rectangle brickRect=new Rectangle(brickXpos,brickYpos,width,height);
						
						if(ballRect.intersects(brickRect)) {
							map.setBrick(0, i, j);
							totalBrick--;
							
							if(ballposX+19<=brickXpos || ballposX+1>=brickXpos+width) {
								ballXdir=-ballXdir;
							}
							else {
								ballYdir=-ballYdir;
							}
							
						
						
						break A;
						}
						
					}
				}
			}
			
			
			
			
			
			
			ballposX+=ballXdir;
			ballposY+=ballYdir;
		
		}
		repaint();
	}
	
	public void moveLeft() {
		play=true;
		playerX-=20;
	}
	public void moveRight() {
		play=true;
		playerX+=20;
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(1, 1, 692,592);
		
		//border
		g.setColor(Color.yellow);
		g.fillRect(0,0,692,3);
		g.fillRect(0,3,3,592);
		g.fillRect(691,3,3,592);
		
		
		//paddle
		g.setColor(Color.MAGENTA);
		g.fillRect(playerX,550,100,8);
		
		//ball
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(ballposX, ballposY, 20, 20);
		
		//bricks
		map.draw((Graphics2D) g);
		
		//score
	
		
	}



	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			if(playerX<=0)
				playerX=0;
			else
				moveLeft();
		}
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if(playerX>580)
				playerX=580;
			else
				moveRight();
		}
		repaint();
	}


	public void keyReleased(KeyEvent e) {
	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

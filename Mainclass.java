package demogame;

import javax.swing.JFrame;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		f.setTitle("brickbereaker");
		f.setSize(700,600);
		f.setResizable(false);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gameplay game=new gameplay();
		f.add(game);
	}

}

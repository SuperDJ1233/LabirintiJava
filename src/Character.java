import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Character extends JPanel implements KeyListener{
	

	JLabel label;
	ImageIcon run;
	ImageIcon runrev;
	ImageIcon idle;
	ImageIcon idlerev;
	
	Obstacle obstacle;
	
	public Character () {
		
		
		this.setBounds(0, 150, 80, 85); // 2 nr e pare: pozicioni i karakterit 2 nr e dyte madhesia e hitbox-it
		
		run = new ImageIcon("battlebot_run-ezgif.com-speed.gif");
		runrev = new ImageIcon("battlebot_run-ezgif.com-speed (1).gif");
		idle = new ImageIcon("battlebot_idle-3-ezgif.com-speed.gif");
		idlerev = new ImageIcon("battlebot_idle-3-ezgif.com-reverse.gif");
		
		label = new JLabel();
		
		label.setIcon(idle);
		
		obstacle = new Obstacle();
		
		
		this.add(label);
		this.setFocusable(true); 
        this.requestFocusInWindow(); 
		this.addKeyListener(this);
		this.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int X = this.getX();
		int Y = this.getY();
		
		switch(e.getKeyCode()) {
		case 37: X-=10;
			label.setIcon(runrev);
			break;
		case 38: Y-=10;
			break;
		case 39: X+=10;
			label.setIcon(run);
			break;
		case 40: Y+=10;
			break;
		}
		
		Rectangle hitbox = new Rectangle(X, Y, this.getWidth(), this.getHeight());
		if (!hitbox.intersects(obstacle.getBounds())) {
			this.setLocation(X, Y);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37: label.setIcon(idlerev);
			break;
		case 39: label.setIcon(idle);
			break;
		}
	}
}


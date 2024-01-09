import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Game extends JFrame{

	Character character = new Character();
	Obstacle obstacle = new Obstacle();
	
	public Game() {

		this.setLayout(null);
		this.setSize(new Dimension(1000,600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(obstacle);
		this.add(character);
		this.setVisible(true);
	}
}

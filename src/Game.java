import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Date;

import javax.swing.*;

public class Game extends JFrame{

	Character character = new Character();
	Obstacle obstacle = new Obstacle();
	
	public Game() {
		String versioniLojes = "v.0.0.1";
		this.setLayout(null);
		//JFrame this = new JFrame(); //krijon objekt te dritares
		this.setTitle("Labirinti "+ versioniLojes + new Date());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hide, exit, do_nothing
		this.setResizable(false);
		this.setSize(1000,600);
		//Icona e framit
		ImageIcon logojaFrameit = new ImageIcon("Asete/logo.png");
		this.setIconImage(logojaFrameit.getImage());
		/* old
		this.setLayout(null);
		this.setSize(new Dimension(1000,600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
*/
		this.add(obstacle);
		this.add(character);
		this.setVisible(true); //e ben te dukshme dritaren
	}
}

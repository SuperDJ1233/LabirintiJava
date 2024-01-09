import javax.swing.*;
import java.util.Date;

public class StartGame {
    public static void main(String[] args){
        String versioniLojes = "v.0.0.1";
        JFrame frameKryesor = new JFrame(); //krijon objekt te dritares
        frameKryesor.setTitle("Labirinti "+ versioniLojes + new Date());
        frameKryesor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hide, exit, do_nothing
        frameKryesor.setResizable(false);
        frameKryesor.setSize(500, 500);
        frameKryesor.setVisible(true); //e ben te dukshme dritren
        //Icona e framit
        ImageIcon logojaFrameit = new ImageIcon("Asete/logo.png");
        frameKryesor.setIconImage(logojaFrameit.getImage());
    }
}

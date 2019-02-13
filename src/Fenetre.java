import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener {
	
	JButton bouton = new JButton("Quitter");
	final PanneauSimulateur pane = new PanneauSimulateur();
	
	public Fenetre(String titre, int x, int y, JButton bouton, PanneauSimulateur pane2){
		this.setTitle(titre);
		this.setSize(x, y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);	
		this.setContentPane(pane2);
		bouton.addActionListener(this);
		this.add(bouton);
		this.setVisible(true);
		
	}
	
	 public void actionPerformed(ActionEvent arg0) { 
		 Fenetre fen = new Fenetre("Simulator",1100,650,bouton, pane);

	  } 
	 
	 public void run() {
		 
	 }

}

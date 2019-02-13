import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LauncheurSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton bouton = new JButton("Lancer la simulation");
		final PanneauMenu panneau = new PanneauMenu();
		//Fenetre fen = new Fenetre("Menu",600,550,bouton, panneau);
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new PanneauSimulateur();
	            }
	        });

	}

}

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanneauSimulateur extends JPanel {
	
	private int voiturex = 30;
	
	private Thread thread = new Thread();
	
	private Image voiture = new ImageIcon("voiture.png").getImage();
	
	public void paintComponent(Graphics g){
		thread.start();
	    try {
	        Image img = ImageIO.read(new File("map.jpg"));
	        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	        for(int i = 0; i<1000; i++) {
	        	
					//thread.sleep(20);
					g.drawImage(voiture, voiturex, 200,null);
			        voiturex = voiturex+5;
				
		        
	        }
	      } catch (IOException e) {
	        e.printStackTrace();
	                 
	  } 
	}
}



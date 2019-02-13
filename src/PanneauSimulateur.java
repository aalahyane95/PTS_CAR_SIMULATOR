import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanneauSimulateur extends JFrame {
	
	private int voiturex = 30;
	private static final int D_W = 1100;
    private static final int D_H = 628;
    int x = 0;
    int y = 247;
    
    
	private Thread thread = new Thread();
	
	private Image voiture = new ImageIcon("voiture.png").getImage();
	DrawPanel drawPanel = new DrawPanel();
	
	
	public PanneauSimulateur() {
		
		ActionListener listener = new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	            if (x >= D_W) {
	                x = 0;
	                drawPanel.repaint();
	            } else {
	                x += 10;
	                drawPanel.repaint();
	            }
	        }
	    };
	    Timer timer = new Timer(100, listener);
	    timer.start();
	    	add(drawPanel);

	    	pack();
	    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	setLocationRelativeTo(null);
	    	setVisible(true);
	}
	

	private class DrawPanel extends JPanel {

        protected void paintComponent(Graphics g) {
        	
			try {
			Image img = ImageIO.read(new File("map.jpg"));
			
	        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            g.setColor(Color.red);
            g.fillRect(x, y, 23, 10);
            
			} catch (IOException e) {

				e.printStackTrace();
			}
        }

        public Dimension getPreferredSize() {
            return new Dimension(D_W, D_H);
        }
    }

}
	    




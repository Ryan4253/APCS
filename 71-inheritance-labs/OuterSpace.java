//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.awt.*;
import javax.swing.*;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;

	private Bullets shots;
	private AlienHorde horde;

	private boolean[] keys;
	private boolean prevSpace;
	private boolean ended = false;
	private BufferedImage back;

	public OuterSpace(){
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(350, 300, 75, 75, 3);
		horde = new AlienHorde(1);
		horde.generate(27, 200, 0, 50, 50, 1);
		shots = new Bullets();

		//alienOne = new Alien(0, 0, 50, 50, 3);
		//alienTwo = new Alien(100, 0, 50, 50, 3);
		//horde.add(alienOne);
		//horde.add(alienTwo);
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   	public void update(Graphics window){
	   paint(window);
  	 }

	public void paint(Graphics window){

		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(horde.getSize() == 0){			
			graphToBack.setColor(Color.GREEN);
			graphToBack.setFont(new Font("TimesRoman", Font.PLAIN, 72)); 			
			graphToBack.drawString("YOUWIN", 250, 300);
			twoDGraph.drawImage(back, null, 0, 0);
			return;
		}

		if(ended){
			graphToBack.setColor(Color.RED);
			graphToBack.setFont(new Font("TimesRoman", Font.PLAIN, 72)); 
			graphToBack.drawString("GITGUD", 250, 300 );
			twoDGraph.drawImage(back, null, 0, 0);
			return;
		}

		if(keys[0] == true){
			if (ship.getX()+10 > 0){
				ship.move("LEFT");
			}
		}
		else if(keys[1] == true){
			if(ship.getX() + ship.getWidth() < 800){
				ship.move("RIGHT");
			}
		}
		else if(keys[2] == true){
			if(ship.getY() + 5 > 0){
				ship.move("UP");
			}
		}
		else if(keys[3] == true){
			if(ship.getY()+ship.getHeight()+45 < 600){
				ship.move("DOWN");
			}
		}

		if(keys[4] == true && prevSpace == false){
			shots.add(new Ammo(ship.getX()+ship.getWidth()/2-5, ship.getY()));
		}

		for(int i = 0; i < horde.getSize(); i++){
			if(ship.collides(horde.getList().get(i))){
				ended = true;
			}
		}

		//alienOne.move("DOWN");
		//alienTwo.move("LEFT");
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);

		ship.draw(graphToBack);

		shots.moveEmAll();
		shots.drawEmAll(graphToBack);
		shots.cleanEmUp();

		horde.drawEmAll(graphToBack);
		horde.moveEmAll();
		horde.removeDeadOnes(shots.getList());

		twoDGraph.drawImage(back, null, 0, 0);
		prevSpace = keys[4];
		//System.out.println(shots);
	}


	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP){
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE){
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP){
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN){
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE){
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

  	public void run(){
   		try{
   			while(true){
   			   Thread.currentThread().sleep(5);
   		       repaint();
        	}
    	}
    	catch(Exception e){
   	 	}
  	}
}


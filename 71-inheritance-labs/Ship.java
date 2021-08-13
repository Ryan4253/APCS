//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing{
	private int speed;
	private Image image;

	public Ship(){
		this(500, 500, 300, 300, 10);
	}

	public Ship(int x, int y){
		this(x, y, 300, 300, 10);
	}

	public Ship(int x, int y, int s){
		this(x, y, 300, 300, s);
	}

	public Ship(int x, int y, int w, int h, int s){
		super(x, y, w, h);
		speed = s;
		try{
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);

		}
		catch(Exception e){
			System.out.println("FILE NOT FOUND");	
		}
	}


	public void setSpeed(int s){
	   speed = s;
	}

	public int getSpeed(){
	   return speed;
	}

	public void move(String direction){	
		if(direction.equals("LEFT")){
			setX(getX()-speed);
		}
		else if(direction.equals("RIGHT")){
			setX(getX()+speed);
		}
		else if(direction.equals("UP")){
			setY(getY()-speed);
		}
		else{
			setY(getY()+speed);
		}
	}

	public boolean collides(Alien a){
		double sLX = getX(), sLY = getY(), sRX = getX() + getWidth(), sRY = getY()+getHeight();
		double aLX = a.getX(), aLY = a.getY(), aRX = a.getX() + a.getWidth(), aRY = a.getY() + a.getHeight();

		
		if(sLX >= aRX || aLX >= sRX){
			return false;
		}

		if(sLY >= aRY || aLY >= sRY){
			return false;
		}

		return true;
	}

	public void draw(Graphics window){
		//System.out.println("ship is drawn");
   		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString(){
		return super.toString() + " " + getSpeed();
	}
}

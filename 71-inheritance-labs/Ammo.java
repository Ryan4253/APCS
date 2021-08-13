//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing{
	private int speed;

	public Ammo(){
		this(0, 0, 3);
	}

	public Ammo(int x, int y){
		this(x, y, 3);
	}

	public Ammo(int x, int y, int s){
		super(x, y);
		speed = s;
	}

	public void setSpeed(int s){
		speed = s;
	}

	public int getSpeed(){
	   return speed;
	}

	public void draw(Graphics window){
		window.setColor(Color.red);
		window.fillRect(getX(), getY(), 10, 20);
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
		if(getX() <= a.getX() + a.getWidth() && getX() + 10 >= a.getX() && 
		getY() - 10 >= a.getY() && getY() <= a.getY() + a.getHeight())
		{
			return true;
		} 
		else{
			return false;
		}
	}

	public String toString(){
		return "";
	}
}

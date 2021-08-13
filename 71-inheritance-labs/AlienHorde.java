//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde{
	private List<Alien> aliens;
	boolean direction = false;

	public AlienHorde(int size){
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al){
		aliens.add(al);
	}

	public void generate(int num, int x, int y, int w, int h, int s){
		int ori = x;
		for (int i = 0; i < num; i++){
			aliens.add(new Alien(x, y, w, h, s));
			if(x >= 600){
				x = ori;
				y += 5 + h;
			}
			else{
				x += 5 + w;
			}
		}
	}

	public int getSize(){
		return aliens.size(); 
	}

	public List<Alien> getList(){
		return aliens;
	}

	public void drawEmAll(Graphics window){
		for(int i = 0; i < aliens.size(); i++){
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll(){
		if(aliens.size() > 0){
			int maxX = 0;
			for(int i = 1; i < aliens.size(); i++){
				if(aliens.get(i).getX() > aliens.get(maxX).getX()){
					maxX = i;
				}
			}

			if(aliens.get(0).getX() <= 20){
				direction = true;
			}
			else if(aliens.get(maxX).getX() + aliens.get(maxX).getWidth() >= 800 - 18){
				direction = false;
			}

			if(direction){
				for(int i = 0; i < aliens.size(); i++){
					aliens.get(i).move("RIGHT");
				}
			} 
			else{
				for(int i = 0; i < aliens.size(); i++){
					aliens.get(i).move("LEFT");
				}
			}

			if ((int)(Math.random() * 5) == 0) {
				for(int i = 0; i < aliens.size(); i++){
					aliens.get(i).move("DOWN");
				}
			}
		}		
	}

	public void removeDeadOnes(List<Ammo> shots){
		for(int i = 0; i < aliens.size(); i++){
			for(int j = 0;j < shots.size(); j++){
				if(shots.get(j).collides(aliens.get(i))){
					aliens.remove(i);
					shots.remove(j);
				}
			}
		}
	}

	public String toString(){
		return "";
	}
}

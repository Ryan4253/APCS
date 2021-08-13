//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;

public class Enemies 
{
	private ArrayList<Enemy> enemies;
	private Person guy;
	
	public Enemies(Person p)
	{
		enemies = new ArrayList<Enemy>();
		guy = p;		
	}
	
	// DRAW AND COLLISION METHOD
	public void drawAndCollision(Graphics2D g) throws IOException
	{
		// ADD ENEMIES
		addEnemy();
		
		// REMOVE ENEMIES THAT GO OUT OF BOUND
		for(int i = enemies.size()-1; i >= 0; i--){
			if(enemies.get(i).getX() >= 750){
				enemies.remove(i);
			}
		}
		
		// GO THROUGH THE LIST OF ENEMIES AND CALL THEIR draw() and move() method and check if their collide with guy if so then call the GAMEOVER() METHOD
		for(int i = 0; i < enemies.size(); i++){
			(enemies.get(i)).move();
			(enemies.get(i)).draw(g);
			if(guy.collide(enemies.get(i).getX(), enemies.get(i).getY())){
				GAMEOVER(g);
				return;
			}
		}

		// IF THE PLAYER REACHES THE GRASS ON THE BOTTOM SIDE CALL THE VICTORY() method	
		if(guy.getY() >= 525){
			VICTORY(g);
			return;
		}	
	}
	
	public void GAMEOVER(Graphics2D g)
	{
		Game.RUNNING = false;
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("GAME OVER!", 400, 300);
	}
	
	public void VICTORY(Graphics2D g)
	{
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("VICTORY!", 400, 300);
		Game.RUNNING = false;
	}
	
	// ADDS AN ENEMY TO THE ENEMY LIST
	public void addEnemy() throws IOException
	{
		int x = (int)(Math.random() * 800);
		int y = (int)(Math.random() * 350)+125;
		int speed = (int)(Math.random() * 10) + 1;

		Enemy lmao = new Enemy(x, y, speed);

		int alive = (int)(Math.random() * 5);
		if(alive == 0 || numEnemies() >= 25){
			//enemy died prematurely either due to complications or overpopulation
		}
		else{
			enemies.add(lmao); 
		}
		
	}
	
	// RETURN HOW MANY ENEMIES THERE ARE
	public int numEnemies()
	{
		return enemies.size();
	}
}

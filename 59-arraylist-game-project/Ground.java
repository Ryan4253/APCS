//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Ground 
{
	private ArrayList<Image> tiles;
	
	public Ground() throws IOException
	{
		//point the tiles at new array list
		tiles = new ArrayList<Image>();
		
		//add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
		Image grass = ImageIO.read(new File("grass.gif"));
		Image grassToRoad = ImageIO.read(new File("gtoroad.gif"));
		Image road = ImageIO.read(new File("road.gif"));
		Image roadToGrass = ImageIO.read(new File("rtograss.gif"));
		
		tiles.add( ImageIO.read(new File("grass.gif")) );
		tiles.add( ImageIO.read(new File("gtoroad.gif")) );
		tiles.add( ImageIO.read(new File("road.gif")) );
		tiles.add( ImageIO.read(new File("rtograss.gif")) );
	}
	
	public void drawGround(Graphics2D g)
	{
		//draw the ground on the screen	
		for(int i = 0; i <= 50; i += 50){
			for(int j = 0; j <= 750; j += 50){
				g.drawImage(tiles.get(0), j, i, null);
			}
		}

		for(int i = 0 ; i <= 750; i += 50){
			g.drawImage(tiles.get(1), i, 100, null);
		}

		for(int i = 150; i <= 450; i += 50){
			for(int j = 0; j <= 750; j += 50){
				g.drawImage(tiles.get(2), j, i, null);
			}
		}

		for(int i = 0; i <= 750; i += 50){
			g.drawImage(tiles.get(3), i, 500, null);
		}

		for(int i = 0; i <= 750; i += 50){
			g.drawImage(tiles.get(0), i, 550, null);
		}
	}	
}
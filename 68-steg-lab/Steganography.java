import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Steganography{
	// clear the 2 rightmost bits in the pixel
	public static void clearLow( Pixel p ){
		int red = p.getRed();
		int blue = p.getBlue();
		int green = p.getGreen();

		red = red >> 2 << 2;
		blue = blue >> 2 << 2;
		green = green >> 2 << 2;

		p.setRed(red); 
		p.setBlue(blue);
		p.setGreen(green);
	}

	public static Picture testClearLow(Picture p){
		Pixel[][] pixels = p.getPixels2D();

		for(int i = 0; i < pixels.length; i++){
			for(int j = 0; j < pixels[i].length; j++){
				clearLow(pixels[i][j]);
			}
		}

		return p;
	}

	/**
	* Set the lower 2 bits in a pixel to the highest 2 bits in c
	*/
	public static void setLow (Pixel p, Color c){
		int cR = c.getRed(); cR = cR >> 6;
		int cG = c.getGreen(); cG = cG >> 6;
		int cB = c.getBlue(); cB = cB >> 6;

		int pR = p.getRed(); pR = pR >> 2 << 2;
		int pG = p.getGreen(); pG = pG >> 2 << 2;
		int pB = p.getBlue(); pB = pB >> 2 << 2;

		p.setRed(cR + pR);
		p.setBlue(cB + pB);
		p.setGreen(cG + pG);
	}

	public static Picture testSetLow(Picture p, Color c){
		Pixel[][] pixels = p.getPixels2D();

		for(int i = 0; i < pixels.length; i++){
			for(int j = 0; j < pixels[i].length; j++){
				setLow(pixels[i][j], c);
			}
		}

		return p;
	}

	public static Picture revealPicture(Picture hidden){
		Picture copy = new Picture(hidden);
		Pixel[][] pixels = copy.getPixels2D();
		Pixel[][] source = hidden.getPixels2D();
		for (int i = 0; i < pixels.length; i++){
			for(int j = 0; j < pixels[i].length; j++){
				pixels[i][j].setRed((source[i][j].getRed() % 4) << 6);
				pixels[i][j].setBlue((source[i][j].getBlue() % 4) << 6);
				pixels[i][j].setGreen((source[i][j].getGreen() % 4) << 6);
			}
		}

		return copy;
	}

	/**
	* Determines whether secret can be hidden in source, which is
	* true if source and secret are the same dimensions.
	* @param source is not null
	* @param secret is not null
	* @return true if secret can be hidden in source, false otherwise.
	*/
	public static boolean canHide(Picture source, Picture secret){
		Pixel[][] src = source.getPixels2D();
		Pixel[][] hid = secret.getPixels2D();
		return (src.length) >= (hid.length) && (src[0].length) >= (hid[0].length);
	}

	public static Picture hidePicture(Picture source, Picture secret){
		Picture copy = new Picture(source);
		Pixel[][] pixels = copy.getPixels2D();
		Pixel[][] hide = secret.getPixels2D();

		for(int i = 0; i < pixels.length; i++){
			for(int j = 0; j < pixels[i].length; j++){
				setLow(pixels[i][j], hide[i][j].getColor());
			}
		}

		return copy;
	}

	public static Picture hidePicture(Picture source, Picture secret, int startRow, int startCol){
		Picture copy = new Picture(source);
		Pixel[][] pixels = copy.getPixels2D();
		Pixel[][] hide = secret.getPixels2D();

		for(int i = 0; i < hide.length; i++){
			for(int j = 0; j < hide[i].length; j++){
				setLow(pixels[startRow + i][startCol + j], hide[i][j].getColor());
			}
		}

		return copy;
	}

	public static boolean isSame(Picture first, Picture second){
		Pixel[][] a = first.getPixels2D();
		Pixel[][] b = second.getPixels2D();
		boolean flag = true;

		if(a.length != b.length || a[0].length != b[0].length){
			return false;
		}
		else{
			for(int i = 0; i < a.length; i++){
				for(int j = 0; j < a[0].length; j++){
					if(a[i][j].getRed() != b[i][j].getRed()){
						flag = false;
					}
					else if(a[i][j].getGreen() != b[i][j].getGreen()){
						flag = false;
					}
					else if(a[i][j].getBlue() != b[i][j].getBlue()){
						flag = false;
					}
				}
			}

			return flag;
		}
	}

	public static ArrayList<Point> findDifferences(Picture first, Picture second){
		ArrayList<Point> v = new ArrayList<Point>();
		Pixel[][] a = first.getPixels2D();
		Pixel[][] b = second.getPixels2D();

		if(a.length != b.length || a[0].length != b[0].length){
			return v;
		}

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(a[i][j].getRed() != b[i][j].getRed()){
					v.add(new Point(i, j));
				}
				else if(a[i][j].getGreen() != b[i][j].getGreen()){
					v.add(new Point(i, j));
				}
				else if(a[i][j].getBlue() != b[i][j].getBlue()){
					v.add(new Point(i, j));
				}
			}
		}

		return v;


	}

	public static Picture showDifferentArea(Picture source, ArrayList<Point> coord){
		Picture copy = new Picture(source);
		Pixel[][] a = copy.getPixels2D();


		int maxRow = 0, minRow = 2147483647, maxCol = 0, minCol = 2147483647;
		for(int i = 0; i < coord.size(); i++){
			int x = (int)coord.get(i).getX();
			int y = (int)coord.get(i).getY();

			maxRow = Math.max(maxRow, x); minRow = Math.min(minRow, x);
			maxCol = Math.max(maxCol, y); minCol = Math.min(minCol, y);
		}

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(i == maxRow && j >= minCol && j <= maxCol){
					a[i][j].setColor(Color.WHITE);
				}
				else if(i == minRow && j >= minCol && j <= maxCol){
					a[i][j].setColor(Color.WHITE);
				}
				else if(j == minCol && i >= minRow && i <= maxRow){
					a[i][j].setColor(Color.WHITE);
				}
				else if(j == maxCol && i >= minRow && i <= maxRow){
					a[i][j].setColor(Color.WHITE);
				}
			}
		}

		return copy;
	}

	public static void main(String []args){
		/*
		Picture beach = new Picture ("beach.jpg");
		beach.explore();
		Picture copy = testClearLow(beach);
		copy.explore();
		*/
		
		Picture beach2 = new Picture ("beach.jpg");
		Picture mark = new Picture("blue-mark.jpg");
		//beach2.explore();
		//Picture copy2 = testSetLow(beach2, Color.PINK);
		//copy2.explore();
		/*
		if(canHide(beach2, mark)){
			Picture copy3 = hidePicture(beach2, mark);
			copy3.explore();

			Picture copy4 = revealPicture(copy3);
			copy4.explore();
		}
		*/
		/*
		Picture beach = new Picture("beach.jpg");
		Picture robot = new Picture("robot.jpg");
		Picture flower1 = new Picture("flower1.jpg");
		beach.explore();
		// these lines hide 2 pictures
		Picture hidden1 = hidePicture(beach, robot, 65, 208);
		Picture hidden2 = hidePicture(hidden1, flower1, 280, 110);
		hidden2.explore();
		Picture unhidden = revealPicture(hidden2);
		unhidden.explore();
		*/
		/*
		Picture swan = new Picture("swan.jpg");
		Picture swan2 = new Picture("swan.jpg");
		System.out.println("Swan and swan2 are the same: " +
		isSame(swan, swan2));
		swan = testClearLow(swan);
		System.out.println("Swan and swan2 are the same (after clearLow run on swan): "
		+ isSame(swan, swan2));	
		*/
		/*
		Picture arch = new Picture("arch.jpg");
		Picture arch2 = new Picture(arch);
		Picture koala = new Picture("koala.jpg");
		Picture robot1 = new Picture("robot.jpg");
		ArrayList<Point> pointList = findDifferences(arch, arch2);
		System.out.println("PointList after comparing two identical pictures " +
		"has a size of " + pointList.size());
		pointList = findDifferences(arch, koala);
		System.out.println("PointList after comparing two different sized pictures " +
		"has a size of " + pointList.size());
		arch2 = hidePicture(arch, robot1, 65, 102);
		pointList = findDifferences(arch, arch2);
		System.out.println("Pointlist after hiding a picture has a size of "
		+ pointList.size());
		arch.show();
		arch2.show();
		*/

		Picture hall = new Picture("femaleLionAndHall.jpg");
		Picture robot2 = new Picture("robot.jpg");
		Picture flower2 = new Picture("flower1.jpg");
		// hide pictures
		Picture hall2 = hidePicture(hall, robot2, 50, 300);
		Picture hall3 = hidePicture(hall2, flower2, 115, 275);
		hall3.explore();
		if(!isSame(hall, hall3))
		{
			Picture hall4 = showDifferentArea(hall, findDifferences(hall, hall3));
			hall4.show();
			Picture unhiddenHall3 = revealPicture(hall3);
			unhiddenHall3.show();
		}
		
	}


}
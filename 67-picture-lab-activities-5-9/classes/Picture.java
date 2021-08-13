import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }

  public void keepOnlyBlue(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }

  public void negate(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(255-pixelObj.getGreen());
        pixelObj.setRed(255-pixelObj.getRed());
        pixelObj.setBlue(255-pixelObj.getBlue());
      }
    }
  }

  public void grayScale(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        int avg = (pixelObj.getGreen() + pixelObj.getBlue() + pixelObj.getRed()) / 3;

        pixelObj.setGreen(avg);
        pixelObj.setRed(avg);
        pixelObj.setBlue(avg);
      }
    }
  }

  public void fixUnderwater(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(pixelObj.getBlue()-50);
        pixelObj.setRed(pixelObj.getRed()+100);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }

  public void mirrorVerticalRightToLeft(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }

  public void mirrorHorizontal(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length, width = pixels[0].length;
    for (int row = 0; row < height/2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[height - 1 - row][col];
        botPixel.setColor(topPixel.getColor());
      }
    }
  }

  public void mirrorHorizontalBotToTop(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length, width = pixels[0].length;
    for (int row = 0; row < height/2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[height - 1 - row][col];
        topPixel.setColor(botPixel.getColor());
      }
    }
  }

  public void mirrorDiagonal(){
  	Pixel[][] pixels = this.getPixels2D();
  	int n = Math.min(pixels.length, pixels[0].length);

  	for(int i = 0; i < n; i++){
  		for(int j = i; j < n; j++){
  			pixels[i][j].setColor(pixels[j][i].getColor());
  		}
  	}
  }

  private void copyLeftToRight(int i1, int j1, int i2, int j2, int midpoint){
  	Pixel[][] pixels = this.getPixels2D();
  	for (int i = i1; i < i2; i++){
      for (int j = j1; j < j2; j++){
        pixels[i][2*midpoint-j].setColor(pixels[i][j].getColor());
      }
    }
  }

  private void copyRightToLeft(int i1, int j1, int i2, int j2, int midpoint){
  	Pixel[][] pixels = this.getPixels2D();
  	for (int i = i1; i < i2; i++){
      for (int j = j1; j < j2; j++){
        pixels[i][j].setColor(pixels[i][2*midpoint-j].getColor());
      }
    }
  }


  private void copyTopToDown(int i1, int j1, int i2, int j2, int midpoint){
  	Pixel[][] pixels = this.getPixels2D();
  	for (int i = i1; i < i2; i++){
      for (int j = j1; j < j2; j++){
        pixels[2*midpoint-i][j].setColor(pixels[i][j].getColor());
      }
    }
  }

  private void copyBottomToTop(int i1, int j1, int i2, int j2, int midpoint){
  		
  	Pixel[][] pixels = this.getPixels2D();
  	for (int i = i1; i < i2; i++){
      for (int j = j1; j < j2; j++){
        pixels[i][j].setColor(pixels[2*midpoint-i][j].getColor());
      }
    }
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    int cnt = 0;
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        cnt++;
      }
    }

    System.out.println(cnt);
  }

  public void mirrorArms(){
    copyTopToDown(159, 105, 190, 170, 190);
    copyLeftToRight(159, 105, 221, 170, 204);
  }

  public void mirrorGull(){
  	copyLeftToRight(233, 239, 322, 340, 350);
  }
 
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
  */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  public void copy2(Picture fromPic, int startRow, int startCol, int rStart, int rEnd, int cStart, int cEnd){
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = rStart, toRow = startRow; fromRow < rEnd && toRow < toPixels.length; fromRow++, toRow++){
      for (int fromCol = cStart, toCol = startCol; fromCol < cEnd && toCol < toPixels[0].length; fromCol++, toCol++){
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }

  public void myCollage(){
  	Picture seagull = new Picture("seagull.jpg");
	//233, 350, 233, 322
	//0, 0, 479, 90 ,100
	//0, 125, 479, 250 , 213
    this.copy2(seagull, 0, 0, 233, 350, 233, 322);
    seagull.fixUnderwater();
    this.copy2(seagull, 125, 0, 233, 350, 233, 322);
    seagull.negate();
    this.copy2(seagull, 250, 0, 233, 350, 233, 322);
    seagull.grayScale();
    this.copy2(seagull, 375, 0, 233, 350, 233, 322);

    this.copyLeftToRight(0, 0, 479, 90 ,100);
    this.copyLeftToRight(0, 125, 479, 250 , 213);

    this.mirrorVertical();

  }
    
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null, bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null, bottomColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }

  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null, bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null, bottomColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        bottomPixel = pixels[row+1][col];
        rightColor = rightPixel.getColor();
        bottomColor = bottomPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist || leftPixel.colorDistance(bottomColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }


  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this

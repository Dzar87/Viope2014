package group5.viope2014;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pill extends MazeElement
{
	public Pill(int x, int y) {super.move(x,y);}

    /* Override to prevent the movement of the Pill */
    @Override 
    public void move(int x, int y){}

    /* Set the offset =0 because the element can't be moved */
    @Override 
    public int getHorizontalOffset(int x){return 0;}
    
    @Override 
    public int getVerticalOffset(int y){return 0;}

    @Override
    public String toString(){return "P";}   /* Return the symbol of Power Pill */
    
    public static int getPoints()
    {
        return 50; // Returns the value points of each pill
    }

    public static ImageView getPicture()
    {
        return new ImageView(new Image("./white/pill.png"));
    }
}
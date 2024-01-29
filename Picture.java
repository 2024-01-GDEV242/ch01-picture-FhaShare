/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Fhaungfha Suvannakajorn
 * @version 2024.01.29
 */
public class Picture
{
    private Person leg;
    private Circle topHead;
    private Square eraseHead;
    private Triangle bottomHead;
    private Circle bottomBody;
    private Circle topBody;
    private Circle insideWing;
    private Circle outsideWing;
    private Triangle eraseWing;
    private Circle outlineEye;
    private Circle whiteEye1;
    private Circle blackEye1;
    private Square whiteEye2;
    private Circle blackEye2;
    private Triangle topMouth;
    private Triangle bottomMouth;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        leg = new Person();
        topHead = new Circle();
        eraseHead = new Square();
        bottomHead = new Triangle();
        bottomBody = new Circle();
        topBody = new Circle();
        insideWing = new Circle();
        outsideWing = new Circle();
        eraseWing = new Triangle();
        outlineEye = new Circle();
        whiteEye1 = new Circle();
        blackEye1 = new Circle();
        whiteEye2 = new Square();
        blackEye2 = new Circle();
        topMouth = new Triangle();
        bottomMouth = new Triangle();      
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
           
    
    
            drawn = true;
            
         
            drawn = true;
            
           
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
    
    }
    
    /**
     * Draw sunset picture
     */
    public void drawSunset()
    {
     
    }
}


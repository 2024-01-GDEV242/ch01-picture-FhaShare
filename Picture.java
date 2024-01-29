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
    private Circle whiteEye2;
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
        whiteEye2 = new Circle();
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
            leg.makeVisible();
            leg.changeSize(100, 50);
            leg.moveVertical(35);
            leg.moveHorizontal(-30);
            drawn = true;
            
            topHead.makeVisible();
            topHead.changeSize(160);
            topHead.changeColor("blueBird");
            topHead.moveVertical(-80);
            topHead.moveHorizontal(-90);
            drawn = true;
            
            eraseHead.makeVisible();
            eraseHead.changeSize(100);
            eraseHead.moveHorizontal(-200);
            eraseHead.moveVertical(-30);
            eraseHead.changeColor("white");
            drawn = true;
            
            bottomHead.makeVisible();
            bottomHead.changeSize(-120, 140);
            bottomHead.changeColor("skyBlue");
            bottomHead.moveVertical(70);
            bottomHead.moveHorizontal(-5);
            drawn = true;
            
            bottomBody.makeVisible();
            bottomBody.changeSize(180);
            bottomBody.moveHorizontal(-70);
            bottomBody.moveVertical(10);
            bottomBody.changeColor("skyBlue");
            drawn = true;
            
            topBody.makeVisible();
            topBody.changeColor("lightBlue");
            topBody.changeSize(150);
            topBody.moveVertical(35);
            topBody.moveHorizontal(-35);
            drawn = true;
            
            insideWing.makeVisible();
            insideWing.changeSize(230);
            insideWing.moveVertical(-55);
            insideWing.changeColor("blueBird");
            insideWing.moveHorizontal(20);
            drawn = true;
            
            outsideWing.makeVisible();
            outsideWing.changeColor("darkBlue");
            outsideWing.changeSize(200);
            outsideWing.moveHorizontal(70);
            outsideWing.moveVertical(-15);
            drawn = true;
            
            eraseWing.makeVisible();
            eraseWing.changeSize(-300, 400);
            eraseWing.moveVertical(195);
            eraseWing.moveHorizontal(268);
            eraseWing.changeColor("white");
            drawn = true;
            
            outlineEye.makeVisible();
            outlineEye.changeSize(60);
            outlineEye.changeColor("black");
            outlineEye.moveVertical(-40);
            outlineEye.moveHorizontal(-50);
            drawn = true;
            
            whiteEye1.makeVisible();
            whiteEye1.changeSize(52);
            whiteEye1.changeColor("white");
            whiteEye1.moveVertical(-36);
            whiteEye1.moveHorizontal(-46);
            drawn = true;
            
            blackEye1.makeVisible();
            blackEye1.changeSize(35);
            blackEye1.changeColor("black");
            blackEye1.moveHorizontal(-40);
            blackEye1.moveVertical(-25);
            drawn = true;
            
            whiteEye2.makeVisible();
            whiteEye2.changeSize(25);
            whiteEye2.changeColor("white");
            whiteEye2.moveVertical(-30);
            whiteEye2.moveHorizontal(-30);
            drawn = true;
            
            topMouth.makeVisible();
            topMouth.changeSize(20, 80);
            topMouth.changeColor("black");
            topMouth.moveVertical(-60);
            topMouth.moveHorizontal(-70);
            drawn = true;
            
            bottomMouth.makeVisible();
            bottomMouth.changeColor("gray4");
            bottomMouth.changeSize(-15, 70);
            bottomMouth.moveVertical(-25);
            bottomMouth.moveHorizontal(-70);
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        topHead.changeColor("gray3");
        bottomHead.changeColor("gray1");
        bottomBody.changeColor("gray1");
        topBody.changeColor("gray2");
        insideWing.changeColor("gray3");
        outsideWing.changeColor("gray4");
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


import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Lab02 extends JComponent {
    int width, height; //variables needed throughout the class
    Turtle a, b, c; //three turtles, since we need to create many

    public Lab02(int width, int height) { //constructor
        this.width = width; //set the input to the object's values
        this.height = height;
        a = new Turtle( 20,  50, 0.3); //create three new turtles at 20, 50, and .3 times bigger
        b = new Turtle(220,  20, 0.5); //(x,y) and scale = size
        c = new Turtle( 40, 230, 0.4); //have to use .X because the original size of the drawing is 500x500
    }

    public void paintComponent(Graphics g) { //paintcomponent to create the drawings
        a.draw(g); //draw the first turtle
        b.draw(g); //second turtle
        c.draw(g); //third turtle
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(); //create a new frame
        frame.setVisible(true); //and make it visible
        int width = 500, height = 500; //set the height and width to the correct dimensions
        frame.setSize(width, height);  //set the frame to the corresponding dimensions
        Lab02 drawing = new Lab02(width, height); //use constructor to create a new drawing
        frame.add(drawing); //add the drawing to the frame
    }
}

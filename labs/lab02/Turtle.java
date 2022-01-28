import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Turtle {
    int x, y;
    double scale;

    public Turtle(int x, int y, double scale) {
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
    private int scale(int size) {
        return (int)(this.scale * size);
    }
    public void draw(Graphics g) {
        // default color is Color.BLACK
        g.setColor(Color.WHITE);
        g.fillRect(x + 0, y +  0, scale(501), scale(501));
        g.setColor(Color.BLACK);
        g.drawRect(x +  0, y +  0, scale(501), scale(501));
        g.setColor(Color.BLACK);
        g.setColor(Color.cyan);
        g.fillRect(x+scale(0), y+scale(0), scale(500), scale(500)); // background water
        g.setColor(new Color(158, 145, 120));
        g.fillRect(x+scale(0), y+scale(150), scale(500), scale(350)); //sand
        g.setColor(new Color(184, 169, 140));
        g.fillRect(x+scale(0), y+scale(150),scale(500), scale(50)); //lighter sand
        int left = 5;
        g.setColor(new Color(230, 154, 202));
        g.fillOval(x+scale(245), y+scale(1), scale(20), scale(30)); //tongue
        g.setColor(new Color(76, 168, 81));
        g.fillOval(x+ scale(205),  y+scale(10), scale(100), scale(100)); //head
        g.fillOval(x+ scale(65-left),  y+scale(80), scale(90), scale(60)); //left front foot
        g.fillOval(x+ scale(360-left), y+scale(80), scale(90), scale(60)); //right front foot
        g.fillOval(x+ scale(65-left),  y+scale(365), scale(90), scale(60)); //left bottom foot
        g.fillOval(x+ scale(360-left),  y+scale(365), scale(90), scale(60)); //right bottom foot
        g.fillPolygon(new Polygon(new int[] {x+scale(205), x+scale(255), x+scale(305)}, new int[] {y+scale(274), y+scale(499), y+scale(274)}, 3)); //tail
        g.setColor(new Color(54, 120, 58));
        g.fillOval( x+scale(65-left),  y+scale(65), scale(385), scale(385)); //shell outline
        g.setColor(new Color(115, 72, 52));
        g.fillOval( x+scale(75-left),  y+scale(75), scale(365), scale(365)); //shell
        g.setColor(new Color(158, 101, 74));
        g.fillOval(x+scale(160-left), y+scale(160), scale(200), scale(200)); //small circle on shell
        g.fillRect(x+scale(250), y+scale(75), scale(10), scale(100)); //lines on shell
        g.fillRect(x+scale(250), y+scale(340), scale(10), scale(100)); //lines on shell
        g.fillRect(x+scale(335), y+scale(250), scale(100), scale(10)); //lines on shell
        g.fillRect(x+scale(70), y+scale(250), scale(100), scale(10)); //lines on shell
        g.setColor(Color.white);
        g.fillOval(x+scale(215), y+scale(15), scale(25), scale(25)); //left white eye
        g.fillOval(x+scale(270), y+scale(15), scale(25), scale(25)); //right white eye
        g.setColor(Color.black);
        g.fillOval(x+scale(220),y+scale(15),scale(15),scale(15)); //left black eye
        g.fillOval(x+scale(275),y+scale(15),scale(15),scale(15)); //right black eye
    }

}
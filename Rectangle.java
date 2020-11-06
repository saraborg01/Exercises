import java.awt.*;

public class Rectangle extends Polygon{
    public Rectangle(Point centerPoint) {
        super(centerPoint);
    }

    @Override
    public void paint(Graphics g){
        Point currentCenter = getCenterPoint();
        g.drawRect(currentCenter.x -20, currentCenter.y -10, 40, 20);
    }
}

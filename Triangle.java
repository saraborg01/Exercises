import java.awt.*;

public class Triangle extends Polygon{
    public Triangle(Point centerPoint) {
        super(centerPoint);
    }
    @Override
    public void paint(Graphics g){
        Point currentCenter = getCenterPoint();
        g.drawLine(currentCenter.x, currentCenter.y-10, currentCenter.x-10, currentCenter.y+10);
        g.drawLine(currentCenter.x-10, currentCenter.y+10,
                currentCenter.x+10, currentCenter.y+10);
        g.drawLine(currentCenter.x+10, currentCenter.y+10, currentCenter.x, currentCenter.y-10);
    }
}

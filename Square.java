import java.awt.*;

public class Square extends Polygon {
    public Square(Point centerPoint) {
        super(centerPoint);
    }

    @Override
    public void paint(Graphics g){
        Point currentCenter = getCenterPoint();
        g.drawRect(currentCenter.x -10, currentCenter.y -10, 20, 20);
    }
}

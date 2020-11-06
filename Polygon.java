import java.awt.*;

public abstract class Polygon {
    private final Point centerPoint;

    private Polygon(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Polygon(int x, int y){
        this(new Point(x,y));
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public abstract void paint(Graphics g);

}

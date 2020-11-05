import java.awt.*;

public class Polygon {

    private final String name;
    private final Point centerPoint;

    public Polygon(String name, Point centerPoint) {
        this.name = name;
        this.centerPoint = centerPoint;
    }

    public String getName() {
        return name;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void paint(Graphics g){
        String currentPolygon = getName();
        if (currentPolygon.equals("square")) {
            paintSquare(g);
        }
        else if (currentPolygon.equals("triangle")) {
            paintTriangle(g);
        } else if (currentPolygon.equals("rectangle")){
            paintRectangle(g);
        }
    }

    public void paintSquare(Graphics g){
        Point currentCenter = getCenterPoint();
        g.drawRect(currentCenter.x -10, currentCenter.y -10, 20, 20);
    }
    public void paintTriangle(Graphics g){
        Point currentCenter = getCenterPoint();
        g.drawLine(currentCenter.x, currentCenter.y-10, currentCenter.x-10, currentCenter.y+10);
        g.drawLine(currentCenter.x-10, currentCenter.y+10,
                currentCenter.x+10, currentCenter.y+10);
        g.drawLine(currentCenter.x+10, currentCenter.y+10, currentCenter.x, currentCenter.y-10);
    }
    public void paintRectangle(Graphics g){
        Point currentCenter = getCenterPoint();
        g.drawRect(currentCenter.x -20, currentCenter.y -10, 40, 20);
    }
}

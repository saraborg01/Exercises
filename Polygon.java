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

    }
    public void paintTriangle(Graphics g){

    }
    public void paintRectangle(Graphics g){

    }
}

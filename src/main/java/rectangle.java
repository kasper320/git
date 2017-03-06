import java.awt.*;

/**
 * Created by RENT on 2017-03-06.
 */
public class rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }
//TO DO
    @Override
    public boolean equals(Object obj) {
        return false;
    }
    public double centersDistance(Rectangle rectangle){
        return 0d;
    }
    public boolean intersects (Rectangle rectangle){
        return false;
    }
    public Rectangle common (Rectangle rectangle){
        return null;
    }
    public double area(){
        return 0;
    }
}

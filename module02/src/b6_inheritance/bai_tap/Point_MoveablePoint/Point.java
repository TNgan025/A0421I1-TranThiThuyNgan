package b6_inheritance.bai_tap.Point_MoveablePoint;

public class Point {
    float x =0.0f;
    float y =0.0f;
    float [] XY = {x,y};

    public Point() {

    }
    public Point(float x,float y) {
        this.x = x ;
        this.y = y ;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return XY;
    }

    public void setXY(float []XY) {
        this.XY = XY;
    }
    public String toString() {
        return "(x,y)";
    }
}

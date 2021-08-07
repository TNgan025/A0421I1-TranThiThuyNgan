package b6_inheritance.bai_tap.Point_MoveablePoint;

public class MoveablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    float [] Speed = {xSpeed,ySpeed};
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint() {}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return Speed;
    }

    public void setSpeed(float[] speed) {
        Speed = speed;
    }
    public String toString() {
        return "(x,y),speed = (xs,xy)";
    }
    public MoveablePoint move() {
        x +=xSpeed;
        y +=ySpeed;
        return this;
    }
}

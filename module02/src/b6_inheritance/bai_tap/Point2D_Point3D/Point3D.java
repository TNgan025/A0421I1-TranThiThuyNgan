package b6_inheritance.bai_tap.Point2D_Point3D;

public class Point3D extends Point2D{
    float z = 0.0f;
    float [] XYZ = {x,y,z};
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }
    public Point3D() {

    };

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return XYZ;
    }

    public void setXYZ(float[] XYZ) {
        this.XYZ = XYZ;
    }
    public String toString() {
        return "(x,y,z)";
    }
}

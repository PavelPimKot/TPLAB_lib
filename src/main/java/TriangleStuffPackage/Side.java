package TriangleStuffPackage;

public class Side {
    private Point x;
    private Point y;

    public Side(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public static Side valueOf(double x, double y, double x1, double y1) {
        return new Side(Point.valueOf(x, y), Point.valueOf(x1, y1));
    }

    public double length() {
        return x.distanceToAnotherPoint(y);
    }

    public double similarNumber(Side side) {
        return length() / side.length();
    }

    public Point getX() {
        return x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public void setX(Point x) {
        this.x = x;
    }
}

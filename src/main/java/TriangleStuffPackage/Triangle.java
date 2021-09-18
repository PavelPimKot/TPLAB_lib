package TriangleStuffPackage;

public class Triangle {

    private Side firstSide;

    private Side secondSide;

    private Side thirdSide;

    public Triangle(Side side1, Side side2, Side side3) {
        firstSide = side1;
        secondSide = side2;
        thirdSide = side3;
    }

    public static Triangle valueOf(double x, double y, double x1, double y1, double x2, double y2) {
        return new Triangle(
                Side.valueOf(x, y, x1, y1),
                Side.valueOf(x1, y1, x2, y2),
                Side.valueOf(x2, y2, x, y)
        );
    }

    public boolean isSimilar(Triangle triangle) {
        double first = firstSide.similarNumber(triangle.getFirstSide());
        double second = secondSide.similarNumber(triangle.getSecondSide());
        double third = thirdSide.similarNumber(triangle.getThirdSide());
        boolean result = Double.compare(first, second) == 0 && Double.compare(second, third) == 0;
        if (result) {
            return true;
        }
        first = firstSide.similarNumber(triangle.getThirdSide());
        second = secondSide.similarNumber(triangle.getFirstSide());
        third = thirdSide.similarNumber(triangle.getSecondSide());
        result = Double.compare(first, second) == 0 && Double.compare(second, third) == 0;
        if (result) {
            return true;
        }
        first = firstSide.similarNumber(triangle.getSecondSide());
        second = secondSide.similarNumber(triangle.getThirdSide());
        third = thirdSide.similarNumber(triangle.getFirstSide());
        result = Double.compare(first, second) == 0 && Double.compare(second, third) == 0;
        return result;
    }

    public Side getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(Side firstSide) {
        this.firstSide = firstSide;
    }

    public Side getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Side secondSide) {
        this.secondSide = secondSide;
    }

    public Side getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(Side thirdSide) {
        this.thirdSide = thirdSide;
    }
}

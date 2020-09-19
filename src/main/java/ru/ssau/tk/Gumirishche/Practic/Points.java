package ru.ssau.tk.Gumirishche.Practic;

public class Points extends Point {
    public Points(double x, double y, double z) {
        super(x, y, z);
    }

    public static Points sum(Points x, Points y) {
        double ox = x.x + y.x;
        double oy = x.y + y.y;
        double oz = x.z + y.z;
        Points point = new Points(ox, oy, oz);
        return point;
    }

    public static Points subtract(Points x, Points y) {
        double ox = x.x - y.x;
        double oy = x.y - y.y;
        double oz = x.z - y.z;
        Points point = new Points(ox, oy, oz);
        return point;
    }

    public static Points multiply(Points x, Points y) {
        double ox = x.x * y.x;
        double oy = x.y * y.y;
        double oz = x.z * y.z;
        Points point = new Points(ox, oy, oz);
        return point;
    }

    public static Points divide(Points x, Points y) {
        double ox = x.x / y.x;
        double oy = x.y / y.y;
        double oz = x.z / y.z;
        Points point = new Points(ox, oy, oz);
        return point;
    }

    public static void printPoint(Points x) {
        System.out.print("OX=");
        System.out.println(x.x);
        System.out.print("OY=");
        System.out.println(x.y);
        System.out.print("OZ=");
        System.out.println(x.z);
    }

    public Points enlarge(Points x, double y) {
        double ox = x.x * y;
        double oy = x.y * y;
        double oz = x.z * y;
        Points point = new Points(ox, oy, oz);
        return point;
    }

    @Override
    public double length(Point x) {
        return x.length(x);
    }

    public Points opposite(Points x) {
        double ox = -x.x;
        double oy = -x.y;
        double oz = -x.z;
        Points point = new Points(ox, oy, oz);
        return point;
    }

    public Points inverse(Points x) {
        double ox = 1 / x.x;
        double oy = 1 / x.y;
        double oz = 1 / x.z;
        Points point = new Points(ox, oy, oz);
        return point;
    }

    public double scalarProduct(Points x, Points y) {
        double ox = x.x * y.x;
        double oy = x.y * y.y;
        double oz = x.z * y.z;
        return ox + oy + oz;
    }

    public Points vectorProduct(Points x, Points y) {
        double ox = (x.y * y.z) - (x.z * y.y);
        double oy = -((x.x * y.z) - (x.z * y.x));
        double oz = (x.x * y.y) - (x.y * y.x);
        Points point = new Points(ox, oy, oz);
        return point;
    }

    public static void main(String[] args) {
        Points point1 = new Points(1, 2, 3);
        Points point2 = new Points(3, 2, 1);
        Points pointSum = sum(point1, point2);
        Points pointSubtract = subtract(point1, point2);
        Points pointMultiply = multiply(point1, point2);
        Points pointDivide = divide(point1, point2);
        printPoint(pointSum);
        printPoint(pointSubtract);
        printPoint(pointMultiply);
        printPoint(pointDivide);
    }
}

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point point2) {
        return Math.sqrt(Math.pow((point2.x - x), 2) + Math.pow((point2.y - y), 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Prism {
    double base_side = 0;
    Triangle triangle;


    public Prism(double base_side, Triangle triangle) {
        this.base_side = base_side;
        this.triangle = triangle;
    }

    public double volume() {
        return base_side * triangle.perimeter();
    }

    public double lateral_square() {
        return triangle.square()*base_side;
    }
}

class Triangle {
    double a = 0;
    double b = 0;
    double c = 0;
    public Triangle(double a, double b, double c) {
        if ((a + b < c) | (a + c < b) | (b + c < a)) {
            throw new RuntimeException("This triangle does not exist!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double perimeter() {
        return a + b + c;
    }
    public double square() {
        double p = (a+b+c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

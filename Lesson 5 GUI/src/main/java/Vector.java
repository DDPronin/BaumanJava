import java.sql.SQLOutput;

public class Vector {
    double[] features;

    public Vector(double[] features) {
        this.features = features;
    }

    public void show() {
        System.out.print("(");
        for (int i = 0; i < features.length - 1; i++) {
            System.out.print(features[i] + ", ");
        }
        System.out.print(features[features.length - 1] + ")" + '\n');
    }
    public Vector sum(Vector vector2) {
        if (features.length != vector2.features.length) {
            throw new UnsupportedOperationException("Операция сложения не определена для векторов разной размерности!");
        }
        Vector out = new Vector(new double[features.length]);
        for(int i = 0; i < features.length; i++) {
            out.features[i] = features[i] + vector2.features[i];
        }
        return out;
    }

    public Vector diff(Vector vector2) {
        if (features.length != vector2.features.length) {
            throw new UnsupportedOperationException("Операция вычитания не определена для векторов разной размерности!");
        }
        Vector out = new Vector(new double[features.length]);
        for(int i = 0; i < features.length; i++) {
            out.features[i] = features[i] - vector2.features[i];
        }
        return out;
    }

    public double scalarMult(Vector vector2) {
        if (features.length != vector2.features.length) {
            throw new UnsupportedOperationException("Операция скалярного произведения не определена для векторов разной размерности!");
        }
        double s = 0;
        for(int i = 0; i < features.length; i++) {
            s += features[i] * vector2.features[i];
        }
        return s;
    }

    public double length() {
        double s = 0;
        for (double feature : features) {
            s += feature * feature;
        }
        return Math.sqrt(s);
    }

    public double angle(Vector vector2) {
        if (features.length != vector2.features.length) {
            throw new UnsupportedOperationException("Угол не определен для векторов разной размерности!");
        }
        return Math.acos(scalarMult(vector2) / length() * vector2.length());
    }

    public double vectorMultFigureSquare(Vector vector2) {
        return length() * vector2.length() * Math.sin(angle(vector2));
    }
}

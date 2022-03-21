public class integration {
    public static double main(double a, double b, int integration_steps) {
        double sum = 0;
        double step = (b-a)/integration_steps;
        for (double i = a; i < b; i+=step) {
            sum += step*function(i);
        }
        return sum;
    }

    public static double function(double x) {
        return Math.pow(x, 12) * Math.sin(x);
    }
}

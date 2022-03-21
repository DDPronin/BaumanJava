public class poltnomSolution {
    public static double main() {
       double min = 0;
       double max = 10;
       while ((Main.someFunction(min) * Main.someFunction(max) < 0) & (max - min > 0.0001)) {
           if (Main.someFunction((max+min)/2) > 0) {
               max = (max+min)/2;
           } else {
               min = (max+min)/2;
           }
       }
        return (min+max)/2;
    }

}

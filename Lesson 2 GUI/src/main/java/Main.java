import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rublesAmount = scanner.nextDouble();
        System.out.println(exchangeToUSD(rublesAmount));
    }
    public static double exchangeToUSD(double rublesAmount) {
        if (rublesAmount > 0.0) {
            double USDAmount = rublesAmount / 83.0;
            return USDAmount;
        }
        return 0;
    }
}

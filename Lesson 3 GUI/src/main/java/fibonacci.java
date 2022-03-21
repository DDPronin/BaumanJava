import java.math.BigDecimal;

public class fibonacci {
    public static boolean isFib(int number) {
        int prevFib = 0;
        int fib = 1;
        int tempFib = 0;
        while (fib < number) {
            tempFib = fib;
            fib = fib + prevFib;
            prevFib = tempFib;
        }
        return fib == number;
    }

    public static int n_fib(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 1;
        for (int i = 0; i < n; ++i) {
            int a1 = a;
            int b1 = b;
            int c1 = c;
            int d1 = d;
            a = a1*a1 + b1*c1;
            b = a1*b1 + b1*d1;
            c = c1*a1 + c1*d1;
            d = c1*b1 + d1*d1;
        }
        return c;
    }
}

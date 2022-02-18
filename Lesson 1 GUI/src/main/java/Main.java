public class Main {
    public static void main(String[] args) { // (psvm) вызывается для класса, пр выполнении программы как в С++
        int x = 10;
        int y = 5;
        System.out.println(x); // (sout)
        System.out.println(y);
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        int m = 2_000_000_000;
        int n = m + m;
        System.out.println(n);
        System.out.println(m + m);

        byte b = 10;
        short s = 10;
        System.out.println(s + b);
        int result = s + b;

        short p = 5, q = 10;
        short pq = ((short) (p + q));

        double d = 1.4; // точнее по знакам после запятой
        float f1 = 1.4f; // больше диапозон значений
        System.out.println(d);
        System.out.println(1.0 / 3.0);

        boolean bool = true;

        float f2 = 1.4f;
        System.out.println(f1); // ctrl d - дублирование кода

        System.out.println((8 > 7) & (-1 > 2));

        if (1 > 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
    }
}

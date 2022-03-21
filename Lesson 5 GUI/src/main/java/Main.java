import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите координату х1: ");
//        double x = scanner.nextDouble();
//        System.out.print("Введите координату у1: ");
//        double y = scanner.nextDouble();
//        Point point1 = new Point(x, y);
//
//        System.out.print("Введите координату х2: ");
//        x = scanner.nextDouble();
//        System.out.print("Введите координату у2: ");
//        y = scanner.nextDouble();
//        Point point2 = new Point(x, y);
//
//        System.out.println("Расстояние от точки 1 до точки 2: " + point1.distanceTo(point2));
//        System.out.println("Координаты точки 1: " + point1.toString());


        Strings strings = new Strings(new String[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++ Вводите элементы в порядке возрастания +++");
        System.out.print("Введите первый строковый элемент массива: ");
        strings.append(scanner.nextLine());
        System.out.print("Введите второй строковый элемент массива: ");
        strings.append(scanner.nextLine());
        System.out.print("Введите третий строковый элемент массива: ");
        strings.append(scanner.nextLine());
        System.out.println("Максимальный элемент: " + strings.max());
        System.out.println("Средняя длина элемента: " + strings.mean());
        strings.show();


//        double[] f1 = new double[2];
//        f1[0] = 0;
//        f1[1] = 1;
//        double[] f2 = new double[2];
//        f2[0] = 1;
//        f2[1] = 0;
//        Vector vector1 = new Vector(f1);
//        Vector vector2 = new Vector(f2);
//        System.out.println("Длина вектора 1: " + vector1.length());
//        System.out.println("Длина вектора 2: " + vector2.length());
//        System.out.print("Вектортная сумма: ");
//        vector1.sum(vector2).show();
//        System.out.print("Векторная разность: ");
//        vector1.diff(vector2).show();
//        System.out.println("Скалярное произведение: " + vector1.scalarMult(vector2));
//        System.out.println("Угол между векторами: " + vector1.angle(vector2));
//        System.out.println("Площадь параллелограмма на векторах: " + vector1.vectorMultFigureSquare(vector2));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min_frontier = 0;
        int max_frontier = Integer.MAX_VALUE;
        int middle = 0;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадайте число и отвечайте на вопросы! Введите:");
        System.out.println("1 - если ваше число больше, " +
                           "2 - если ваше число меньше, " +
                           "3 - если это ваше число \n");
        for (int i = 0; i < 33; ++i) {
            middle = (max_frontier + min_frontier) / 2;
            if (min_frontier + 2 == max_frontier) {
                System.out.println("Вы загадали число " + middle + "!");
                break;
            }
            System.out.println("Оно больше, меньше или равно " + middle + "?");
            answer = scanner.nextInt();
            if (answer == 1) {
                min_frontier = middle;
            }
            if (answer == 2) {
                max_frontier = middle;
            }
            if (answer == 3) {
                System.out.println("Вы загадали число " + middle + "!");
                break;
            }
        }
    }
}

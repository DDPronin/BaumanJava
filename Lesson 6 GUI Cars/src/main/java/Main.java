public class Main {
    public static void main(String[] args) {
        Wheel W1 = new Wheel("W1", 0.5);
        Wheel W2 = new Wheel("W1", 0.6);
        Car BMW = new Car("BMW X6", W1);
        System.out.println(BMW.getRollsNumber(1));
        BMW.changeWeeels(W2);
        System.out.println(BMW.getRollsNumber(1));
    }
}

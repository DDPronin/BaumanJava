public class Car {
    private String name;
    private Wheel wheel;

    public Car(String name, Wheel wheel) {
        this.name = name;
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void changeWeeels(Wheel newWheel) {
        wheel = newWheel;
    }

    public double getRollsNumber(int Kilometers) {
        return (Kilometers*1000)/(2*Math.PI*wheel.getRadius());
    }
}

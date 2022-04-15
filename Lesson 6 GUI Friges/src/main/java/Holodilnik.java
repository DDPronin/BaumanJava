public abstract class Holodilnik {
    String name;
    Product[] products;
    int temperature;
    protected int minTemperature;
    protected int maxTemperature;

    public String getName() {
        return name;
    };
    public int getTemperature() {
        return temperature;
    }
    public abstract void changeTemperature();
}

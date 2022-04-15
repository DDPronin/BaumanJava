public class Vitaz1 extends Vitaz {

    public Vitaz1(Product[] products, int startTemperature, int minTemperature, int maxTemperature) {
        this.name = "Vitaz1";
        this.products = products;
        this.temperature = startTemperature;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void changeTemperature() {
        if ((minTemperature <= temperature-1) & (temperature-1 <= maxTemperature)) {
            temperature -= 1;
        }
    }
}

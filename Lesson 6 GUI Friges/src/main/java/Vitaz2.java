public class Vitaz2 extends Vitaz {

    public Vitaz2(Product[] products, int startTemperature, int minTemperature, int maxTemperature) {
        this.name = "Vitaz2";
        this.products = products;
        this.temperature = startTemperature;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void changeTemperature() {
        if ((minTemperature <= temperature-2) & (temperature-2 <= maxTemperature)) {
            temperature -= 2;
        }
    }
}

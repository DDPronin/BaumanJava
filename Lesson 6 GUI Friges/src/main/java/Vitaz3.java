public class Vitaz3 extends Vitaz {

    public Vitaz3(Product[] products, int startTemperature, int minTemperature, int maxTemperature) {
        this.name = "Vitaz3";
        this.products = products;
        this.temperature = startTemperature;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    @Override
    public void changeTemperature() {
        if ((minTemperature <= temperature-3) & (temperature-3 <= maxTemperature)) {
            temperature -= 3;
        }
    }
}


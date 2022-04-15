public class Holod90 extends Holod{

    public Holod90(Product[] products, int startTemperature, int minTemperature, int maxTemperature) {
        super(90);
        this.name = "Holod75";
        this.products = products;
        this.temperature = startTemperature;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }
}

public class Holod75 extends Holod {

    public Holod75(Product[] products, int startTemperature, int minTemperature, int maxTemperature) {
        super(75);
        this.name = "Holod75";
        this.products = products;
        this.temperature = startTemperature;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }
}

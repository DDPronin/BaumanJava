public abstract class Holod extends Holodilnik {
    int weight;

    public Holod(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getProductsCalories() {
        int caloriesSum = 0;
        for (Product product : products) {
            caloriesSum += product.getCalories();
        }
        return caloriesSum;
    }

    public void changeTemperature() {
        throw new RuntimeException("Undefined now.");
    }
}
public abstract class Vitaz extends Holodilnik {

    public String[] getProducts() {
        String[] productNames = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productNames[i] = products[i].getName();
        }
        return productNames;
    }
}

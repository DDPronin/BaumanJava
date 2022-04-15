public class Main {
    public static void main(String[] args) {

        Product Sausage = new Product("Sausage", 250);
        Product Cheese = new Product("Cheese", 300);

        Product[] products = new Product[2];
        products[0] = Sausage;
        products[1] = Cheese;

        Vitaz1 V1 = new Vitaz1(products, 0, -10, 10);
        Vitaz2 V2 = new Vitaz2(products, 0, -10, 10);
        Vitaz3 V3 = new Vitaz3(products, 0, -10, 10);

        V1.changeTemperature();
        V2.changeTemperature();
        V3.changeTemperature();

        System.out.println(V1.getName() + " : " + " temp: " + V1.getTemperature() + " PROD: ");
        for (String product : V1.getProducts()) {
            System.out.println(product);
        }

        System.out.println(V2.getName() + " : " + " temp: " + V2.getTemperature() + " PROD: ");
        for (String product : V2.getProducts()) {
            System.out.println(product);
        }

        System.out.println(V3.getName() + " : " + " temp: " + V3.getTemperature() + " PROD: ");
        for (String product : V3.getProducts()) {
            System.out.println(product);
        }

        Holod75 H1 = new Holod75(products, -10, 0, 10);
        Holod90 H2 = new Holod90(products, -10, 0, 10);

        System.out.println(H1.getName() + " : " + " weight: " + H1.getWeight() + " Cal.:" + H1.getProductsCalories());
        System.out.println(H2.getName() + " : " + " weight: " + H2.getWeight() + " Cal.:" + H2.getProductsCalories());
    }
}

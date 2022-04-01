import java.util.Objects;

public class Food {
    Product[] products;

    public Food(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public boolean isInHome(String productName) {
        for (Product product : products) {
            if (Objects.equals(product.getName(), productName)) {
                return true;
            }
        }
        return false;
    }
}

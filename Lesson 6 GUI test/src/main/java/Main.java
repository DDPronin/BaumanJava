import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем продукты и их цены
        Product[] products = new Product[5];
        String[] names = {"Cheese", "Sausages", "Mushrooms", "Milk", "Eggs"};
        int[] prices = {300, 400, 150, 100, 50};
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(names[i], prices[i]);
        }

        Food weHave = new Food(products);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, print names of products with big first liter in english!");
        System.out.print("Search: ");
        String searchedProduct = sc.next();
        if (weHave.isInHome(searchedProduct)) {
            System.out.println("We have it!");
        }
        else {
            System.out.println("We don't have it!");
        }
    }
}

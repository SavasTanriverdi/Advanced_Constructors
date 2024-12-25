// Main class to demonstrate advanced constructor concepts
public class AdvancedConstructors {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Product product1 = new Product();
        product1.displayProductInfo();

        Product product2 = new Product("Laptop");
        product2.displayProductInfo();

        Product product3 = new Product("Smartphone", 699.99);
        product3.displayProductInfo();

        Product product4 = new Product("Tablet", 299.99, 50);
        product4.displayProductInfo();
    }
}
// Class representing a Product
class Product {
    private String name;
    private double price;
    private int stock;

    // Default constructor
    public Product() {
        this("Default Product", 0.0, 0);
        System.out.println("Default constructor called.");
    }

    // Constructor with one parameter
    public Product(String name) {
        this(name, 0.0, 0);
        System.out.println("Constructor with name parameter called.");
    }

    // Constructor with two parameters
    public Product(String name, double price) {
        this(name, price, 0);
        System.out.println("Constructor with name and price parameters called.");
    }

    // Constructor with all parameters
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        System.out.println("Constructor with all parameters called.");
    }

    // Method to display product details
    public void displayProductInfo() {
        System.out.println("Product Name: " + name + ", Price: $" + price + ", Stock: " + stock);
    }
}
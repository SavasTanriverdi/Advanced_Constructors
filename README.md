# Advanced_Constructors

This project focuses on advanced topics related to constructors in Java. It covers **constructor overloading**, **this() keyword usage**, and **constructor chaining**. The example revolves around a `Product` class that uses multiple constructors to initialize object attributes in different ways.

---

## Features
- **Default Constructor**: Sets default values for attributes and invokes the all-parameter constructor.
- **Overloaded Constructors**: Provides flexibility by allowing different combinations of parameters during object creation.
- **Constructor Chaining**: Uses `this()` to call one constructor from another, reducing code duplication.
- Includes a method `displayProductInfo()` to display product details.

---

## Code Overview

### 1. `Product` Class
- **Attributes**: `name` (String), `price` (double), and `stock` (int) to represent product details.
- **Constructors**:
    - Default constructor: Calls the all-parameter constructor with default values.
    - Overloaded constructors:
        - Accepts `name` only.
        - Accepts `name` and `price`.
        - Accepts `name`, `price`, and `stock`.
    - Implements constructor chaining using the `this()` keyword.
- **Method**:
    - `displayProductInfo()` - Prints the product's details.

### 2. `AdvancedConstructors` Class
- Contains the `main` method, which:
    - Demonstrates object creation using all constructor variations.
    - Calls `displayProductInfo()` for each object to observe the results.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `AdvancedConstructors.java` file.

---

## Sample Output

```plaintext
Constructor with all parameters called.
Default constructor called.
Product Name: Default Product, Price: $0.0, Stock: 0

Constructor with all parameters called.
Constructor with name parameter called.
Product Name: Laptop, Price: $0.0, Stock: 0

Constructor with all parameters called.
Constructor with name and price parameters called.
Product Name: Smartphone, Price: $699.99, Stock: 0

Constructor with all parameters called.
Product Name: Tablet, Price: $299.99, Stock: 50

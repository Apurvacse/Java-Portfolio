package activity;
public class Product {
    // Attributes
    private String productName;
    private double price;

    // Default constructor
    public Product() {
        // Initialize with default values
        this.productName = "";
        this.price = 0.0;
    }

    // Method to set the product name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Method to set the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to get the product name
    public String getProductName() {
        return productName;
    }

    // Method to get the price
    public double getPrice() {
        return price;
        }
}
public class Product {
    public static void main(String[] args) {
        // Instantiate an object of Product class
        Product laptop = new Product();

        // Set the product name to "Laptop"
        laptop.setProductName("Laptop");

        // Set the price to $800
        laptop.setPrice(800.0);

        // Output the product details to verify
        System.out.println("Product Name: " + laptop.getProductName());
        System.out.println("Price: $" + laptop.getPrice());
        }
}
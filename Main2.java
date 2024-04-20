package activity;
public class Main2 {
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
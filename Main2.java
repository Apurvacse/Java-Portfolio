package activity;
public class Main2 {
    public static void main(String[] args) {
        Product laptop = new Product();
        laptop.setProductName("Laptop");
        laptop.setPrice(800.0);
        System.out.println("Product Name: " + laptop.getProductName());
        System.out.println("Price: $" + laptop.getPrice());
        }
}
package activity;
public class Product {
    private String productName;
    private double price;

    public Product() {
        this.productName = "";
        this.price = 0.0;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
        }
}

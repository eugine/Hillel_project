package hw15;
import java.time.LocalDate;

public class Product {
    private ProductCategory category;
    private double price;
    private boolean discountAvailable;
    private LocalDate dateAdded;

    public Product(ProductCategory category, double price, boolean discountAvailable, LocalDate dateAdded) {
        this.category = category;
        this.price = price;
        this.discountAvailable = discountAvailable;
        this.dateAdded = dateAdded;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountAvailable() {
        return discountAvailable;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return "hw1.Product{" +
                "category=" + category +
                ", price=" + price +
                ", discountAvailable=" + discountAvailable +
                ", dateAdded=" + dateAdded +
                '}';
    }
}

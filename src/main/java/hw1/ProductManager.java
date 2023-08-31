package hw1;
import java.util.List;
import java.util.stream.Collectors;

public class ProductManager {
    public static List<Product> getFilteredProducts(List<Product> products) {
        return products.stream()
                .filter(product -> ProductCategory.BOOK.equals(product.getCategory()))
                .filter(product -> product.getPrice() > 250)
                .toList();
    }

    public static List<Product> getDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(product -> ProductCategory.BOOK.equals(product.getCategory()))
                .filter(Product::isDiscountAvailable)
                .map(product -> new Product(
                        product.getCategory(),
                        product.getPrice() * 0.9,
                        product.isDiscountAvailable(),
                        product.getDateAdded())
                )
                .collect(Collectors.toList());
    }
}

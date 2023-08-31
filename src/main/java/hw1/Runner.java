package hw1;
import java.util.List;
public class Runner {
    public static void main(String[] args) {
        // 1. Реалізувати метод отримання всіх продуктів у вигляді списку, категорія яких еквівалентна “Book” та ціна більш ніж 250.
        List<Product> products = ProductGenerator.generateRandomProducts(20);
        List<Product> filteredProducts = ProductManager.getFilteredProducts(products);
        filteredProducts.forEach(System.out::println);

        //


        List<Product> discountedBooks = ProductManager.getDiscountedBooks(products);
        discountedBooks.forEach(System.out::println);
    }
}

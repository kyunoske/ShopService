package ProductRepo;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void listOfProducts_WhenCalled_ReturnAllProducts() {
        //Given
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe");

        List<Product> productList = List.of(product1, product2, product3);
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);

        //When
        List<Product> actual = productRepo.listOfProducts();

        //Then
        assertEquals(productList, actual);
    }

    @Test
    void getProductById() {

        //Given
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe");

        List<Product> productList = List.of(product1, product2, product3);
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);

        //When
        Product actual = productRepo.getProductById(1);

        //Then
        Product expected = new Product(1, "Book");
        assertEquals(expected, actual);
    }
}
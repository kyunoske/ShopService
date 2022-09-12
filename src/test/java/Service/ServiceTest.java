package Service;

import ProductRepo.ProductRepo;
import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void getProductId() {
        //Given
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe");

        List<Product> productList = List.of(product1, product2, product3);
        Service service = new Service();
        service.add(product1);
        service.add(product2);
        service.add(product3);

        //When
        Product actual = service.getProductId(1);

        //Then
        Product expected = new Product(1, "Book");
        assertEquals(expected, actual);
    }

    @Test
    void getAllProducts() {
        //Given
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe");

        List<Product> productList = List.of(product1, product2, product3);
        Service service = new Service();
        service.add(product1);
        service.add(product2);
        service.add(product3);

        //When
        List<Product> actual = service.getAllProducts();

        //Then
        List<Product> expected = List.of(product1, product2, product3);
        assertEquals(expected, actual);
    }

    @Test
    void add() {
    }

    @Test
    void addOrder() {
    }

    @Test
    void getOrderId() {
    }

    @Test
    void getAllOrders() {
    }

    @Test
    void addCustomer() {
    }

    @Test
    void getCustomerId() {
    }

    @Test
    void getAllCustomers() {
    }
}
package Service;

import CustomerRepo.CustomerRepo;
import OrderRepo.OrderRepo;
import ProductRepo.ProductRepo;
import model.Customer;
import model.Order;
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
        //Given
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe");

        List<Product> productList = List.of(product1, product2, product3);
        Service service = new Service();
        service.add(product1);
        service.add(product2);
        service.add(product3);

        Customer customer1 = new Customer(1, "Valentino", "Rossi", "46 The Doctor", "1234-5678");
        Customer customer2 = new Customer(2, "Troy", "Bayliss", "21 Aussi Way", "1234-5678");
        Customer customer3 = new Customer(3, "Nicky", "Hayden", "69 Kentucky Kid", "1234-5678");

        List<Customer> customerList = List.of(customer1, customer2, customer3);
        Service serviceC = new Service();
        serviceC.addCustomer(customer1);
        serviceC.addCustomer(customer2);
        serviceC.addCustomer(customer3);

        Order order1 = new Order(1, List.of(product1, product2, product3), List.of(customer3));
        Order order2 = new Order(2, List.of(product1), List.of(customer1));
        Order order3 = new Order(3, List.of(product1, product3), List.of(customer2));

        List<Order> orderList = List.of(order1, order2, order3);
        Service serviceO = new Service();
        serviceO.addOrder(order1);
        serviceO.addOrder(order2);
        serviceO.addOrder(order3);

        //When
        Order actual = serviceO.getOrderId(1)    ;

        //Then
        Order expected = new Order(1, List.of(product1, product2, product3), List.of(customer3));
        assertEquals(order1, actual);
    }

    @Test
    void getAllOrders() {
        //Given
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe");

        List<Product> productList = List.of(product1, product2, product3);
        Service service = new Service();
        service.add(product1);
        service.add(product2);
        service.add(product3);

        Customer customer1 = new Customer(1, "Valentino", "Rossi", "46 The Doctor", "1234-5678");
        Customer customer2 = new Customer(2, "Troy", "Bayliss", "21 Aussi Way", "1234-5678");
        Customer customer3 = new Customer(3, "Nicky", "Hayden", "69 Kentucky Kid", "1234-5678");

        List<Customer> customerList = List.of(customer1, customer2, customer3);
        Service serviceC = new Service();
        serviceC.addCustomer(customer1);
        serviceC.addCustomer(customer2);
        serviceC.addCustomer(customer3);

        Order order1 = new Order(1, List.of(product1, product2, product3), List.of(customer3));
        Order order2 = new Order(2, List.of(product1), List.of(customer1));
        Order order3 = new Order(3, List.of(product1, product3), List.of(customer2));

        List<Order> orderList = List.of(order1, order2, order3);
        Service serviceO = new Service();
        serviceO.addOrder(order1);
        serviceO.addOrder(order2);
        serviceO.addOrder(order3);

        //When
        List<Order> actual = serviceO.getAllOrders()    ;

        //Then
        Product expected = new Product(1, "Book");
        assertEquals(orderList, actual);
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
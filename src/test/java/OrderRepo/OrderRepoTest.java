package OrderRepo;

import CustomerRepo.CustomerRepo;
import ProductRepo.ProductRepo;
import Service.Service;
import model.Customer;
import model.Order;
import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void listOfOrders() {
        //Given
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe");

        List<Product> productList = List.of(product1, product2, product3);
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);

        Customer customer1 = new Customer(1, "Valentino", "Rossi", "46 The Doctor", "1234-5678");
        Customer customer2 = new Customer(2, "Troy", "Bayliss", "21 Aussi Way", "1234-5678");
        Customer customer3 = new Customer(3, "Nicky", "Hayden", "69 Kentucky Kid", "1234-5678");

        List<Customer> customerList = List.of(customer1, customer2, customer3);
        CustomerRepo customerRepo = new CustomerRepo();
        customerRepo.addCustomer(customer1);
        customerRepo.addCustomer(customer2);
        customerRepo.addCustomer(customer3);

        Order order1 = new Order(1, List.of(product1, product2, product3), List.of(customer3));
        Order order2 = new Order(2, List.of(product1), List.of(customer1));
        Order order3 = new Order(3, List.of(product1, product3), List.of(customer2));

        List<Order> orderList = List.of(order1, order2, order3);
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.addOrder(order1);
        orderRepo.addOrder(order2);
        orderRepo.addOrder(order3);

        //When
        List<Order> actual = orderRepo.listOfOrders();

        //Then
        Product expected = new Product(1, "Book");
        assertEquals(orderList, actual);
    }

    @Test
    void getOrder() {
        //Given
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe");

        List<Product> productList = List.of(product1, product2, product3);
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);

        Customer customer1 = new Customer(1, "Valentino", "Rossi", "46 The Doctor", "1234-5678");
        Customer customer2 = new Customer(2, "Troy", "Bayliss", "21 Aussi Way", "1234-5678");
        Customer customer3 = new Customer(3, "Nicky", "Hayden", "69 Kentucky Kid", "1234-5678");

        List<Customer> customerList = List.of(customer1, customer2, customer3);
        CustomerRepo customerRepo = new CustomerRepo();
        customerRepo.addCustomer(customer1);
        customerRepo.addCustomer(customer2);
        customerRepo.addCustomer(customer3);

        Order order1 = new Order(1, List.of(product1, product2, product3), List.of(customer3));
        Order order2 = new Order(2, List.of(product1), List.of(customer1));
        Order order3 = new Order(3, List.of(product1, product3), List.of(customer2));

        List<Order> orderList = List.of(order1, order2, order3);
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.addOrder(order1);
        orderRepo.addOrder(order2);
        orderRepo.addOrder(order3);

        //When
        Order actual = orderRepo.getOrder(1);

        //Then
        Product expected = new Product(1, "Book");
        assertEquals(order1, actual);
    }

    @Test
    void addOrder() {
    }
}
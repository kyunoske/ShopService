import OrderRepo.OrderRepo;
import ProductRepo.ProductRepo;
import Service.Service;
import model.Customer;
import model.Order;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe Rack");

        Service productsSmallStore = new Service();
        productsSmallStore.add(product1);
        productsSmallStore.add(product2);
        productsSmallStore.add(product3);

        Customer customer1 = new Customer(1, "Valentino", "Rossi", "46 The Doctor", "1234-5678");
        Customer customer2 = new Customer(2, "Troy", "Bayliss", "21 Aussi Way", "1234-5678");
        Customer customer3 = new Customer(3, "Nicky", "Hayden", "69 Kentucky Kid", "1234-5678");

        Service customersSmallStore = new Service();
        customersSmallStore.addCustomer(customer1);
        customersSmallStore.addCustomer(customer2);
        customersSmallStore.addCustomer(customer3);

        Order order1 = new Order(1, List.of(product1, product2, product3), List.of(customer3));
        Order order2 = new Order(2, List.of(product1), List.of(customer1));
        Order order3 = new Order(3, List.of(product1, product3), List.of(customer2));

        Service smallStore = new Service();
        smallStore.addOrder(order1);
        smallStore.addOrder(order2);
        smallStore.addOrder(order3);

        // get all products
        System.out.println(productsSmallStore.getAllProducts());

        Scanner myProduct = new Scanner(System.in);
        System.out.println("Please choose a product: ");
        // get a single product
        System.out.println(productsSmallStore.getProductId(myProduct.nextInt()));

        // get a single customer
        System.out.println(customersSmallStore.getCustomerId(3));

        // get all customers
        System.out.println(customersSmallStore.getAllCustomers());

        // get a single order
        System.out.println(smallStore.getOrderId(2));

        // get all orders
        System.out.println(smallStore.getAllOrders());
    }
}

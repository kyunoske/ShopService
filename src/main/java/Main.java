import OrderRepo.OrderRepo;
import ProductRepo.ProductRepo;
import Service.Service;
import model.Order;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Book");
        Product product2 = new Product(2, "Hat");
        Product product3 = new Product(3, "Shoe Rack");

        Service productsSmallStore = new Service();
        productsSmallStore.add(product1);
        productsSmallStore.add(product2);
        productsSmallStore.add(product3);

        Order order1 = new Order(1, List.of(product1, product2, product3));
        Order order2 = new Order(2, List.of(product1));
        Order order3 = new Order(3, List.of(product1, product3));

        Service smallStore = new Service();
        smallStore.addOrder(order1);
        smallStore.addOrder(order2);
        smallStore.addOrder(order3);

        // get a single product
        System.out.println(productsSmallStore.getProductId(2));

        // get all products
        System.out.println(productsSmallStore.getAllProducts());

        // get a single order
        System.out.println(smallStore.getOrderId(2));

        // get all orders
        System.out.println(smallStore.getAllOrders());
    }
}

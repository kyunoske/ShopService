package Service;

import OrderRepo.OrderRepo;
import ProductRepo.ProductRepo;
import model.Order;
import model.Product;

import java.util.List;

public class Service {
    // productRepo
    private ProductRepo productRepo = new ProductRepo();
    // orderRepo
    private OrderRepo orderRepo = new OrderRepo();

    // getProduct()
    public Product getProductId(Integer productId) {
        return productRepo.getProductById(productId);
    }

    // listProducts()
    public List<Product> getAllProducts() {
        return productRepo.listOfProducts();
    }

    // add product()
    public Product add(Product product) {
        return productRepo.addProduct(product);
    }

    // addOrder()
    public Order addOrder(Order order) {
        return orderRepo.addOrder(order);
    }

    // getOrder()
    public Order getOrderId(Integer orderId) {
        return orderRepo.getOrder(orderId);
    }

    // listOrders()
    public List<Order> getAllOrders() {
        return orderRepo.listOfOrders();
    }
}

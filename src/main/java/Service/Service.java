package Service;

import CustomerRepo.CustomerRepo;
import OrderRepo.OrderRepo;
import ProductRepo.ProductRepo;
import model.Customer;
import model.Order;
import model.Product;

import java.util.List;

public class Service {
    // productRepo
    private ProductRepo productRepo = new ProductRepo();
    // orderRepo
    private OrderRepo orderRepo = new OrderRepo();

    private CustomerRepo customerRepo = new CustomerRepo();

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

    // add customer()
    public Customer addCustomer(Customer customer) {
        return customerRepo.addCustomer(customer);
    }

    // get customer()
    public Customer getCustomerId(Integer customerId) {
        return customerRepo.getCustomerById(customerId);
    }

    // listCustomers()
    public List<Customer> getAllCustomers() {
        return customerRepo.listOfCustomers();
    }
}

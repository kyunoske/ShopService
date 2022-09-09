package OrderRepo;

import model.Order;
import model.Product;

import java.util.*;

public class OrderRepo {

    // Orders
    private Map<Integer, Order> orders = new HashMap<>();

    public OrderRepo() {

    }

    // list()
    public List<Order> listOfOrders() {
        ArrayList<Order> orderList = new ArrayList<>(orders.values());
        return orderList;
    }
    // getById()
    public Order getOrder(Integer orderId) {
        return orders.get(orderId);
    }

    // addOrder()
    public Order addOrder(Order order) {
        return orders.put(order.getOrderId(), order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(orders, orderRepo.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }
}

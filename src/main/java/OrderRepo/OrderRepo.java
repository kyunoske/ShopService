package OrderRepo;

import model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderRepo {

    // Orders
    private Map<Integer, Order> orders = new HashMap<>();

    public OrderRepo() {

    }

    // list()
    public Map<Integer, Order> getAllOrders() {
        return this.orders;
    }
    // get()
    public Order getOrder(Integer orderId) {
        return orders.get(orderId);
    }
    // add()
    public Order addOrder(Integer number, Order order) {
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

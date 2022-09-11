package model;

import java.util.*;

public class Order {

    // id
    private int orderId;

    // products
    private List<Product> products;

    private List<Customer> customers;

    public Order(Integer orderId, List<Product> products, List<Customer> customers) {
        this.orderId = orderId;
        this.products = products;
        this.customers = customers;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", products=" + products +
                ", customers=" + customers +
                '}';
    }
}

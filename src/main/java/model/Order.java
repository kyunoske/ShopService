package model;

import java.util.*;

public class Order {

    // id
    private int orderId;

    // products
    private List<Product> products;
//    private Product[] products;

    public Order(Integer orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
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
                '}';
    }
}

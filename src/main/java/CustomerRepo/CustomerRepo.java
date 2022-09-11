package CustomerRepo;

import model.Customer;

import java.util.*;

public class CustomerRepo {

    private Map<Integer, Customer> customers = new HashMap<>();

    public List<Customer> listOfCustomers() {
        ArrayList<Customer> customerList = new ArrayList<>(customers.values());
        return customerList;
    }

    public Customer getCustomerById(Integer customerId) {
        return customers.get(customerId);
    }

    public Customer addCustomer(Customer customer) {
        Customer addingCustomers = customers.put(customer.getCustomerId(), customer);
        return addingCustomers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerRepo that = (CustomerRepo) o;
        return Objects.equals(customers, that.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    @Override
    public String toString() {
        return "CustomerRepo{" +
                "customers=" + customers +
                '}';
    }
}

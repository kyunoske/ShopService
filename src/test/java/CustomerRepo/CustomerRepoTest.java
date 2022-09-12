package CustomerRepo;

import ProductRepo.ProductRepo;
import model.Customer;
import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepoTest {

    @Test
    void listOfCustomers() {
        //Given
        Customer customer1 = new Customer(1, "Valentino", "Rossi", "46 The Doctor", "1234-5678");
        Customer customer2 = new Customer(2, "Troy", "Bayliss", "21 Aussi Way", "1234-5678");
        Customer customer3 = new Customer(3, "Nicky", "Hayden", "69 Kentucky Kid", "1234-5678");

        List<Customer> customerList = List.of(customer1, customer2, customer3);
        CustomerRepo customerRepo = new CustomerRepo();
        customerRepo.addCustomer(customer1);
        customerRepo.addCustomer(customer2);
        customerRepo.addCustomer(customer3);

        //When
        List<Customer> actual = customerRepo.listOfCustomers();

        //Then
        assertEquals(customerList, actual);
    }

    @Test
    void getCustomerById() {
        //Given
        Customer customer1 = new Customer(1, "Valentino", "Rossi", "46 The Doctor", "1234-5678");
        Customer customer2 = new Customer(2, "Troy", "Bayliss", "21 Aussi Way", "1234-5678");
        Customer customer3 = new Customer(3, "Nicky", "Hayden", "69 Kentucky Kid", "1234-5678");

        List<Customer> customerList = List.of(customer1, customer2, customer3);
        CustomerRepo customerRepo = new CustomerRepo();
        customerRepo.addCustomer(customer1);
        customerRepo.addCustomer(customer2);
        customerRepo.addCustomer(customer3);

        //When
        Customer actual = customerRepo.getCustomerById(1);

        //Then
        Customer expected = new Customer(1, "Valentino", "Rossi", "46 The Doctor", "1234-5678");
        assertEquals(expected, actual);
    }

    @Test
    void addCustomer() {
    }
}
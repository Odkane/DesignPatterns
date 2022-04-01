package behavioral.nullobject;

import java.util.ArrayList;

public class Customers extends ArrayList<Customer> {

    public void addCustomer(Customer customer) {
     this.add(customer);
    }

    public Customer getCustomer(String name) {
        return this.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(new NullCustomer(""));
    }
}

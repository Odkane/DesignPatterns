package behavioral.nullobject;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Customer {
    protected String customerId = UUID.randomUUID().toString();

    protected String name;

    protected List<Order> ordersList = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public abstract boolean exists();
    public abstract String getName();
    public abstract String getOrders();
    public abstract void buy(String article);
}

package behavioral.nullobject;

import java.util.Collections;
import java.util.List;

public class NullCustomer extends Customer {

    public NullCustomer(String name) {
        super(name);
    }

    @Override
    public boolean exists() {
        return false;
    }

    @Override
    public String getName() {
        return "non Existent Customer";
    }

    @Override
    public String getOrders() {
        return "No Order for this customer";
    }

    @Override
    public void buy(String article) {
        System.out.println("The article " + article + " cannot be bought by this customer because he is a " + getName().toLowerCase());
    }
}

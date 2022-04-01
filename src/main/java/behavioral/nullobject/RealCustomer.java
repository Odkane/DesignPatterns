package behavioral.nullobject;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class RealCustomer extends Customer {

    public RealCustomer(String name) {
        super(name);
    }

    @Override
    public boolean exists() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOrders() {
        System.out.println("List of orders for the customer " + getName());
        return ordersList.stream().map (order -> String.format("- Article : %s bought at %s",order.getArticle(),order.getOrderTime())).collect(Collectors.joining(" \n"));
    }

    @Override
    public void buy(String article) {
        var order = new Order(LocalDateTime.now(), article);
        ordersList.add(order);
        System.out.printf("Article %s bought successfully by customer: %s \n",article, this.getName());
    }
}

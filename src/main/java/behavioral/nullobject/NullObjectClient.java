package behavioral.nullobject;

import lombok.SneakyThrows;

public class NullObjectClient {


    public static void main(String[] args) throws InterruptedException {

        Customers customers = new Customers();

        RealCustomer customer1 = new RealCustomer("Joe");
        RealCustomer customer2 = new RealCustomer("Jean");

        customers.addCustomer(customer1);
        customers.addCustomer(customer2);

        Customer yves = customers.getCustomer("Yves");
        Customer jean = customers.getCustomer("jean");
        Customer joe = customers.getCustomer("Joe");

        yves.buy("Macbook");
        jean.buy("Ipad");
        joe.buy("Charge 5");

        Thread.sleep(4000);
        jean.buy("TV");

        yves.getOrders();
        System.out.println("----------------------------------");
        System.out.println(jean.getOrders());
    }
}

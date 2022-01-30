package creational.abstractfactory.example2;

import creational.abstractfactory.example2.factories.AwsResourceFactory;
import creational.abstractfactory.example2.factories.GoogleResourceFactory;
import creational.abstractfactory.example2.factories.ResourceFactory;
import creational.abstractfactory.example2.products.Instance;
import creational.abstractfactory.example2.products.Storage;

import static creational.abstractfactory.example2.Capacity.MICRO;
import static creational.abstractfactory.example2.Capacity.SMALL;

public class Client {

    private final ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        final Client aws = new Client(new AwsResourceFactory());
        Instance awsInstance = aws.createServer(MICRO, 20480);
        awsInstance.start();
        awsInstance.stop();

        System.out.println("***************************************");
        final Client gcp = new Client(new GoogleResourceFactory());
        Instance gcpInstance = gcp.createServer(SMALL, 20480);
        gcpInstance.start();
        gcpInstance.stop();
    }

}
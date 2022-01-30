package creational.abstractfactory.example2.factories;

import creational.abstractfactory.example2.*;
import creational.abstractfactory.example2.products.AWS.Ec2Instance;
import creational.abstractfactory.example2.products.AWS.S3Storage;
import creational.abstractfactory.example2.products.Instance;
import creational.abstractfactory.example2.products.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacity) {
        return new S3Storage(capacity);
    }
}

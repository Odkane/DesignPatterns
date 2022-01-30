package creational.abstractfactory.example2.factories;

import creational.abstractfactory.example2.Capacity;
import creational.abstractfactory.example2.products.Instance;
import creational.abstractfactory.example2.products.Storage;

public interface ResourceFactory {

    Instance createInstance(Capacity capacity);
    Storage createStorage(int capacity);
}

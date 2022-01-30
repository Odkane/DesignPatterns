package creational.abstractfactory.example2.factories;

import creational.abstractfactory.example2.*;
import creational.abstractfactory.example2.products.GCP.GoogleCloudStorage;
import creational.abstractfactory.example2.products.GCP.GoogleComputeEngineInstance;
import creational.abstractfactory.example2.products.Instance;
import creational.abstractfactory.example2.products.Storage;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacity) {
        return new GoogleCloudStorage(capacity);
    }

}

package creational.abstractfactory.example2.products.GCP;

import creational.abstractfactory.example2.products.Storage;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacity) {
        //Use gcp api
        System.out.println("Allocated "+capacity+" on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }
}

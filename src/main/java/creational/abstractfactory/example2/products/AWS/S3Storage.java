package creational.abstractfactory.example2.products.AWS;

import creational.abstractfactory.example2.products.Storage;

public class S3Storage implements Storage {

    public S3Storage(int capacity) {
        //Use aws s3 api
        System.out.println("Allocated "+capacity+" on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}

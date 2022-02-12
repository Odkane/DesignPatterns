package structural.adapter.objectadapter;

public class Client {

    public static void main(String[] args) {
        ResourceRepository repository = new XMLAdapter();

        String test = repository.getXMLString("test");
        System.out.println(test);
    }
}

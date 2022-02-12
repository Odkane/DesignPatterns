package structural.adapter.objectadapter;

public class JsonParser {

    public String convertJson(String filename) {
        System.out.printf("Converted %s with JsonParser%n", filename);
        return filename;
    }
}
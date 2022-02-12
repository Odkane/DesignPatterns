package structural.adapter.objectadapter;

import static java.lang.String.*;

public class JsonParser {

    public String convertJson(String filename){
        System.out.printf("Converted %s with JsonParser%n", filename);
        return filename;
    }
}

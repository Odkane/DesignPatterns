package structural.adapter.objectadapter;

public class XMLAdapter implements ResourceRepository{

    private JsonParser jsonParser;

    @Override
    public String getXMLString(String filename) {
        jsonParser = new JsonParser();
        String message = jsonParser.convertJson(filename);
        return convertJSONStringToXMLString(message);
    }

    private String convertJSONStringToXMLString(String message) {
        String XMLString = String.format("Converting this Json String: %s to XML String", message);
        System.out.println(XMLString);
        return XMLString;
    }
}
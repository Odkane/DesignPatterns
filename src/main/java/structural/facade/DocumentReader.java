package structural.facade;

public class DocumentReader {

    public Document getDocument(String filename){
        System.out.println("Getting the Doucment "+ filename);
        return new Document(filename);
    }

    public void open(Document doc){
        System.out.println("Opening the document "+ doc.getFileName());
    }

    public void close(Document doc){
        System.out.println("Closing the document "+ doc.getFileName());
    }
}

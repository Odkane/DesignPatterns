package structural.facade;

public class Postbox {

    public void send(Document doc){
        System.out.printf("Putting the document %s in the postbox \n", doc.getFileName());
    }
}

package structural.facade;

public class Stamp {

    public void stamp(Document doc){
        System.out.println("Stamping the document " + doc.getFileName());
    }
}

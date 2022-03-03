package structural.facade;

public class Pencil {

    public void sign(Document doc){
        System.out.println("Signing the document " + doc.getFileName());
    }
}

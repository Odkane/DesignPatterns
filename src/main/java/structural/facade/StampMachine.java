package structural.facade;

public class StampMachine {

    public void buyStamp(Document doc, int stamp ) {
        System.out.printf("Buying %d stamp(s) for the document %s.\n", stamp,doc.fileName);
    }
}
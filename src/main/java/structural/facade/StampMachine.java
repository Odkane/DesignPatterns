package structural.facade;

public class StampMachine {

    public void buyStamp(Document doc, int price ) {
        System.out.printf("Buying stamp for the document %s for the price %d.\n", doc.fileName, price);
    }
}

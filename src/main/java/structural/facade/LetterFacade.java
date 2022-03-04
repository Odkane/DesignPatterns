package structural.facade;

public class LetterFacade {

    public void writeAndSend(String fileName){

        Computer computer = new Computer();
        computer.on();

        DocumentReader reader = computer.getDocumentReader();
        Document document = reader.getDocument(fileName);

        Printer printer = new Printer();
        printer.start();
        printer.configure();
        printer.fillPaper();
        computer.print(document);

        Pencil pencil = new Pencil();
        pencil.sign(document);

        StampMachine stampMachine = new StampMachine();
        stampMachine.buyStamp(document, 2);

        Stamp stamp = new Stamp();
        stamp.stamp(document);

        Postbox postbox = new Postbox();
        postbox.send(document);
    }
}

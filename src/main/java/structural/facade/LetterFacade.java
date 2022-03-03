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

        Stamp stamp = new Stamp();
        stamp.stamp(document);

        StampMachine stampMachine = new StampMachine();
        stampMachine.buyStamp(document, 2);

        Postbox postbox = new Postbox();
        postbox.send(document);
    }
}

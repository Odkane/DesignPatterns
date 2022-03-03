package structural.facade;

public class Computer {

    public void on(){
        System.out.println("Starting the computer");
    }

    public void off(){
        System.out.println("Stopping the computer");
    }

    public void print(Document doc){
        System.out.println("Printing the document " + doc.getFileName());
    }

    public DocumentReader getDocumentReader(){
        return new DocumentReader();
    }

}

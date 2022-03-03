package structural.facade;

public class FacadeClient {

    public static void main(String[] args) {
        LetterFacade facade = new LetterFacade();
        facade.writeAndSend("Coq-au-vin.pdf");
    }
}

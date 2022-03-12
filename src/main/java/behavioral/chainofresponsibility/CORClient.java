package behavioral.chainofresponsibility;

public class CORClient {

    public static void main(String[] args) {
        Account haspa = new Haspa(2000);
        Account ing = new ING(1000);
        Account dkb = new DKB(500);

        ing.setSuccessor(haspa);
        dkb.setSuccessor(ing);

        dkb.pay(2500);
        System.out.println("----------------------------");

        dkb.pay(800);
        System.out.println("----------------------------");
    }
}

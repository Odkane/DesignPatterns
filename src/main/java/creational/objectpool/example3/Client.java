package creational.objectpool.example3;

public class Client {

    public static void main(String[] args) {
        var pool = new OliphauntPool();
        var oliphaunt1 = pool.checkOut();
        var oliphaunt2 = pool.checkOut();
        var oliphaunt3 = pool.checkOut();
        pool.checkIn(oliphaunt1);
        pool.checkIn(oliphaunt2);
        var oliphaunt4 = pool.checkOut();
        var oliphaunt5 = pool.checkOut();
    }
}

package creational.singleton.lazy;


public class LazyImplementation {

    private static volatile LazyImplementation INSTANCE;

    private LazyImplementation(){

    }

    public static LazyImplementation getInstance(){
        if (INSTANCE == null){
            synchronized (LazyImplementation.class){
                if (INSTANCE == null){
                    INSTANCE = new LazyImplementation();
                }
            }
        }
        return INSTANCE;
    }

}

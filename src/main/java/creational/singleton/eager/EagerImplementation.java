package creational.singleton.eager;

@SuppressWarnings("unused")
public class EagerImplementation {

    private static final EagerImplementation INSTANCE = new EagerImplementation();

    private EagerImplementation(){

    }

    public static EagerImplementation getInstance(){
        return INSTANCE;
    }

}

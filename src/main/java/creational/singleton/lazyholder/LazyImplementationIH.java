package creational.singleton.lazyholder;


public class LazyImplementationIH {

    private LazyImplementationIH(){

    }

    static class ImplementationHolder {
        static LazyImplementationIH INSTANCE = new LazyImplementationIH();
    }

    public static LazyImplementationIH getInstance(){
        return ImplementationHolder.INSTANCE;
    }

}

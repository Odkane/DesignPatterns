package creational.prototype;

public class BenzinAuto extends Vehicle{

    public BenzinAuto() {
        super();
    }

    @Override
    public Vehicle getClone(){
        BenzinAuto auto = null;

        try {
            auto = (BenzinAuto) super.clone();
        } catch ( CloneNotSupportedException e){
            e.printStackTrace();
        }

        return auto;
    }
}

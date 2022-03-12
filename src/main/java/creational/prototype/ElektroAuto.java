package creational.prototype;

public class ElektroAuto extends Vehicle{

    public ElektroAuto() {
        super();
    }

    @Override
    public Vehicle getClone(){
        /*Clone with deep copy*/
        ElektroAuto auto = null;

        try {
            auto = (ElektroAuto) super.clone();

        } catch ( CloneNotSupportedException e){
            e.printStackTrace();
        }

        return auto;
    }
}

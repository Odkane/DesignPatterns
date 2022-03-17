package behavioral.command;

//Receiver
public class LightBulb {
    private static final LightBulb INSTANCE  = new LightBulb();
    private static boolean isBulbOn = false;
    private int lightIntensity;

    private LightBulb(){

    }

    public static LightBulb getInstance(){
        return INSTANCE;
    }

    public void lightOn(){
        if (!isBulbOn) {
            isBulbOn = true;
            lightIntensity = 5;
            System.out.println("Bulb is turned on. Intensity of Light at : "+ lightIntensity +"0%");
        }
        System.out.println("Bulb is on. Intensity of Light at : "+ lightIntensity +"0%");
    }

    public void lightOff(){
        isBulbOn = false;
        lightIntensity = 0;
        System.out.println("Bulb is turned off");
    }

    public void lightDimeUp(){
        if (isBulbOn) {
            if (lightIntensity<10) {
                lightIntensity++;
            }
            System.out.println("Bulb is dimed up. Intensity of Light at : "+ lightIntensity +"0%");
        }else {
            System.out.println("Bulb is off");
        }

    }

    public void lightDimeDown(){
        if (isBulbOn) {
            if (lightIntensity>0) {
                lightIntensity--;
            }
            System.out.println("Bulb is dimed down. Intensity of Light at : "+ lightIntensity +"0%");
        } else {
            System.out.println("Bulb is off");
        }
    }
}

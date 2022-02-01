package creational.prototype;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public abstract class Vehicle implements Cloneable {
    protected List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<>();
    }

    public void insertVehicle(String model){
        vehicleList.add(model);
    }

    public void reset(){
        vehicleList.clear();
    }

    public abstract Object getClone();

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

}

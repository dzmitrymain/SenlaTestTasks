package by.yevtukhovich.senlaTestTasks.sixthTask.entity;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private double weightCapacity;
    private List<Thing> things;

    private double totalWeight;
    private double totalWorth;

    {
        things=new ArrayList<>();
    }

    public Backpack(){

    }

    public Backpack(double weightCapacity){
        this.weightCapacity=weightCapacity;
    }

    public Backpack(double weightCapacity, List<Thing> things){
        this.weightCapacity=weightCapacity;

    }

    public void addThing(Thing thing){
        if(totalWeight +thing.getWeight()<=weightCapacity){
            things.add(thing);
            totalWeight+=thing.getWeight();
            totalWorth+=thing.getWorth();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Backpack backpack = (Backpack) o;
        if (Double.compare(backpack.weightCapacity, weightCapacity) != 0){
            return false;
        }
        if (Double.compare(backpack.totalWeight, totalWeight) != 0){
            return false;
        }
        if (Double.compare(backpack.totalWorth, totalWorth) != 0){
            return false;
        }
        return things.equals(backpack.things);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weightCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + things.hashCode();
        temp = Double.doubleToLongBits(totalWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalWorth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "weightCapacity=" + weightCapacity +
                ", things=" + things +
                ", totalWeight=" + totalWeight +
                ", totalWorth=" + totalWorth +
                '}';
    }
}

package by.yevtukhovich.senlaTestTasks.sixthTask.entity;

public class Thing {

    private double worth;
    private double weight;

    public Thing(){

    }

    public Thing(double worth, double weight) {
        this.worth = worth;
        this.weight = weight;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Thing thing = (Thing) o;
        if (Double.compare(thing.worth, worth) != 0) {
            return false;
        }
        return Double.compare(thing.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(worth);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "worth=" + worth +
                ", weight=" + weight +
                '}';
    }
}

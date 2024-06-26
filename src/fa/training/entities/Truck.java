package fa.training.entities;

public class Truck extends Car{
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(this.weight > 2000){
            return super.regularPrice - super.regularPrice * 0.1;
        }
        return super.regularPrice - super.regularPrice * 0.2;
    }
    @Override
    public String toString() {
        return "Truck with color " + this.color;
    }
}

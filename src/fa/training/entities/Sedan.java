package fa.training.entities;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if(this.length > 20){
            return super.regularPrice - super.regularPrice * 0.05;
        }
        return super.regularPrice - super.regularPrice * 0.1;
    }
    @Override
    public String toString() {
        return "Sedan with color " + this.color;
    }
}

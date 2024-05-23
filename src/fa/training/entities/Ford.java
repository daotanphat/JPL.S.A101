package fa.training.entities;

public class Ford extends  Car{
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int manufacturerDiscount, int year) {
        super(speed, regularPrice, color);
        this.manufacturerDiscount = manufacturerDiscount;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.regularPrice - this.manufacturerDiscount;
    }

    @Override
    public String toString() {
        return "Ford with color " + this.color;
    }
}

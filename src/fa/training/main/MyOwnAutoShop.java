package fa.training.main;
import fa.training.entities.Car;
import fa.training.entities.Ford;
import fa.training.entities.Sedan;
import fa.training.entities.Truck;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck truck1 = new Truck(100, 40000, "Yellow", 2500);
        Truck truck2 = new Truck(110, 30000, "Green", 3000);

        Ford ford1 = new Ford(140, 30000, "Black", 2000, 2020);
        Ford ford2 = new Ford(160, 35000, "White", 1200, 2024);

        Sedan sedan1 = new Sedan(120, 20000, "Red", 25);
        Sedan sedan2 = new Sedan(100, 15000, "Blue", 15);

        Car[] cars = {truck1, truck2, ford1, ford2, sedan1, sedan2};
        for(Car c : cars){
            System.out.println(c.toString() + ": " +   c.getSalePrice() + "$");
        }
    }
}

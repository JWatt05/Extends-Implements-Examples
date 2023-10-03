import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(2, "red", 200);
        //car.prettyPrint();
        System.out.println(car);

        Bicycle bicycle = new Bicycle("green", 3);
        //bicycle.prettyPrint();
        System.out.println(bicycle);

        Car car2 = new Car(1, "blue", 5);
        car2.move(10);

        Bicycle bicycle2 = new Bicycle("purple", 5);
        bicycle2.move(10);

        Vehicle v = new Car(2, "red", 200);

        List<Moveable> vList = new ArrayList<>();

        vList.add(car);
        vList.add(car2);
        vList.add(bicycle);
        vList.add(bicycle2);

        for (Moveable veh : vList) {
            veh.move(200);
        }

        Moveable m = new Car(2, "red", 200);

        car.vehicleIsFast();
        bicycle.vehicleIsFast();
    }
}
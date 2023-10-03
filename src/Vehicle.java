public abstract class Vehicle {

    int wheels;
    String colour;
    int speed;

    @Override
    public String toString() {
        return "Vehicle details are: " + wheels + " & " + colour + " & " + speed;
    }

    public void vehicleIsFast() {
        System.out.println("The vehicle goes " + speed + " mph.");
    }
}

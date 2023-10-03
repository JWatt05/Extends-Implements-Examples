public class Car extends Vehicle implements Moveable{

    int engineSize;

    public Car(int engineSize, String colour, int speed) {

        this.wheels = 4;
        this.engineSize = engineSize;
        this.colour = colour;
        this.speed = speed;

    }

    @Override
    public String toString() {
        System.out.println("Car details are " + wheels + " & " + engineSize + " & " + colour + " also " + speed);
        return null;
    }

    @Override
    public int move(int distance){
        int time;
        time = distance/speed;
        System.out.println(time);
        return time;

    }

    @Override
    public void vehicleIsFast() {
        super.vehicleIsFast();
        System.out.println("This is a fast car!!");
    }
}

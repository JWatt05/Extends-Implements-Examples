public class Bicycle extends Vehicle implements Moveable{

    public Bicycle(String colour, int speed) {

        this.wheels = 2;
        this.colour = colour;
        this.speed = speed;
    }

    @Override
    public int move(int distance){
        double time;
        time = distance * 0.5 /speed;
        System.out.println(time);
        return (int) time;
    }

    @Override
    public void vehicleIsFast() {
        super.vehicleIsFast();
        System.out.println("This is a fast bicycle!!");
    }
}

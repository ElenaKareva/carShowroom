public class Manufacturer extends Thread {
    private final CarShowroom carShowroom;

    public Manufacturer(String name, CarShowroom carShowroom) {
        super(name);
        this.carShowroom = carShowroom;
    }


    @Override
    public void run() {
        carShowroom.produceCar();
    }
}

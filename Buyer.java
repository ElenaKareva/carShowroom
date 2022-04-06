public class Buyer extends Thread {

    private final CarShowroom carShowroom;


    public Buyer(String name, CarShowroom carShowroom) {
        super(name);
        this.carShowroom = carShowroom;
    }

    @Override
    public void run() {
        carShowroom.buyCar();
    }
}

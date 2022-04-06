public class Main {

    public static void main(String[] args) {
        final CarShowroom carShowroom = new CarShowroom();
        for (int i = 1; i < Car.getNumberCars() + 1; i++) {
            new Buyer("Покупатель " + i, carShowroom).start();
            new Manufacturer("Производитель TOYTA", carShowroom).start();
        }
    }
}


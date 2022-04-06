import java.util.ArrayList;
import java.util.List;

public class CarShowroom {
    private final static int BUY_TIME = 1000;
    private final static int PRODUCE_TIME = 2000;
    private final List<Car> cars = new ArrayList<>();

    public synchronized void buyCar() {//продаем авто
        try {
            System.out.println(Thread.currentThread().getName() + " зашел в автосалон");
            while (cars.size() == 0) {
                System.out.println("Машин нет!");
                wait();
            }
            Thread.sleep(BUY_TIME);
            System.out.println(Thread.currentThread().getName() + " уехал на новеньком авто");
            cars.remove(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void produceCar() {//получаем авто
        try {
            cars.add(new Car());
            System.out.println(Thread.currentThread().getName() + " выпустил авто");
            Thread.sleep(PRODUCE_TIME);
            synchronized (this) {
                notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

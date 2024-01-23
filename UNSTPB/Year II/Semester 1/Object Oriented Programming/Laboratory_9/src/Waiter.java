import java.util.*;

public class Waiter extends Thread{
    public static int increment = 0;
    public Kitchen kitchen;
    public String name;

    public Waiter(Kitchen aKitchen, String aName){
        this.kitchen = aKitchen;
        this.name = aName;
    }

    public synchronized void run(){
        Pizza currentPizza = kitchen.get();
        System.out.println("Pizza " + this.kitchen.get().getID() + " was removed.");
        sleep(10);
        run();
    }

    public synchronized void submitOrder(){
        Random r = new Random();
        r.nextInt(10);
        this.kitchen.add(null);
    }
}

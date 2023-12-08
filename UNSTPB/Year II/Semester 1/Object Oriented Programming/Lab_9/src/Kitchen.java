import java.util.*;

public class Kitchen{
    ArrayList<Pizza> order;
    public final int MAX_SIZE = 10;

    public Kitchen(){}

    public synchronized void add(Pizza aPizza){
        while(order.size() > MAX_SIZE){
            try{
                wait();
            }catch(InterruptedException e){}
        }

        order.add(aPizza);
        notify();
    }

    public synchronized Pizza get() throws InterruptedException{
        while(order.size() > MAX_SIZE){
            try{
                wait();
            }catch(InterruptedException e){}
        }

        Pizza currentPizza = order.remove(order.size() - 1);
        return currentPizza;
    }
}
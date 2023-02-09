public class Cook extends Thread{
    String name;
    Kitchen kitchen;

    public Cook(String aName, Kitchen aKitchen){
        this.name = aName;
        this.kitchen = aKitchen;
    }

    @Override
    public synchronized void run(){
        Pizza current = null;
        current = this.kitchen.get();
        System.out.println("Pizza " + this.kitchen.get().getID() + " was added.");
        try{
            sleep(5 + (this.kitchen.get().getNumberOfIngredients()*2));
        }catch(InterruptedException e){}
    }
}

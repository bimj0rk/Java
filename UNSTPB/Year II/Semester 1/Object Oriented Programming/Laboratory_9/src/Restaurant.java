public class Restaurant{
    public static void main(String[] args){
        Kitchen kitchen = new Kitchen();

        Waiter waiter1 = new Waiter(kitchen, "Waiter 1");
        Waiter waiter2 = new Waiter(kitchen, "Waiter 2");
        Waiter waiter3 = new Waiter(kitchen, "Waiter 3");
        Waiter waiter4 = new Waiter(kitchen, "Waiter 4");
        Waiter waiter5 = new Waiter(kitchen, "Waiter 5");

        Cook cook1 = new Cook("Cook 1", kitchen);
        Cook cook2 = new Cook("Cook 2", kitchen);
        Cook cook3 = new Cook("Cook 3", kitchen);

        waiter1.start();
        waiter2.start();
        waiter3.start();
        waiter4.start();
        waiter5.start();

        cook1.start();
        cook2.start();
        cook3.start();
    }
}

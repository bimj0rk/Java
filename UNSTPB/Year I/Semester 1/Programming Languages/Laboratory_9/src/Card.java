//3

abstract class Card{
    protected String recipient;

    public abstract void greeting();
}

class Holiday extends Card{

    public Holiday(String r){
       this.recipient = r;
    }

    @Override
    public void greeting() {
        System.out.println("Dear " + this.recipient + ",");
        System.out.println("Season's greetings!");
    }
}

class Birthday extends Card{

    private int age;

    public Birthday(String r, int a){
        this.recipient = r;
        this.age = a;
    }

    @Override
    public void greeting() {
        System.out.println("Dear " + this.recipient + ", ");
        System.out.println("Happy " + this.age + "th Birthday!");
    }
}

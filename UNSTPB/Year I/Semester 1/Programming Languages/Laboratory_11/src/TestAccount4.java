public class TestAccount4 {
    public static void main(String[] args){
        CurrentAccount current1 = new CurrentAccount("Alexandru", 500, 1, 5);
        CurrentAccount current2 = new CurrentAccount("Ioan", 1000, 2, 3);

        SavingsAccount savings1 = new SavingsAccount("Adrian", 14);
        SavingsAccount savings2 = new SavingsAccount(5000, "Maria", 12);

        System.out.println(current1);
        System.out.println(current2);
        System.out.println(savings1);
        System.out.println(savings2);
        System.out.println();

        savings1.applyInterest();
        savings2.applyInterest();

        System.out.println(current1);
        System.out.println(current2);
        System.out.println(savings1);
        System.out.println(savings2);
        System.out.println();

        current1.deposit(30);
        current2.withdraw(10);

        System.out.println(current1);
        System.out.println(current2);
        System.out.println(savings1);
        System.out.println(savings2);
        System.out.println();

        current1.endOfMonth();
        current2.endOfMonth();
        savings1.endofMonth();
        savings2.endofMonth();

        System.out.println(current1);
        System.out.println(current2);
        System.out.println(savings1);
        System.out.println(savings2);
        System.out.println();
    }
}

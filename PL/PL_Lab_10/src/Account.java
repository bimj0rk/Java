//3

class Account {
    private int id;
    protected double balance;
    private String owner;
    private static int idCurrentAccount = 1;

    public Account(long balance, String owner){
        this.balance = balance;
        this.owner = owner;
        this.id = idCurrentAccount;
        idCurrentAccount++;
    }

    public Account(String owner){
        this.balance = 0;
        this.owner = owner;
        this.id = idCurrentAccount;
        idCurrentAccount++;
    }

    public void deposit(double sum){
        this.balance += sum;
    }

    public void withdrawal(double sum){
        this.balance -= sum;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account:" + "id=" + id + ", balance=" + balance + ", owner=" + owner;
    }
}

class SavingsAccount extends Account{

    private double interest;

    public SavingsAccount(long balance, String owner, double interestRate) {
        super(balance, owner);
        this.interest = interestRate;
    }

    public SavingsAccount(String owner, double interestRate){
        super(owner);
        this.interest = interestRate;
    }

    public void applyInterest(){
        deposit(getBalance() * this.interest);
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return super.toString() + ", interest=" + interest;
    }
}
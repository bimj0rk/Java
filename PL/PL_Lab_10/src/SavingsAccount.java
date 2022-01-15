public class SavingsAccount extends Account{

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

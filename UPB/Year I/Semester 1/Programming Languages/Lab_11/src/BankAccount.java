//1
import java.util.Calendar;

public class BankAccount {
    protected double balance;
    private String owner;
    private int id;
    private int idCurrentAccount = 1;

    public BankAccount(String owner, double interestRate){
        this.owner = owner;
        this.balance = 0;
        this.id = idCurrentAccount;
        idCurrentAccount++;
    }

    public BankAccount(double balance, String owner){
        this.owner = owner;
        this.balance = balance;
        this.id = idCurrentAccount;
        idCurrentAccount++;
    }

    public void deposit(double sum){
        this.balance += sum;
    }

    public void withdraw(double sum){
        this.balance -= sum;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BankAccount: " + "balance: " + balance + ", owner: " + owner + ", id: " + id;
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String owner, double interestRate){
        super(owner, interestRate);
    }

    public SavingsAccount(double balance, String owner, double interestRate){
        super(balance, owner);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        super.balance -= this.interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", interest rate: " + this.interestRate;
    }

    public void endofMonth(){
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        int nextDayOfMonth = cal.get(Calendar.MONTH);
        if(currentMonth != nextDayOfMonth){
            applyInterest();
        }
    }
}

class CurrentAccount extends BankAccount{
    private int transactionNo;
    private final int FREE_TRANSACTIONS = 7;
    private final double TRANSACTION_COST;

    public CurrentAccount(String owner, double balance, int transNr, int transCost){
        super(balance, owner);
        this.transactionNo = transNr;
        this.TRANSACTION_COST = transCost;
    }

    @Override
    public String toString() {
        return super.toString() + " transactionNo: " + this.transactionNo + ", free transactions: " + this.FREE_TRANSACTIONS +
                ", total transaction cost: " + TRANSACTION_COST;
    }

    private void dischargeExpenses(){
       if(this.transactionNo > FREE_TRANSACTIONS) super.balance -= transactionNo;
    }

    public void deposit(double sum){
        super.deposit(sum);
    }

    public void withdraw(double sum){
        super.withdraw(sum);
    }

    public void endOfMonth(){
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        int nextDayMonth = cal.get(Calendar.MONTH);
        if (currentMonth != nextDayMonth) {
            dischargeExpenses();
            this.transactionNo = 0;
        }
    }
}

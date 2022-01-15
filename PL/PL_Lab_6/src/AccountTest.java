//3

class AccountTest{

    public static void main (String[] args){
        String accNumber1 = "15BHF67";
        String accNumber2 = "674GHR2";

        String accHolder1 = "John Smith";
        String accHolder2 = "Jane Doe";

        double bal1 = 15000;
        double bal2 = 2400;

        Account account1 = new Account(accNumber1, accHolder1, bal1);
        Account account2 = new Account(accNumber2, accHolder2, bal2);

        System.out.println("The balance for the first account is: " + account1.getBalance());
        System.out.println("The balance for the second account is: " + account2.getBalance());

        account1.processDeposit(2000);
        account2.processCheck(1500);

        System.out.println("New balance for the first account is: " + account1.getBalance());
        System.out.println("New balance for the second account is: " + account2.getBalance());
    }
}

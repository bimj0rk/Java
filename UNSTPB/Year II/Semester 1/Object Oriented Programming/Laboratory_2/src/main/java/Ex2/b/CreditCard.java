package main.java.Ex2.b;
import java.io.*;

import main.java.Storable;

public class CreditCard extends Card{

    private int maxCredit;

    public CreditCard(String IBAN, int ammount, int maxCredit) {
        super(IBAN, ammount);
        this.maxCredit = maxCredit;
    }

    @Override
    public void withdraw(int sum) {
        if(this.getAmmount() + sum <= maxCredit){
            this.setAmmount(this.getAmmount() + sum);
            System.out.println("Operation was done successfully!");
        }
        else
            System.out.println("The maximum threshold of " +
                    this.maxCredit + " was exceeded");
    }

    public void store(String file) throws FileNotFoundException{
        FileOutputStream outputFile = new FileOutputStream("in.txt");
        OutputStreamWriter outputStream = new OutputStreamWriter(outputFile);
        PrintWriter pw = new PrintWriter(outputStream);
        pw.println(this.toString());
    }

    public void read(String file) throws IOException{
        FileInputStream inputFile = new FileInputStream("in.txt");
        InputStreamReader reader = new InputStreamReader(inputFile);
        BufferedReader br = new BufferedReader(reader);
        String sCurrentLine = "";
        while((sCurrentLine = br.readLine()) != null) System.out.println(sCurrentLine);
    }

    @Override
    public int compareTo(Card c) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if(this == c) return EQUAL;
        if(super.getIBAN().compareTo(c.getIBAN()) != EQUAL) return super.getIBAN().compareTo(c.getIBAN());
        if(this.getAmmount() < c.getAmmount()) return BEFORE;
        if(this.getAmmount() > c.getAmmount()) return AFTER;
        return 0;
    }
}

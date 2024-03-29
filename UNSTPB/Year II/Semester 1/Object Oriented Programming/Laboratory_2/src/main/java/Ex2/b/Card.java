package main.java.Ex2.b;

import main.java.Storable;

public abstract class Card implements Comparable<Card>, Storable{

    private String IBAN;
    private int ammount;

    public Card(String IBAN, int ammount) {
        this.IBAN = IBAN;
        this.ammount = ammount;
    }

    public abstract void withdraw (int sum);

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}

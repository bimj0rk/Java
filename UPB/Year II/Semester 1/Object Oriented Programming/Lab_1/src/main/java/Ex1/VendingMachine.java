package Ex1;

import java.util.*;

public abstract class VendingMachine {
    private int id;
    private String companyName;

    public VendingMachine(int id, String cn){
        this.id = id;
        this.companyName = cn;
    }

    public abstract void buyItem(int noOfItemsBought);

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

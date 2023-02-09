package Ex1;

import java.util.*;;

public class FoodVM extends VendingMachine{
    private int noOfItems;

    public FoodVM(int id, String cn, int no){
        super(id, cn);
        this.noOfItems = no;
    }

    public void buyItem(int noOfItemsBought){
        if(this.getNoOfItems() >= noOfItemsBought){
            this.setNoOfItems(this.noOfItems - noOfItemsBought);
            System.out.println("Done");
        } else System.out.println("Fail");
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }
}

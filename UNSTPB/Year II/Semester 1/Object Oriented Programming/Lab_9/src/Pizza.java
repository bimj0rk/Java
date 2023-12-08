public class Pizza{
    private int ID;
    private int numberOfIngredients;

    public Pizza(int aID, int aNumberOfIngredients){
        this.ID = aID;
        this.numberOfIngredients = aNumberOfIngredients;
    }

    public int getID() {
        return ID;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setID(int bID) {
        ID = bID;
    }

    public void setNumberOfIngredients(int bNumberOfIngredients) {
        this.numberOfIngredients = bNumberOfIngredients;
    }
}

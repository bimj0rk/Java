package Ex1;

import java.util.*;

public class Pharmacy{
    private String name;
    private ArrayList<Medicine> medicinesSold = new ArrayList<Medicine>(); 

    public Pharmacy(String dName){
        this.name = dName;
    }

    public void addMedicine(Medicine mAdded){
        this.medicinesSold.add(mAdded);
    }

    public void checkStock(){
        for(Medicine m : this.medicinesSold)
            if(m.getStock() == 0) this.medicinesSold.remove(m);
    }

    public Map<String, Integer> toMap(){
        Map<String, Integer> map = new HashMap<String,Integer>();
        for(Medicine m : this.medicinesSold){
            for(String ingredient : m.getIngredients()){
                if(!map.containsKey(ingredient)) map.put(ingredient, 0);
                else if(map.containsKey(ingredient)){
                    Integer tempValue = map.get(map);
                    tempValue++;
                    map.put(ingredient, tempValue);
                }
            }
        }
        return map;
    }

    public ArrayList<Medicine> getMedicinesSold() {
        return medicinesSold;
    }

    public String getName() {
        return name;
    }

    public void setMedicinesSold(ArrayList<Medicine> medicinesSold) {
        this.medicinesSold = medicinesSold;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pharmacy: " + this.name + ", medicines: " + this.medicinesSold;
    }
}
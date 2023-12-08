package Ex1;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Pharmacy pharmacy = new Pharmacy("Pharmacy");
        Medicine m1 = new Medicine("Medicine 1", "Indications a", "Contra Indications a", 
                    35.9, 4);
        Medicine m2 = new Medicine("Medicine 2", "Indications b", "Contra Indications b", 
                        45.8, 10);
        Medicine m3 = new Medicine("Medicine 3", "Indications c", "Contra Indications c", 
                        51.7, 2);
        Medicine m4 = new Medicine("Medicine 4", "Indications d", "Contra Indications d", 
                        150, 0);

        pharmacy.addMedicine(m1);
        pharmacy.addMedicine(m2);
        pharmacy.addMedicine(m3);
        pharmacy.addMedicine(m4);

        m1.addIngredient("Ingredient a");
        m1.addIngredient("Ingredient b");
        m1.addIngredient("Ingredient c");
        m2.addIngredient("Ingredient d");
        m2.addIngredient("Ingredient d");
        m2.addIngredient("Ingredient e");
        m3.addIngredient("Ingredient f");
        m3.addIngredient("Ingredient g");
        m3.addIngredient("Ingredient g");
        m4.addIngredient("Ingredient h");
        m4.addIngredient("Ingredient h");
        m4.addIngredient("Ingredient h");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        m1.removeDuplicates();
        m2.removeDuplicates();
        m3.removeDuplicates();
        m4.removeDuplicates();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        pharmacy.checkStock();

        System.out.println(pharmacy);

        Map<String, Integer> map = pharmacy.toMap();
        
        System.out.println(map);
    }
}

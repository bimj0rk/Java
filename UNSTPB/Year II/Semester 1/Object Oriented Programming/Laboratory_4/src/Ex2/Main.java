package Ex2;
import java.util.*;

public class Main{
    public static void main(String[] args){
        HashSet<Product> productList = new HashSet<Product>();

        Product p1 = new Product("Product A", "Normal Product", "Ingrient 1, Ingredient 2", new GregorianCalendar(2022, 12, 17));
        Product p2 = new Product("Product A", "Normal Product", "Ingrient 1, Ingredient 2", new GregorianCalendar(2022, 12, 17));
        Product p3 = new Product("Product B", "Normal Product", "Ingrient 3, Ingredient 3", new GregorianCalendar(2023, 1, 20));
        Product p4 = new Product("Product C", "Normal Product", "Ingrient 5, Ingredient 6", new GregorianCalendar(2023, 2, 17));
        Product p5 = new Product("Product D", "Normal Product", "Ingrient 7, Ingredient 8", new GregorianCalendar(2023, 1, 6));

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p5));

        System.out.println(p1.hashCode());
    }
}

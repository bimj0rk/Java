//2

import java.util.Scanner;

public class ProductMain{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name1, name2;
        double price1, price2;

        System.out.println("Enter the names of the products:");
        name1 = scan.nextLine();
        name2 = scan.nextLine();

        System.out.println("Enter the prices in ROLs for the products:");
        price1 = scan.nextDouble();
        price2 = scan.nextDouble();

        Product product1 = new Product(name1, price1);
        Product product2 = new Product(name2, price2);

        product1.displayProduct();
        product2.displayProduct();

        product1.getPriceInRON();
        product2.getPriceInRON();

        product1.raisePriceInRON(10.25);
        product2.raisePriceInRON(10.25);

        System.out.println("The products (with their prices converted in RONs and raised by 10.25 Lei) are:");
        product1.displayProductInRON();
        product2.displayProductInRON();


        System.out.println("The prices in RONs are:");
        System.out.println(product1.priceInRON + "RON");
        System.out.println(product2.priceInRON + "RON");

        scan.close();
    }
}

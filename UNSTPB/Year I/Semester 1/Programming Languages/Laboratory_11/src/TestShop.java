public class TestShop {

    public static void main(String[] args){
        OfficeAssistanceProduct[] products = new OfficeAssistanceProduct[5];
        products[0] = new Printer(10, 40);
        products[1] = new CopyMachine(11, 35);
        products[2] = new Computer(12, 50);
        products[3] = new Printer(13, 70);
        products[4] = new CopyMachine(14, 60);

        System.out.println(products[0].computeSellingPrice());
        System.out.println(products[1].computeSellingPrice());
        System.out.println(products[2].computeSellingPrice());
        System.out.println(products[3].computeSellingPrice());
        System.out.println(products[4].computeSellingPrice());

    }
}

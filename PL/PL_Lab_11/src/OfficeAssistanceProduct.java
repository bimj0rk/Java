//2

abstract class OfficeAssistanceProduct {
    protected int code;
    private static int commisionPercentage;
    protected long costPrice;

    public OfficeAssistanceProduct(int code, long costPrice){
        this.code = code;
        this.costPrice = costPrice;
    }

    public static void setCommision(int percent){
        commisionPercentage = percent;
    }

    abstract long computeSellingPrice();

    @Override
    public String toString() {
        return "OfficeAssistanceProduct: " + "code: " + code + ", costPrice: " + costPrice;
    }
}

class Printer extends OfficeAssistanceProduct{
    private static int VAT = 15;

    public Printer(long code, long costPrice){
        super((int)code, costPrice);
    }

    @Override
    public long computeSellingPrice() {
        this.costPrice += (this.costPrice * 10) / 100;
        this.costPrice += (this.costPrice * VAT) / 100;
        return this.costPrice;
    }
}

class CopyMachine extends OfficeAssistanceProduct{
    private static int VAT = 20;

    public CopyMachine(long code, long costPrice){
        super((int)code, costPrice);
    }

    @Override
    public long computeSellingPrice() {
        this.costPrice += (this.costPrice * 10) / 100;
        this.costPrice += (this.costPrice * VAT) / 100;
        return this.costPrice;
    }
}

class Computer extends OfficeAssistanceProduct{
    private static int VAT = 10;

    public Computer(long code, long costPrice){
        super((int)code, costPrice);
    }

    @Override
    public long computeSellingPrice() {
        this.costPrice += (this.costPrice * 10) / 100;
        this.costPrice += (this.costPrice * VAT) / 100;
        return this.costPrice;
    }
}

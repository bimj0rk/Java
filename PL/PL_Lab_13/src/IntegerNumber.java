interface Number{
    public void add();
    public void substract();
}

class IntegerNumber implements Number, Comparable{
    private int number1, number2;

    public IntegerNumber(int n1, int n2){
        this.number1 = n1;
        this.number2 = n2;
    }

    @Override
    public void add(){
        System.out.println(this.number1 + this.number2);
    }

    @Override
    public void substract() {
        System.out.println(this.number1 - this.number2);
    }

    @Override
    public int compareTo(Object o) {
        return this.number1 - this.number2;
    }

    public String toString() {
        String s = this.number1 + " " + this.number2;
        return s;
    }
}

class RealNumber implements Number, Comparable{
    private double number1, number2;

    public RealNumber(double n1, double n2){
        this.number1 = n1;
        this.number2 = n2;
    }

    @Override
    public void add(){
        System.out.println(this.number1 + this.number2);
    }

    @Override
    public void substract() {
        System.out.println(this.number1 - this.number2);
    }

    @Override
    public int compareTo(Object o) {
        return (int)(this.number1 - this.number2);
    }

    public String toString() {
        String s = this.number1 + " " + this.number2;
        return s;
    }
}

class ComplexNumber implements Number, Comparable{
    private int number1, number2, numberI1, numberI2;

    public ComplexNumber(int n1, int n2, int ni1, int ni2){
        this.number1 = n1;
        this.number2 = n2;
        this.numberI1 = ni1;
        this.numberI2 = ni2;
    }

    @Override
    public void add(){
        System.out.print(this.number1 + this.number2 + "+");
        System.out.println(this.numberI1 + this.numberI2 + "i");
    }

    @Override
    public void substract() {
        System.out.print(this.number1 - this.number2 + "+");
        System.out.println(this.numberI1 - this.numberI2 + "i");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String toString() {
        String s = this.number1 + "+" + this.numberI1 + "i " + this.number2 + "+" + this.numberI2 + "i";
        return s;
    }
}

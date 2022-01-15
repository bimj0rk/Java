//2

public class TestComplex {
    public static void main(String[] args){
        double sumR = 0, sumI = 0, subR = 0, subI = 0, multR = 0, multI = 0, divR = 0, divI = 0;
        Complex complex1 = new Complex(2, 3);
        Complex complex2 = new Complex(4, 5);

        Complex sum = new Complex(sumR, sumI);
        Complex substraction = new Complex(subR, subI);
        Complex product = new Complex(multR, multI);
        Complex division = new Complex(divR, divI);

        sum = sum.add(complex1, complex2);
        substraction = substraction.sub(complex1, complex2);
        product = product.mult(complex1, complex2);
        division = division.div(complex1, complex2);

        System.out.println("The sum is:");
        sum.tupleFormat();

        System.out.println("The substraction is:");
        substraction.tupleFormat();

        System.out.println("The product is:");
        product.tupleFormat();

        System.out.println("The division is:");
        division.tupleFormat();
    }
}

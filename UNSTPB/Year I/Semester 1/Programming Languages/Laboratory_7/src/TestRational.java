//1

public class TestRational {
    public static void main(String[] args){
        int sumN = 0, sumD = 0, divN = 0, divD = 0, subN = 0, subD = 0, multN = 0, multD = 0;
        Rational rational1 = new Rational(2, 3);
        Rational rational2 = new Rational(4, 5);

        Rational sum = new Rational(sumN, sumD);
        Rational substraction = new Rational(subN, subD);
        Rational product = new Rational(multN, multD);
        Rational divison = new Rational(divN, divN);

        sum = sum.add(rational1, rational2);
        substraction = substraction.sub(rational1, rational2);
        product = product.mult(rational1, rational2);
        divison = divison.div(rational1, rational2);

        System.out.println("The sum is:");
        sum.intFormat();
        sum.realFormat();

        System.out.println("The substraction is:");
        substraction.intFormat();
        substraction.realFormat();

        System.out.println("The product is:");
        product.intFormat();
        product.realFormat();

        System.out.println("The division is:");
        divison.intFormat();
        divison.realFormat();
    }
}

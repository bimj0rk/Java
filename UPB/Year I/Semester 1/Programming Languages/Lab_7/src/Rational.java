//1

public class Rational {

    private int numerator;
    private int demnominator;

    public Rational(){
        numerator = 0;
        demnominator = 1;
    }

    public static int GDC(int a, int b){
        if(b == 0) return a;
        return GDC(b,a % b);
    }

    public Rational(int num, int den){
        numerator = num;
        demnominator = den;
    }

    public Rational add(Rational a, Rational b){
        int num = (a.numerator * b.demnominator) + (b.numerator * a.demnominator);
        int den = a.demnominator * b.demnominator;
        int gdc = GDC(num, den);

        num = num / gdc; den = den / gdc;

        Rational sum = new Rational(num, den);

        return sum;
    }

    public Rational sub(Rational a, Rational b){
        int num = (a.numerator * b.demnominator) - (b.numerator * a.demnominator);
        int den = a.demnominator * b.demnominator;
        int gdc = GDC(num, den);

        num = num / gdc; den = den / gdc;

        Rational sub = new Rational(num, den);

        return sub;
    }

    public Rational mult(Rational a, Rational b){
        int num = a.numerator * b.numerator;
        int den = a.demnominator * b.demnominator;
        int gdc = GDC(num, den);

        num = num / gdc; den = den / gdc;

        Rational mult = new Rational(num, den);

        return mult;
    }

    public Rational div(Rational a, Rational b){
        int num = a.numerator * b.demnominator;
        int den = a.demnominator * b.numerator;
        int gdc = GDC(num, den);

        num = num / gdc; den = den / gdc;

        Rational div = new Rational(num, den);

        return div;
    }

    public void intFormat(){
        System.out.println(numerator + "/" + demnominator);
    }

    public void realFormat(){
        float number = (float)numerator / (float)demnominator;
        System.out.println(number);
    }

}

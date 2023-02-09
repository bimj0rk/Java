//2

public class Complex {

    private double re;
    private double im;

    public Complex(){
        re = 0.0;
        im = 0.0;
    }

    public Complex(double r, double i){
        re = r;
        im = i;
    }

    public Complex add(Complex a, Complex b){
        double real = a.re + b.re;
        double imaginary = a.im + b.im;
        Complex sum = new Complex(real, imaginary);
        return sum;
    }

    public Complex sub(Complex a, Complex b){
        double real = a.re - b.re;
        double imaginary = a.im - b.im;
        Complex sub = new Complex(real, imaginary);
        return sub;
    }

    public Complex mult(Complex a, Complex b){
        double real = a.re * b.re - a.im * b.im;
        double imaginary = a.re * b.im + a.im * b.re;
        Complex prod = new Complex(real, imaginary);
        return prod;
    }

    public Complex div(Complex a, Complex b){
        double real = a.re / b.re - a.im / b.im;
        double imaginary = a.re / b.im + a.im / b.re;
        Complex div = new Complex(real, imaginary);
        return div;
    }

    public void tupleFormat(){
        System.out.println(re + " + " + im + "i");
    }
}

import java.util.*;

public class NumberTest {
    public static void main(String[] args){
        ArrayList<IntegerNumber> iA = new ArrayList<>();
        ArrayList<RealNumber> rA = new ArrayList<>();

        IntegerNumber i = new IntegerNumber(4, 8);
        RealNumber r = new RealNumber(10.5, 18.8);
        ComplexNumber c = new ComplexNumber(3, 4, 2, 1);

        iA.add(i);
        rA.add(r);

        i.add();
        i.substract();

        r.add();
        r.substract();

        c.add();
        c.substract();

        Collections.sort(iA);
        Collections.sort(rA);

        System.out.println(i.toString());
        System.out.println(r.toString());
        System.out.println(c.toString());

    }
}

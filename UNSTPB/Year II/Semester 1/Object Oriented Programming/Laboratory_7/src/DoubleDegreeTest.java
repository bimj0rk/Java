//2
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoubleDegreeTest{
    public int[] doubleDegree(int a, int b, int c){
        int[] solutions = new int[2];
        double delta = Math.pow(b, 2) - 4*a*c;

        double solution1 = ((-b + Math.sqrt(delta))/(2*a));
        double solution2 = ((-b - Math.sqrt(delta))/(2*a));

        if((solution1 == Math.floor(solution1)) && !Double.isInfinite(solution1)) solutions[0] = (int) solution1;
        else solution1 = 0;

        if((solution2 == Math.floor(solution2)) && !Double.isInfinite(solution2)) solutions[1] = (int) solution2;
        else solution2 = 0;

        return solutions;
    }

    @Test
    public void test(){
        DoubleDegreeTest dg = new DoubleDegreeTest();
        assertEquals("x^2 - 4", 2, dg.doubleDegree(1, 0, -4)[0]);
        assertEquals("x^2 - 4", -2, dg.doubleDegree(1, 0, -4)[1]);
    }
}

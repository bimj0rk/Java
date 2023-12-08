public class InsuranceTest {
    public static void main(String[] args){
        LifeInsurance lifeInsurance = new LifeInsurance("Mary", "Jane", "Hollywood Bvd");
        AccidentInsurance accidentInsurance = new AccidentInsurance("Peter", "Parker", "Queens Ave", "half-yearly");

        lifeInsurance.computeAmountPerPeriod();
        accidentInsurance.computeAmountPerPeriod();

        accidentInsurance.computeSum();
        lifeInsurance.computeSum();

        System.out.println(accidentInsurance);
        System.out.println(lifeInsurance);
    }
}

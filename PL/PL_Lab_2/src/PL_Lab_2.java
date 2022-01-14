public class PL_Lab_2 {

    public static void main(String[] args) {

        //1
        int number1 = 2;

        if(number1 >= 0) System.out.println("1. The number is positive");
        else System.out.println("1. The number is negative");

        //2
        int number2 = 7;

        if(number2 >= 0) {

            if(number2 % 2 == 0) System.out.println("2. The number is even");
            else System.out.println ("2. The number is odd");
        }

        //3
        String s = "i am first year student now";

        int aCounter = 0, eCounter = 0, iCounter = 0, oCounter = 0, uCounter = 0;

        for(int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);

            switch (currentLetter){
                case 'a': aCounter++; break;
                case 'e': eCounter++; break;
                case 'i': iCounter++; break;
                case 'o': oCounter++; break;
                case 'u': uCounter++; break;

            }
        }

        System.out.println("3. a appears " + aCounter + " times, e appears " + eCounter + " times, i appears " + iCounter
                + " times, o appears " + oCounter + " times and u appears " + uCounter + " times.");

    }

}
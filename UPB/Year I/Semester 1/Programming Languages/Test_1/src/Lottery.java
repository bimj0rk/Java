import java.util.Random;
import java.util.Scanner;

public class Lottery {

    //1
    public static boolean isWinner(int ticket[], int luckySeries[]){
        int counter = 0;
        for(int i = 0; i < 6; i++)
            if(ticket[i] == luckySeries[i]) counter++;

        if(counter == 6) return true;
        else return false;
    }

    //2
    public static int prizeSum(int ticket[], int luckySeries[]){
        int sum = 0, counter = 0;
        for(int i = 0; i < 6; i++)
            if(ticket[i] == luckySeries[i]) counter++;

        switch(counter){
            case 0:
                sum += 0;
                break;
            case 1:
                sum += 0;
                break;
            case 2:
                sum += 0;
                break;
            case 3:
                sum += 30;
                break;
            case 4:
                sum += 200;
                break;
            case 5:
                sum += 3000;
                break;
            case 6:
                sum += 10000;
                break;
        }

        return sum;
    }

    //3
    public static void probability(int totalTickets[][], int luckySeries[]){
        double probability, numberOfOccurences = 0;
        for(int k = 0; k < 6; k++){
            for(int i = 0; i < totalTickets.length; i++){
                for(int j = 0; j < 6; j++){
                    if(totalTickets[i][j] == luckySeries[k]) numberOfOccurences++;
                }
            }
            probability = numberOfOccurences / 49;
            System.out.println("The probability that the number " + luckySeries[k] + " is chosen is " + probability + "%");
            numberOfOccurences = 0;
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int ticket[] = new int[6], luckySeries[] = new int[6];

        for(int i = 0; i < 6; i++)
            luckySeries[i] = r.nextInt(48) + 1;

        System.out.println("Write your six numbers:");
        for(int i = 0; i < 6; i++) {
            ticket[i] = scan.nextInt();
            if(ticket[i] > 49){
                System.out.println("Number is bigger than 49! Try again");
                break;
            }
        }

        System.out.println("The lucky series of this day is:");
        for(int i = 0; i < 6; i++)
            System.out.print(luckySeries[i] + " ");

        System.out.println(" ");

        if(isWinner(ticket, luckySeries)) System.out.println("You won!");
        else System.out.println("You didn't win.");

        System.out.println("The amount of money you won is:");
        System.out.println(prizeSum(ticket, luckySeries));

        System.out.println("How many tickets are there?");
        int numberOfTickets = scan.nextInt();

        int totalTickets[][] = new int[numberOfTickets][6];

        for(int i = 0; i < 6; i++)
                totalTickets[0][i] = ticket[i];

        for(int i = 1; i < numberOfTickets; i++)
            for(int j = 0; j < 6; j++)
                totalTickets[i][j] = r.nextInt(48) + 1;

        for(int i = 0; i < numberOfTickets; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(totalTickets[i][j] + " ");
            }
            System.out.println(" ");
        }

        probability(totalTickets, luckySeries);
    }
}

package Jun17;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int numberOfDigit = 0;
        int totalSum = 0;
        int reverse = 0;



        while(number > 0){
            int rem = number % 10;
            numberOfDigit++;
            totalSum += rem;
            reverse = reverse*10 + rem;

            number = number/10;
        }

        System.out.println("Number of Digit: " + numberOfDigit);
        System.out.println("Total Sum: " + totalSum);
        System.out.println("Reverse: " + reverse);

    }
}

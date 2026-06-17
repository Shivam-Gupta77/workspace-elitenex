package Jun17;

import java.util.Scanner;

public class Arms {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        int originalNum = number;

        int sum = 0;

        while(number>0){
            int rem = number % 10;
            sum = sum + (rem * rem * rem);
            number = number / 10;
        }

        if(originalNum == sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }

    }
}

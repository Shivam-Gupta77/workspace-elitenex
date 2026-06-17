package Jun17;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start: ");
        int start = sc.nextInt();

        System.out.print("Enter End: ");
        int end = sc.nextInt();

        for(int i = start; end >= i; i++){
            boolean isPrime = true;

            for(int j = 2; j<i; j++){
                if(i % j == 0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i + ",");
            }
        }

    }
}

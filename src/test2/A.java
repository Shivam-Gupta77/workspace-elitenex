package test2;

import test.Test;

import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter year of exp: ");
        int exp = sc.nextInt();
        sc.nextLine();

        double finalSalary = 0.0;

        if(exp >= 5){
            double inc = salary * 0.15;
            finalSalary = salary + inc;
            System.out.println("Your final salary: " + finalSalary);
        }else{
            double inc = salary * 0.1;
            finalSalary = salary + inc;
            System.out.println("Your final salary: " + finalSalary);
        }

    }

    // total mark
    // avg
    // grade
    // pass or fail

    int evenSum(int lower, int upper){
        int sum = 0;
        for(int i = lower; upper > i; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    int oddSum(int lower, int upper){
        int sum = 0;
        for(int i = lower; upper > i; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }


}

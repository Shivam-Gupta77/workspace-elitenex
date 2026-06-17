package test;

import java.util.Scanner;

public class Test {

    String print(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    protected int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last Name: ");
        String lastName = sc.nextLine();

        Test test = new Test();
        System.out.println("Full name: " + test.print(firstName, lastName));

    }
}

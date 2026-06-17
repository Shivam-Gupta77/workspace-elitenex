package test;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args){
        String pin = "1234";
        int attempt = 5;
        String checkPin;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Pin: ");
            checkPin = sc.nextLine();

            attempt--;
        }while(attempt > 0 && !pin.equals(checkPin));

        if(pin.equals(checkPin)){
            System.out.println("login success");
        }else {
            System.out.println("invalid pin");
        }


//        while(attempt>0){
//            System.out.print("Enter your pin: ");
//            String checkPin = sc.nextLine();
//            if(pin.equals(checkPin)){
//                System.out.println("login success");
//            }else{
//                attempt--;
//                if(attempt != 0){
//                    System.out.println("Pin is wrong. attempt remaining: " + attempt);
//                }else{
//                    System.out.println("contact me.");
//                }
//            }
//        }

    }
}

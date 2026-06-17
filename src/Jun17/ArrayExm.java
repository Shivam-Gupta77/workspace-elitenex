package Jun17;

import java.util.Arrays;

public class ArrayExm {
    public static void main(String[] args){
        int[] arr = { 2, 5, 4, 7, 9, 91, 73, 21};
        System.out.println(Arrays.toString(arr));
      //  printPrime(arr);
        maxNMin(arr);
    }


    public static void maxNMin(int[] arr){
        int max = arr[0];
        int secondMax = arr[0];
        int min = arr[0];
        int secondMin = arr[0];

        for(int i: arr){
            if(i > max){
                if(secondMax < max){
                    secondMax = max;
                }
                max = i;
                System.out.println(secondMax);
            }
        }




        System.out.println("Max: " + max + " Min: " + min);
        System.out.println("Second Max: " + secondMax + " Second Min: " + secondMin);
    }

//    public static void printPrime(int[] arr){
//        int size = arr.length;
//        int sum = 0;
//        for(int i = 0; i<size; i++){
//            boolean isPrime = true;
//
//            for(int j = 2; j<arr[i]; j++){
//                if(arr[i] % j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if(isPrime){
//                System.out.println(arr[i] + ", ");
//                sum = sum + arr[i];
//            }
//        }
//        System.out.println("Total sum: " + sum);
//    }


}

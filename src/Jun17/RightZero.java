package Jun17;

public class RightZero {
    public static void main(String[] args){
        int[] arr = {12, 30, 0, 2, 0, 40, 21, 100, 0};
        int[] result = new int[arr.length];
        int pointer = 0;

        for(int i: arr){
            if(i != 0){
                result[pointer] = i;
                pointer++;
            }
        }
        // arr[i]=arr[i+1]
        
        for(int i: result){
            System.out.print(i+",");
        }
    }
}

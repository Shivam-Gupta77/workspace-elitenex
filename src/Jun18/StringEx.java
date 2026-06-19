package Jun18;

import java.util.Arrays;
import java.util.Random;

public class StringEx {
    public static void main(String[] args){
        System.out.println(largestValue("12.32.12", "12.65.12"));
    }


    public static int largestValue(String s1, String s2){
        s1 = s1.replace(".", "");
        s2 = s2.replace(".", "");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        return num1>num2 ? num1 : num2;
    }

    public static String findLongestWord(String sentance){
        String[] words = sentance.split(" ");
        String word = words[0];

        for(String w : words){
            if(w.length() > word.length()){
                word = w;
            }
        }
        return word;
    }

    public static boolean tokenValidation(String token){
        String pattern = "^[A-Z]{3}-\\d{4}-XYZ$";
        return token.matches(pattern);
    }

    public static StringBuilder stringWithNum(String sb){
        StringBuilder result = new StringBuilder();

        int len = sb.length();
        int count = 1;
        int i = 0;

        for(i = 0; i<len -1; i++){
            if(sb.charAt(i) == sb.charAt(i+1)){
                count++;

            }else{
                result.append(sb.charAt(i));
                result.append(count);
                count = 1;
            }

        }

        result.append(sb.charAt(i));
        result.append(count);

        return result;

    }

    public static boolean anagramOrNot(String word1, String word2){
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if(char1.length != char2.length){
            return false;
        }

        for(int i = 0; i < char1.length; i++){
            if(char1[i] != char2[i]){
                return false;
            }
        }

        return true;

    }

    public static void url(String sentence){
        System.out.println("https://" + sentence.replace(" ", "/"));
    }

    public static void masking(String number){
        number = number.replace("-", "");
        int len = number.length();
        System.out.println(len);
        int start = len - 4;
        String lastFour = number.substring(start, len);
        for(int i = 0; i<start; i++){
            System.out.print("*");
        }
        System.out.println(lastFour);
    }


    public static void findDomainName(String email){
        System.out.println(email.substring(email.indexOf('@') + 1));
    }

    // word count from caption
    public static int wordCount(String sentance){
        String[] words = sentance.split(" ");
        return words.length;
    }


    // return username from full name shvam gupta reutn shivam.gupta shiva23456
    public static void newUsername(String fullName){
        Random random = new Random();
        int id = 10 + random.nextInt(90);
        String[] arr = fullName.split(" ");

        String username = arr[0] + id;
        System.out.println("Your Username: " + username);

    }


    // password check 8 char strength it contains upper case and lower case and digit
    public static boolean checkPassword(String password){
        int len = password.length();
        char[] arr = password.toCharArray();
        boolean isContainsUpper = false;
        boolean isContainsLower = false;
        boolean isContainsDigit = false;

        for(Character c : arr){
            if(Character.isUpperCase(c)){
                isContainsUpper = true;
            } else if (Character.isLowerCase(c)) {
                isContainsLower = true;
            } else if (Character.isDigit(c)) {
                isContainsDigit = true;
            }
        }

        return len >= 8 && isContainsUpper && isContainsLower && isContainsDigit;
    }



    public static boolean validEmailOrNot(String email){

        int lastChar = email.length();
        int startChar = lastChar - 4;
        String dotCom = email.substring(startChar, lastChar);

        if(email.contains("@") && email.charAt(0) != '@'){
            return true;
        }

        if(dotCom.equals(".com")){
            return true;
        }
        return false;

    }

    public static String revByWord(String str){
        String[] arr = str.split(" ");
        int size = arr.length;
        String reverse = "";
        for(int i = size-1; i>=0; i--){
            reverse = reverse + arr[i] + " ";
        }
        return reverse;
    }

    public static String revByChar(String str){
        int size = str.length() - 1;
        String reverse = "";
        for(int i = size; i>=0; i--){
            reverse = reverse.concat(String.valueOf(str.charAt(i)));
        }
        return reverse;
    }
}

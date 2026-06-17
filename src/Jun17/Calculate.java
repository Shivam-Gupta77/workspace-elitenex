package Jun17;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculate cal = new Calculate();

        System.out.println(" Calculate Student Result");
        System.out.print("Enter 1 Subject Mark: ");
        double mark1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter 2 Subject Mark: ");
        double mark2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter 3 Subject Mark: ");
        double mark3 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter 4 Subject Mark: ");
        double mark4 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter 5 Subject Mark: ");
        double mark5 = sc.nextDouble();
        sc.nextLine();

        double totalMarks = cal.totalMarks(mark1, mark2, mark3, mark4, mark5);
        double average = cal.avg(mark1, mark2, mark3, mark4, mark5);
        String grade = cal.grade(mark1, mark2, mark3, mark4, mark5);
        String result = cal.passOrFail(mark1, mark2, mark3, mark4, mark5);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Score: " + average);
        System.out.println("Final Grade: " + grade);
        System.out.println("Final Result: " + result);
    }

    double totalMarks(double mark1, double mark2, double mark3, double mark4, double mark5){
        return mark1 + mark2 + mark3 + mark4 + mark5;
    }

    double avg(double mark1, double mark2, double mark3, double mark4, double mark5){
        return totalMarks(mark1, mark2, mark3, mark4, mark5) / 5;
    }

    String grade(double mark1, double mark2, double mark3, double mark4, double mark5){
        double avg = avg(mark1, mark2, mark3, mark4, mark5);
        if(avg >= 60){
            return "Grade A";
        } else if (avg >= 50) {
            return "Grade B";
        } else if(avg >= 40){
            return "Grade C";
        } else {
            return "Grade D";
        }
    }

    String passOrFail(double mark1, double mark2, double mark3, double mark4, double mark5){
        if(mark1 < 35 || mark2 < 35 || mark3 < 35 || mark4 < 35 || mark5 < 35){
            return "fail";
        }else {
            return "pass";
        }
    }





}

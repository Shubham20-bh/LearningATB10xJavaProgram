package JavaProgram;

import java.util.Scanner;

public class Lab14FindGradesBasedOnMarks {
    public static void main(String[] args) {
        //10) Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
//        input - 0 to 100
//        output - grades
//        logic - if input >=90 a
//        if input >=80 && input <=89 -b
//        if input >=70 && input <=79 -c
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Marks");
        int inputMarks = myObj.nextInt();
        if (inputMarks>100){
            System.out.println("Invalid Input");
        }
        if (inputMarks>=90 && inputMarks<=100){
            System.out.println("Secured Grade A+");
        } else if (inputMarks>=80 && inputMarks<=89) {
            System.out.println("Secured Grade A");
        } else if (inputMarks>=70 && inputMarks<=79) {
            System.out.println("Secured Grade B");
        } else if (inputMarks>=60 && inputMarks<=69) {
            System.out.println("Secured Grade C");
        }else if (inputMarks>=50&& inputMarks<=59) {
            System.out.println("Secured Grade D");
        }else if (inputMarks>=40&& inputMarks<=49) {
            System.out.println("Secured Grade E");
        }else{
            System.out.println("Fail");
        }

    }
}

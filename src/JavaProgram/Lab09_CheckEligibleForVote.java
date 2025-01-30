package JavaProgram;

import java.util.Scanner;

public class Lab09_CheckEligibleForVote {
    public static void main(String[] args) {
//
//        5) Check if a Person is Eligible to Vote (Age Check).
//        input - number 19
//        output - eligible to vote
//        logic - input>=18
//        edge cases
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number1");
        float input = myObj.nextFloat();

        if (input >= 18) {
            System.out.println("person eligible to Vote " + input);
        } else {
            System.out.println("person is not eligible to Vote " + input);
        }
    }
}

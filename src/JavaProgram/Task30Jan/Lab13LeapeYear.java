package JavaProgram.Task30Jan;

import java.util.Scanner;

public class Lab13LeapeYear {
    public static void main(String[] args) {
//        9) Check if a Year is a Leap Year.
//        input year 365 or 366
//          output  366
//        LOGIC INPUT==365 OR Input >366.0
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number1");
        float input = myObj.nextFloat();
      //  float input=366.01;
                if (input==365 || input >366.0){
                    System.out.println("Its not a leap year "+ input);
                }else {
                    System.out.println("Its a leap year "+ input);
                }

    }
}

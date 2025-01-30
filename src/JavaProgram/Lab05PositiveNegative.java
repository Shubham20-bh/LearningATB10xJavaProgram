package JavaProgram;

import java.util.Scanner;

public class Lab05PositiveNegative {
    public static void main(String[] args) {

//1) Check if a Number is Positive or Negative.
        //input int/float/double,
        //output positive/Negative
//        logic - InputNumber >= 0.00 --> POSITIVE-0.00000
//        edge cases -

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number");
        //0int Number = myObj.nextInt();
        float Number = myObj.nextFloat();
        if (Number >= 0) {
            System.out.println("Number is positive--> " + Number);
        } else {
            System.out.println("Number is negative--> " + Number);
        }


    }
}





















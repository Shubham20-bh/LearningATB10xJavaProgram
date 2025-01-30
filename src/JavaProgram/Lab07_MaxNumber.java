package JavaProgram;

import java.util.Scanner;

public class Lab07_MaxNumber {
    public static void main(String[] args) {
//        3) Find the Maximum of Two Numbers.
//        input - 1,3,4,6,8,9,10
//        output -10
//        logic - num1>=num2 or num--num1 is max else num2
//        edge cases -- if num1 = num2, float. double

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number1");
        int num1 = myObj.nextInt();
        System.out.println("Enter Number2");
        int num2 = myObj.nextInt();


        if(num1>num2){
            System.out.println("Maximum number is  "+num1);
        }else{
            System.out.println("Maximum number is  "+num2);
        }
    }
}

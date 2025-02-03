package JavaProgram;

import java.util.Scanner;

public class Lab15Number_is_Prime {
    public static void main(String[] args) {
//        input number
//        output prime ??
//        logic !(number%2==0)
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number");
        int inputNumber = myObj.nextInt();
        if (!(inputNumber%2==0)){
            System.out.println("Number is prime");
        }else {
            System.out.println("it is a not prime Number");
        }

    }
}

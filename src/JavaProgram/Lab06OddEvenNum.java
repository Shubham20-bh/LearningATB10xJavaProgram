package JavaProgram;

import java.util.Scanner;

public class Lab06OddEvenNum {
    public static void main(String[] args) {
//        2)Check if a Number is Even or Odd.
//        input number 1,2 ,3,4
//        output odd  even number
//        logic m%2 ==0 --> 'even' else 'odd'
//        edge cases --> float --
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number");
        int num= myObj.nextInt();
        if (num%2 ==0){
            System.out.println("Number is even --> even"+ num);


        }else{
            System.out.println("Number is odd--> "+ num);
        }
    }
}

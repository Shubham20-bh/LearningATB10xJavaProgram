package JavaProgram;

import java.util.Scanner;

public class Lab20_ElectricityBillCalculation {
    public static void main(String[] args) {
//        18 )  Electricity Bill Calculation (Based on Units Consumed)

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter units");
        double units = myObj.nextDouble();
        if (units <= 100) {
            double finalSumTill100 = 0;

            finalSumTill100 = (100 * .5);
            System.out.println("Bill for consume units is " + finalSumTill100);
        }
        if (units > 300) {

            double finalSumTill301 = 0;
            finalSumTill301 = (units * 1.2);
            System.out.println("Bill for consume units is " + finalSumTill301);
        }

        if (units <= 200 && units > 100) {
            double finalSumTill100 = 0;

            finalSumTill100 = (100 * .5);
            double remSum = units - 100;
            double remSumTill200 = (remSum * .75);
            double FinalBill = (finalSumTill100 + remSumTill200);
            System.out.println("Bill for consume units is " + FinalBill);
        }
        if (units <= 300 && units > 200) {
            double finalSumTill100 = 0;
            double finalSumTill200 = 0;
            double remSumTill300 = 0;
            finalSumTill100 = (100 * .5);
            finalSumTill200 = (100 * .75);
            double remSum = units - 200;
            remSumTill300 = (remSum * 1.2);
            double FinalBill = (finalSumTill100 + finalSumTill200 + remSumTill300);
            System.out.println("Bill for consume units is " + FinalBill);
        }


    }

}







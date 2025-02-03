package JavaProgram.Task30Jan;

public class Lab17_ATM_Simulation {
    public static void main(String[] args) {
//        Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
//        logic (age >=18 && age =<80 && salary >= 30000 && creditSocre >= 650 && creditSocre <= 850)
        int age = 19;
        double salary = 30000;
        int creditSocre =700;


        if (age >18 && (age <=80) && (salary >= 30000) && (creditSocre >= 650) && (creditSocre <= 850)){
            System.out.println("Applicant is eligible for Loan");

        }else {
            System.out.println("Applicant is not eligible for Loan");
        }

    }
}

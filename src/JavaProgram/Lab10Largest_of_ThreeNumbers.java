package JavaProgram;

public class Lab10Largest_of_ThreeNumbers {
    public static void main(String[] args) {
//        6) Find the Largest of Three Numbers.
//        input - 1,5,99
//        output - 99
//        logic - a>=b && a>=c , b>=c
        double a =111.99;
        double b =9.00;
        double c=99.11;

        if (a>=b && a>=c){
            System.out.println("maximum number is "+a);
        } else if (b>=c) {
            System.out.println("maximum number is "+b);

        }else {
            System.out.println("maximum number is "+c);
        }
    }
}

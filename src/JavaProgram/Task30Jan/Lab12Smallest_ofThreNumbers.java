package JavaProgram.Task30Jan;

public class Lab12Smallest_ofThreNumbers {
    public static void main(String[] args) {
//        logic a<=b a<=c - a
//        b<=c -b
//        else c
        double a=100;
        double b=200;
        double c=300;

        if (a<=b && a<=c){
            System.out.println("minimum number is "+a);
        } else if (b<=c) {
            System.out.println("minimum number is "+b);
        }else {
            System.out.println("minimum number is "+c);
        }
    }
}

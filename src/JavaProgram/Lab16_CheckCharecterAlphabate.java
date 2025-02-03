package JavaProgram;

public class Lab16_CheckCharecterAlphabate {
    public static void main(String[] args) {
//        input # ~ * A
//        output A
//        Logic input >= A || INPUT<=Z

        char input = 'd';
        if (input >= 'A' && input<= 'Z' || input >= 'a' && input<= 'z'){
            System.out.println("Alphabate");
        }else{
            System.out.println("Given input is Not an Alphabate");
        }
    }
}

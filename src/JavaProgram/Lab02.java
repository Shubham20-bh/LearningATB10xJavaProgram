package JavaProgram;

public class Lab02 {
    public static void main(String[] args) {
        Lab02 obj = new Lab02();
        obj.logic_1();
        obj.logic_2();
        obj.logic_3();

    }

    public  void logic_1(){
        int m=10;
        int n=5;
        //swap 2 numbers logic 1
        int temp =m;
        m=n;
        n = temp;
        System.out.println("m :"+m + " n :"+n);
    }
    public  void logic_2(){
        int x=20;
        int y=40;

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Swapped numbers x is : " + x + " y is :"+ y);
    }
    public  void logic_3(){
        int a= 11;
        int b=22;
        //swap two numbers
        //arithmatic operation
        a = (a+b) - (b=a); //a=22

        System.out.println("after swapping a is:"+a + " b is :" +b);

    }

}

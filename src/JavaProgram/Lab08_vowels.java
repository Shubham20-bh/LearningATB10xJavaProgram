package JavaProgram;

import java.util.Scanner;

public class Lab08_vowels
{
    public static void main(String[] args) {
//        Check if a Character is a Vowel or Consonant.
//        input -- a
//        output -- a
//        logic -- input == a,e,i,o,u
//        edge cases

        char input='x';
        if (input == 'a' || input == 'e' || input =='i' ||input == 'o' ||input == 'u' ){
            System.out.println("the input charecter is vowel : "+input);

        }else {
            System.out.println("the input charecter is constant : "+input);
        }

/*char input='u';


        char c1 ='a';

        char c2 ='e';
        char c3 ='i';
        char c4 ='o';
        char c5 ='u';
        switch(input) {
            case c1:
                // code block
                break;
            case c2:
                // code block
                break;
            case c3:
                // code block
                break;
           *//* case c4:
                // code block
                break;
            case c5:
                // code block
                break;*//*

            default:
                // code block
                System.out.println("Constant "+ input);*/
        }
    }


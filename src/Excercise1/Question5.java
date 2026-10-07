package Excercise1;

import java.util.Scanner;

class ageVerification{

    public void verification(int a){
        if(a > 18){
            System.out.println("Congratulations!..You are eligible to vote.");
        }else{
            System.out.println("Sorry ! you are not eligible to vote.");
        }
    }

}

public class Question5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        ageVerification a = new ageVerification();
        a.verification(age);



    }
}

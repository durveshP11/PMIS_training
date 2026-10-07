package Excercise1;


import java.util.Scanner;

class greatestOftwo{

    public void Greatest(int n1 ,int n2){
        if(n1 > n2){
            System.out.println("Number 1 is the greatest : " + " " + n1);
        }else{
            System.out.println("Number 2 is the greatest : "+ " " + n2);
        }
    }
}
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int num2 = sc.nextInt();

        greatestOftwo g = new greatestOftwo();
        g.Greatest(num1,num2);


    }
}

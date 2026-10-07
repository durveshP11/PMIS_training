package Excercise1;


import java.util.Scanner;

class greatestCommonDivisor{
    int gcd =1;
    public void gcd(int a,int b,int n){
        for(int i=1;i<=n;i++) {
            if (a %i == 0 && b%i == 0){
                     gcd = i;
            }

        }
        System.out.println("The Greatest common divisors for the given number are :" + " "+gcd );

    }
}

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1st :");
        int a = sc.nextInt();
        System.out.println("Enter the number 2nd :");
        int b = sc.nextInt();
        System.out.println("Enter the range till which you have to find the GCD of the given numbers : ");
        int n = sc.nextInt();
        greatestCommonDivisor gd = new greatestCommonDivisor();
        gd.gcd(a,b,n);
    }
}

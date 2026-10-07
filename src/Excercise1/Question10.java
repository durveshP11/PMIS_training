package Excercise1;


import java.util.Scanner;

class Fibonacci{
    int a=0;
    int b =1;

    public void fibo(int n){
        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want the fibonacci series");
        int n = sc.nextInt();
        Fibonacci f = new Fibonacci();
        f.fibo(n);
    }
}

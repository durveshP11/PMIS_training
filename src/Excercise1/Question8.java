package Excercise1;


import java.util.Scanner;

class raisedPowerLogical{
    int result =1;
    public void powerLogic(int x,int n){
        for(int i=1;i<=n;i++){
            result = result*x;
        }
        System.out.println("The value for "+x +" "+"to the power "+ n +" "+ "is "+" "+ result);
    }
}

class raisedPowerInbuilt{
    public void power(int x,int n){
        int num = (int)Math.pow(x,n);
        System.out.println("The value for "+x +" "+"to the power "+ n +" "+" "+"is"+" "+ num);
    }
}
public class Question8 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base x :");
        int x = sc.nextInt();

        System.out.println("Enter the power n :");
        int n = sc.nextInt();

        raisedPowerInbuilt rp = new raisedPowerInbuilt();
        rp.power(x,n);

        raisedPowerLogical rl = new raisedPowerLogical();
        rl.powerLogic(x,n);
    }
}

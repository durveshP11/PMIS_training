package Excercise1;

import java.util.Scanner;

class Sum{

    void sumOfodd(int n){
            int oddsum = 0;
        for (int i=1;i<=n;i++){
            if(i%2 != 0 ){
                oddsum +=i;
            }
        }
        System.out.println("The sum of all odd numbers are :" + oddsum);
    }


}

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till where you want the sum of odd numbers : ");
        int num = sc.nextInt();
        Sum s = new Sum();
        s.sumOfodd(num);
    }
}

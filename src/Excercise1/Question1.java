package Excercise1;

import java.util.Scanner;

class Average{

    public void avg(float a ,float b ,float c){
        float result = (a+b+c)/3;
        System.out.println("The average of 3 numbers are :" + result);

    }
}

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1,2,3");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        Average a = new Average();
        a.avg(num1, num2, num3);

    }
}

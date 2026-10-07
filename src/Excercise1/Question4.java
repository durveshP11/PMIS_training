package Excercise1;


import java.util.Scanner;

class circumferenceOfcircle{

    static final float pi = 3.14159f;
    public void circumference(float rad){
        float res = 2*pi*rad;
        System.out.println("The Circumference of the circle will be :" + res);
    }
}
public class Question4 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        float r = sc.nextFloat();
        circumferenceOfcircle c = new circumferenceOfcircle();
        c.circumference(r);

    }
}

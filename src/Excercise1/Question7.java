package Excercise1;


import java.util.Scanner;

class numberCount{
    int positives = 0;
    int negatives = 0;
    int zeros = 0;
    public void count(int num){

        if(num > 0){
            positives++;
        }else if(num < 0){
            negatives++;
        }else{
            zeros++;
        }
    }
}
public class Question7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to continue. Type exit to end");
        numberCount obj = new numberCount();

        while(true) {
                  String input = sc.nextLine();

                  if(input.equalsIgnoreCase("exit")){
                      break;
                  }else{
                      int num = Integer.parseInt(input);
                      obj.count(num);

                  }

        }
        System.out.println("The total number of positive numbers are : "+ " " + obj.positives);
        System.out.println("The total number of negative numbers are : "+ " " + obj.negatives);
        System.out.println("The total number of Zero's numbers are : "+ " "+ obj.zeros);
    }
}

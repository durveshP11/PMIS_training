package Excercise1;


class infiniteLoop{
    public void infinite(){
        do{
            System.out.println("Hello");
        }while(true);
    }
}
public class Question6 {
    public static void main(String[] args) {
        infiniteLoop i = new infiniteLoop();
        i.infinite();
    }
}

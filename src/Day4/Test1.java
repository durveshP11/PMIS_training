package Day4;

class Car{
    String color;
    String brand;
    int speed;

    Car(String color , String brand,int speed){

        this.color = color;
        this.brand = brand;
        this.speed = speed;

    }
    void carInfo(){
        System.out.println("The car is of brand "+" "+brand + " "+ "of color" + " " +color + " "+"and has speed of" + " "+ speed + " " + "kmph per/hr");
    }

    void speedIncrement(int incr){

        int or_speed = speed;
        speed+=incr;

        System.out.println("The orignal speed of the Car is : "+ " "+ or_speed +" " + "kmph per/hr");
        System.out.println("The incremented speed of the car is : "+ " " + speed + " " + "kmph per/hr");

    }

}
public class Test1 {
    public static void main(String[] args) {

        Car c1 = new Car("yellow","lamborgini",250);
        c1.carInfo();
        c1.speedIncrement(50);

    }
}

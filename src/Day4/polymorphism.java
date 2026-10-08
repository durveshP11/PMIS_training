package Day4;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Animal pet1 = new Dog();
        pet1.makeSound();
        Animal pet2 = new Cat();
        pet2.makeSound();
        Animal pet3 = new Animal();
        pet3.makeSound();
    }
}

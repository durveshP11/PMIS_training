package Day10;

/*
        No parameters: () -> syso("Hi")
        One parameter: x -> x * 2
        two parameters: (a,b) -> a + b;
        (int a, int b) -> a + b

Built in function interfaces


Predicate<T> test(T) T -> t/f 1/0
Function<T,R> : apply(t) ; T ->R
*/


import java.util.function.Function;


class lambda{
    public static void main(String[] args){
        Function<String, Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("Java"));
        System.out.println(getLength.apply("John"));
    }
}
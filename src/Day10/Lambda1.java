package Day10;
@FunctionalInterface
interface Greeter1 {
    void greet(String name);
}
public class Lambda1 {
    public static void main(String[] args){
        Greeter1 g = name -> System.out.println("Hello, " + name);
        g.greet( "Durvesh");
    }
}

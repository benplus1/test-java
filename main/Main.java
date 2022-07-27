package main;
import change.Divider;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Divider d = new Divider();
        System.out.println(d.divide(3, 2));

        Multiplier m = new Multiplier();

        System.out.println(m.multiply(5, 6));
    }
}

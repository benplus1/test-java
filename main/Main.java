package main;
import change.Divider;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Divider d = new Divider();
        System.out.println(d.divide(3, 2));

        Adder a = new Adder();
        System.out.println(a.add(3, 5, 7));
    }
}

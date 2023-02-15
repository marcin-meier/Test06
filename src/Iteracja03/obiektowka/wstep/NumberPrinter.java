package Iteracja03.obiektowka.wstep;

public class NumberPrinter {

    public void printNumber(int a) {
        System.out.println(a);
    }

    public void printNumber(int a, int b) {
        printNumber(a);
        System.out.println(b);
    }

    public void printNumber(int a, int b, int c) {
        printNumber(a, b);
        System.out.println(c);
    }

}

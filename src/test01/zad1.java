package test01;

public class zad1 {

    public static void main(String[] args) {
//        Stworz petle która dla wszystkich liczb dwucyfrowych wypisze te, których cyfra dziesiątek jest większa niż cyfra jedności. np: 91 bo 9 > 1.
//        (W tym zadaniu najlepiej wykorzystać dzielenie i dzielenie z resztą!)

        int min = 10;
        int max = 100;

        for (int i = min; i < max; i++) {
            if ((i / min) > i % min)
                System.out.print(i + " ");
        }
    }
}
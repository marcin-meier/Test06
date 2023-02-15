package test03;

//b) Następnie:
//- znajdź figurę z największym obwodem
//- znajdź figurę z największym polem

//c) for(Figura f : figury) {
//        if(f.equals(Figura.stworzProstokat(10,20)){
//        System.out.println("tu powinno wejsc");

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> listPerimeter = new ArrayList<>();

        Shape[] figury = {Shape.stworzKwadrat(5), Shape.stworzKolo(10), Shape.stworzProstokat(10, 200), Shape.stworzKwadrat(15)};
        int i = 1;
        for (Shape f : figury) {
            System.out.println("Figura nr : " + i++ + " " + f);
            listPerimeter.add(new Shape(f.getBok1(), f.getTyp()));
        }


        for(Shape k : listPerimeter)
            System.out.println(k.pole());


        int x = listPerimeter.get(0).pole();
        String k = listPerimeter.get(0).getTyp();
        for (Shape f : listPerimeter) {
            if (f.pole() > x) {
                x = f.pole();
                k = f.getTyp();
            }
        }
        System.out.println("Największe pole ma " + k + " z polem równym " + x);


//        System.out.println(figury[0].obwod());
//        System.out.println(figury[1].obwod());
//        System.out.println(figury[2].obwod());
//
//        System.out.println(figury[0].pole());
//        System.out.println(figury[1].pole());
//        System.out.println(figury[2].pole());


//        Kwadrat kw = new Kwadrat(5);
//        System.out.println(kw.obwod());
//        System.out.println(kw.pole());
//
//        Prostokat prost = new Prostokat(3,2);
//        System.out.println(prost.pole());
//        System.out.println(prost.obwod());
//
//        Kolo circle = new Kolo(5);
//        System.out.println(circle.pole());
//        System.out.println(circle.obwod());


//        Shape Kwadrat = new Shape(3,3,"Kwadrat");
//        System.out.println(Kwadrat.poleProstokąta());
//        Shape kolo = new Shape(4, "kolo");
//        System.out.println(kolo.poleKola());

    }
}

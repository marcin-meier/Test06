package test02.zad1;

import java.util.ArrayList;
import java.util.List;

public class Zad1 {
    public static void main(String[] args) {

        List<Figura> polaIObwodyFigur = new ArrayList<>();

        Figura[] figury = {Figura.stworzKwadrat(10), Figura.stworzKolo(10), Figura.stworzProstokat(10, 20), Figura.stworzKwadrat(15)};
        for (Figura f : figury) {
            System.out.println(f);
            polaIObwodyFigur.add(f);
        }

        System.out.println();

        double poleMax = polaIObwodyFigur.get(0).obliczPole();
        String poleMaxname = polaIObwodyFigur.get(0).toString();

        double obwodMax = polaIObwodyFigur.get(0).obliczObwod();
        String obwodMaxname = polaIObwodyFigur.get(0).toString();

        for (Figura f : polaIObwodyFigur)
            if (f.obliczPole() > poleMax) {
                poleMax = f.obliczPole();
                poleMaxname = f.toString();
                obwodMax = f.obliczObwod();
                obwodMaxname = f.toString();
            }
        System.out.println(poleMaxname + " ma największe pole wynoszące " + poleMax);
        System.out.println(obwodMaxname + " ma największy obwód wynoszący " + obwodMax);


        System.out.println();
        for (Figura f : figury) {
            if (f.equals(Figura.stworzProstokat(10, 20))) {
                System.out.println("tu powinno wejsc");
            }
        }
    }
}

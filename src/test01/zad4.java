package test01;

import java.util.Arrays;

public class zad4 {
    public static  void main(String[] args) {
//        Stworz sobie tablice 10-20 imion
//        Następnie :
//        - znajdz najdluzsze oraz najkrotsze imie
//        - wypisz ilosc imion zenskich (to takie które się kończą na literke "a")
//        - jaki % calości stanowią imiona żeńskie

        String[] name = {"adam", "ala", "ula", "ola", "magdalena", "monika", "marcin", "kamil", "romuald", "ania", "jarek", "sebastian", "oliwia", "maciej", "olga", "julia", "weronika"};

//        String Min = "";
        String[] min = new String[name.length];
        String Max = "";
        String shortest = name[0];
        String[] max = new String[name.length];
        int female = 0;

        for (int i = 0; i < name.length; i++) {
            if (name[i].length() > Max.length()) {
                Max = name[i];
            }
            if (name[i].length() < shortest.length()) {
                shortest = name[i];
            }
            if (name[i].endsWith("a")) {
                female++;
            }
        }
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() == shortest.length())
                min[i] = name[i];
            if ((name[i].length() == Max.length()))
                max[i] = name[i];
        }
        System.out.print("Najkrótsze imię/imiona : ");
        for (int i = 0; i < name.length; i++) {
            if (min[i] != null) {
                System.out.print(min[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Najdłuższe imię/imiona : ");
        for (int i = 0; i < name.length; i++) {
            if (max[i] != null)
                System.out.print(max[i] + " ");
        }
        System.out.println();
        System.out.println("Ilość żeńskich imion : " + female);
        System.out.println("Ilość imion ogółem : " + name.length);
        System.out.println("Udział żeńskich imion wynosi : " + (float) female / name.length * 100 + "%");
    }
}










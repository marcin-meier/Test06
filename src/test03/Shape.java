package test03;

public class Shape {


    private int bok1;
    private int bok2;
    private String typ;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getBok1() {
        return bok1;
    }

    public void setBok1(int bok1) {
        this.bok1 = bok1;
    }

    public int getBok2() {
        return bok2;
    }

    public void setBok2(int bok2) {
        this.bok2 = bok2;
    }

    Shape(int bok1, int bok2, String typ) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.typ = typ;
    }

    Shape(int bok1, String typ) {
        this.bok1 = bok1;
        this.typ = typ;
    }




    public int pole(){
        if (typ.equals("Kwadrat"))
            return this.bok1*this.bok1;
        else if (typ.equals("Prostokat"))
            return this.bok1*this.bok2;
        else if (typ.equals("Kolo"))
            return this.bok1*this.bok1*3;
        else
            return Integer.parseInt("nienznany typ");
    }

    public int obwod(){
        if (typ.equals("Kwadrat"))
            return this.bok1*4;
        else if (typ.equals("Prostokat"))
            return this.bok1*2+this.bok2*2;
        else if (typ.equals("Kolo"))
            return this.bok1*2*3;
         else
             return Integer.parseInt("Nieznany typ");
    }



    public static Shape stworzKwadrat(int bok1) {
        return new Shape(bok1, "Kwadrat");
    }

    public static Shape stworzKolo(int bok1) {
        return new Shape(bok1, "Kolo");
    }

    public static Shape stworzProstokat(int bok1, int bok2) {
        return new Shape(bok1, bok2, "Prostokat");
    }






    @Override
    public String toString() {
        switch (typ) {
            case "Kwadrat":
                return "Kwadrat o boku " + bok1 + ".";
            case "Kolo":
                return "Kolo o promieniu " + bok1 + ".";
            case "Prostokat":
                return "Prostokat o bokach " + bok1 + "x" + bok2 + ".";
            default:
                return "Nieznany typ";
        }
    }
}



